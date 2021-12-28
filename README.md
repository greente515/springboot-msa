## MSA TEST

* spring boot 를 이용한 msa 프로젝트 세팅 테스트
* Spring Cloud Eureka Client (Order 서비스)
    * project 생성
    * 의존성 추가
    * application.yml 작성
    * OrderServiceApplication 에 @EnableDiscoveryClient 어노테이션 추가
    * Controller 생성

* Instances currently registered with Eureka 에 ORDER-SERVICE 등록 됨
  * http://fg-wykim-pc:54412/actuator/info -> 클릭하면 연결되는 주소
  * http://localhost:54412/info -> 이 주소가 정상 접속되는 주소
  * todo : 왜 클릭하면 연결되는 주소가 오류인지 확인 필요 -> fixme : /actuator/info 로 매핑하면 클릭시 연결되는 주소로 연결이 잘 됨.
![img.png](images/img.png)

* postman test
![img_1.png](images/img_1.png)
