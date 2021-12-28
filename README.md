## MSA TEST

* spring boot 를 이용한 msa 프로젝트 세팅 테스트
* Spring Cloud Eureka Client (User 서비스)
    * project 생성
    * 의존성 추가
    * application.yml 작성
    * UserServiceApplication 에 @EnableDiscoveryClient 어노테이션 추가
    * Controller 생성

* Instances currently registered with Eureka 에 USER-SERVICE 등록 됨
  * http://fg-wykim-pc:64412/actuator/info 
  * http://localhost:64412/actuator/info  
  * todo : 왜 클릭하면 연결되는 주소가 오류인지 확인 필요
![img.png](images/img.png)

* postman test

![img_1.png](images/img_1.png)