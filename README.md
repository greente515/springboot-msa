## MSA TEST

* spring boot 를 이용한 msa 프로젝트 세팅 테스트
* Spring Cloud Eureka Server
  * project 생성
  * 의존성 추가
  * application.yml 작성
  * DiscoveryServerApplication 에 @EnableEurekaServer 등록
  * Eureka Dashboard : http://localhost:8761/

![img.png](images/img.png)

* 실행 순서
  * eureka server 실행 (discovery-server)
  * user microservice 실행 (user-service)
  * order microservice 실행 (order-service)
  * gateway service 실행 (gateway-service)
  