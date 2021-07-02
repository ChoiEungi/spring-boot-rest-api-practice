# spring-boot-rest-api-practice


### rest-api Spring Boot


pom.xml : Maven project setting

application.properties: Spring setting  → .yml을 더 많이 사용 

**Spring Boot 동작 원리** 

- application.yml or .properties
- spring boot auto configuation : DispatcherServeletAutoConfiguration, ErrorMvcAutoConfiguration, HttpMesageConvetersAutoConfiguration → JSON convert

dispatcherServlet → '/'

<img src = "https://user-images.githubusercontent.com/70755947/124256657-82a60e80-db66-11eb-96ba-f8e172108387.png">

클라이언트의 모든 요청을 한 곳으로 바당서 요청에 맞는 Handler로 요청을 전달, Handler의 실행 결과를 Http Respons 형태로 만들어 변환 

- RestController

Spring 4부터 .@RestController 지원: Controller + ResponseBody 

View를 갖지 않는 RestData를 반환 


<img src="https://user-images.githubusercontent.com/70755947/124256544-63a77c80-db66-11eb-9ecc-7eb045e9fbbf.png" >

path varibale annotation

```java
@GetMapping(path = "hello-world-bean/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name) {
        return new HelloWorldBean(String.format("hello World, %s", name));
    }
```

### POST

- body에 JSON 추가

HTTP status Code control 

201 created → 요청에 대한 적절한 응답값

```java
 @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User savedUser = service.save(user);

        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(savedUser.getId())
                .toUri();
        return ResponseEntity.created(location).build();

    }
```

### chap 3) expand features

**Validation**

- spring 2.5.2 기준 starter에서 validation 을 추가해야함 → pom.xml에서 추가 가능

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-validation</artifactId>
</dependency>
<!--javax.validation-->
<dependency>
    <groupId>javax.validation</groupId>
    <artifactId>validation-api</artifactId>
    <version>2.0.1.Final</version>
</dependency>
```
