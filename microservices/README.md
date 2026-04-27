# Mikroservis Mimarisi

Bu proje, Spring Boot ve Spring Cloud kullanılarak gerçek hayat senaryosuna uygun bir e-ticaret mikroservis mimarisinin geliştirilmesini kapsamaktadır.

## Mimari Genel Bakış

```
  ┌──────────────────┐   ┌──────────────────┐
  │ Discovery Server │   │  Config Server   │
  │  (Eureka)        │   │ (Spring Cloud)   │
  └────────┬─────────┘   └────────┬─────────┘
           │  Register & Discover  │ Merkezi config
           └──────────┬────────────┘
                      │
             ┌────────▼────────┐
             │   API Gateway   │  ← Tek giriş noktası
             └────────┬────────┘
                      │
     ┌────────────────┼────────────────┐
     │                │                │
┌────▼─────┐  ┌───────▼──────┐  ┌─────▼────────┐
│user-svc  │  │shopping-cart │  │order-service │
└──────────┘  │   -service   │  └─────┬────────┘
              └──────────────┘        │ RabbitMQ
                                ┌─────▼────────┐
                                │stock-service │
                                └──────────────┘
```

## Servisler

### Discovery Server
* Netflix Eureka Server
* `@EnableEurekaServer` anotasyonu
* Tüm servislerin kayıt ve keşif merkezi
* Servis sağlığı izleme

### Config Server
* Spring Cloud Config Server
* `@EnableConfigServer` anotasyonu
* `@EnableDiscoveryClient` — Eureka'ya kayıt
* Tüm servislerin konfigürasyonunu merkezi olarak yönetme

### API Gateway
* Spring Cloud Gateway
* `@EnableDiscoveryClient` — Eureka'ya kayıt
* Tüm servislere tek giriş noktası (Single Entry Point)
* Cross-Origin (CORS) yapılandırması

### User Service
* Kullanıcı kayıt (`POST /api/user/signup`) ve giriş (`POST /api/user/signin`)
* JWT tabanlı kimlik doğrulama
* `JwtResponse` ile token dönüşü
* Kullanıcı güncelleme (`PUT /api/user/update/{userId}`)
* Kullanıcı silme (`DELETE /api/user/delete/{userId}`)

### Shopping Cart Service
* Sepet oluşturma (`POST /api/shopping-cart`)
* Ürün ekleme (`POST /api/shopping-cart/{id}`)
* Ürün silme (`DELETE /api/shopping-cart/{id}/products/{productId}`)
* Toplam fiyat hesaplama (`GET /api/shopping-cart/totalprice/{id}`)
* i18n desteği — `Accept-Language` header ile lokalize sepet
* Sepet listeleme ve silme endpoint'leri

### Order Service
* Sipariş oluşturma (`POST`) — SAGA başlatıcı
* `OrderStatus`: CREATED, CONFIRMED, REJECTED
* `OrderDetails` (isim, adres, şehir, ülke, telefon, email)
* `OrderItem` — sipariş kalemleri
* RabbitMQ ile `StockReserveRequestedEvent` yayınlama
* `PaymentCardStore` — kart bilgisini RAM'de tutma (SAGA için)
* Spring `ApplicationEventPublisher` ile iç event sistemi
* `StockServiceClient` & `PaymentServiceClient` — Feign Client

### Stock Service
* `ProductStock` entity — stok takibi
* `StockDomainService` — stok azaltma / artırma işlemleri
* `StockSagaHandler` (SAGA Choreography):
  * `StockReserveRequestedEvent` dinleme (`@RabbitListener`)
  * Stok yeterliyse → `StockReservedEvent` yayınlama
  * Stok yetersizse → `StockRejectedEvent` yayınlama
* `StockInitDataRunner` — başlangıç stok verisi yükleme
* `StockController` — manuel stok sorgulama & güncelleme

### Product Service
* Ürün entity ve çevirileri (`ProductTranslation`)
* `ProductRepository` & `ProductTranslationRepository`
* Çok dilli ürün desteği

## Tasarım Desenleri

### SAGA Pattern (Choreography)
* Dağıtık işlem yönetimi için SAGA Choreography deseni
* Order → Stock → Payment akışı
* RabbitMQ event'leri ile servisler arası iletişim
* Compensating Transaction (telafi işlemi) desteği

### Keycloak
* Kimlik ve erişim yönetimi (Identity & Access Management)
* Bootcamp kapsamında incelenen Keycloak entegrasyon dökümanı

### Mikroservis Design Pattern PDF
* Bootcamp kapsamında incelenen mikroservis tasarım desenleri dökümanı

## Teknolojiler
* Java 21
* Spring Boot
* Spring Cloud Gateway
* Spring Cloud Config
* Netflix Eureka (Service Discovery)
* Spring AMQP (RabbitMQ)
* OpenFeign (Feign Client)
* Spring Data JPA
* PostgreSQL
* Maven
* IntelliJ IDEA
