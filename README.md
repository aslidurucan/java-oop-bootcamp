# N11 TalentHub Backend Bootcamp
Source codes written as part of the N11 TalentHub Backend Bootcamp, a collaboration between patika.dev and n11.

## Topics Covered

### Day 1 - OOP Basics
* Class & Object
* Fields & Methods
* Inheritance (extends)
* Interface (implements)

### Day 2 - OOP Advanced
* Constructor
* Composition
* Array
* Abstract Class
* Method Overloading
* Method Overriding & super()
* ArrayList (Collections)
* SOLID - Dependency Inversion Principle

### Day 3 - Reflection, Annotation, AOP & Spring Boot
* Reflection API
* Custom Annotations
* AOP (Aspect Oriented Programming) - Before, After, AfterReturning
* Spring Boot - Layered Architecture
* Spring Data JPA
* PostgreSQL Integration
* RESTful API

### Day 4 - Spring Security & JWT Authentication
* JWT (JSON Web Token) - Structure & Lifecycle
  * Header, Payload, Signature
  * Base64URL encoding
  * Registered Claims (sub, iss, iat, exp)
* Spring Security
  * SecurityFilterChain configuration
  * Filter chain & OncePerRequestFilter
  * AuthenticationManager & UserDetailsService
  * BCrypt password encoding
* Stateless Authentication
  * Session vs Token based auth
  * STATELESS session management
* Custom Components
  * JwtTokenFilter
  * TokenManager
  * WebSecurityConfiguration
* Java Collections
  * HashMap internals & hash function
  * TreeMap & Red-Black Tree algorithm
  * O(1) vs O(log n) complexity

### Day 5 - RabbitMQ & Mesaj Kuyruğu
* RabbitMQ temelleri — Queue, Exchange, Routing Key, Binding
* Direct Exchange yapılandırması
* RabbitMQProducer — `convertAndSend()` ile JSON mesaj gönderimi
* RabbitMQConsumer — `@RabbitListener` ile kuyruk dinleme
* Jackson2JsonMessageConverter — nesne ↔ JSON dönüşümü
* Discovery Server (Netflix Eureka) — servis kayıt & keşif
* `@EnableEurekaServer` anotasyonu

### Day 6 - Mikroservis Mimarisi Temelleri
* Mikroservis mimarisi kavramları
* API Gateway — tek giriş noktası (Single Entry Point)
* Spring Cloud Gateway & `@EnableDiscoveryClient`
* Shopping Cart Service
  * CRUD endpoint'leri (oluştur, ekle, sil, listele)
  * i18n desteği — `Accept-Language` header ile lokalizasyon
  * Toplam fiyat hesaplama
* Keycloak — kimlik ve erişim yönetimi dökümanı

### Day 7 - İleri Mikroservis & SAGA Pattern
* User Service — kayıt, giriş, JWT token, CRUD
* Stock Service
  * `ProductStock` entity & stok yönetimi
  * `StockDomainService` — stok azaltma/artırma
  * `StockController` — REST API endpoint'leri
  * `StockInitDataRunner` — başlangıç veri yükleyici
* Order Service
  * Sipariş oluşturma ve `OrderStatus` yönetimi
  * `OrderDetails` & `OrderItem` entity'leri
  * `PaymentCardStore` — kart bilgisini RAM'de tutma
* SAGA Pattern (Choreography)
  * Dağıtık işlem yönetimi
  * `StockReserveRequestedEvent` → `StockReservedEvent` / `StockRejectedEvent`
  * RabbitMQ event'leri ile servisler arası iletişim
* Microservice Design Pattern PDF incelemesi

## Technologies
* Java 21
* Spring Boot
* Spring Security
* Spring Cloud Gateway
* Netflix Eureka (Service Discovery)
* Spring AMQP (RabbitMQ)
* JWT (jjwt 0.10.7)
* PostgreSQL
* Maven
* IntelliJ IDEA
