# RabbitMQ ile Mesajlaşma

Bu proje, Spring Boot ile RabbitMQ kullanılarak Producer-Consumer mesajlaşma mimarisinin uygulanmasını göstermektedir.

## Konu Başlıkları

### RabbitMQ Temelleri
* Message Broker kavramı
* Queue (Kuyruk) yapısı
* Exchange türleri
  * Direct Exchange
* Routing Key & Binding mekanizması
* Asenkron mesajlaşma

### RabbitMQConfiguration
* `Queue` tanımı (`@Bean`)
* `DirectExchange` tanımı
* `Binding` — queue'yu exchange'e routing key ile bağlama
* `Jackson2JsonMessageConverter` — JSON mesaj dönüşümü
* `AmqpTemplate` / `RabbitTemplate` yapılandırması

### RabbitMQProducer
* `@Service` ile producer bileşeni
* `RabbitTemplate.convertAndSend()` ile mesaj gönderimi
* Exchange + Routing Key üzerinden yönlendirme
* SLF4J Logger ile mesaj takibi

### RabbitMQConsumer
* `@RabbitListener` anotasyonu ile kuyruk dinleme
* JSON mesajın otomatik deserializasyonu
* `n11bootcamp_notification` kuyruğunu dinleme

### Discovery Server (Eureka)
* Netflix Eureka Server kurulumu
* `@EnableEurekaServer` anotasyonu
* Servis kayıt & keşif (Service Registration & Discovery)
* Mikroservislerin Eureka'ya register edilmesi

## Teknolojiler
* Java 21
* Spring Boot
* Spring AMQP (RabbitMQ)
* Netflix Eureka Server
* Maven
* IntelliJ IDEA
