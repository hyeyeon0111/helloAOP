# helloAOP

Spring의 핵심 기능인 AOP(Aspect Oriented Programming) 실습 프로젝트

🔍 **Aspect Oriented Programming**

- **cross cutting concerns**(logging, security, transaction 기능)을 **application module**과 **분리**시키는 프로그래밍 기법

🔍 **AOP Components**

- **Aspect**: 여러 클래스에 걸쳐 발생하는 enterprise application 문제를 구현하는 클래스, pointcut과 advice의 조합
  - Java classes + **XML**
  - Java classes + **annotation**
- **Pointcut**: advice가 실행되어야 하는 joinpoint의 집합
- **JoinPoint**: AOP를 연결할 수 있는 지점
- **Advice**: 메소드 실행 전후에 수행할 실제 작업

📄 **Summary**

- logging, security, transaction 기능을 aspect로 만든다
- runtime시에 cross cutting concerns 기능들을 application module에 집어넣는다 (weaving 기능)
- AOP를 사용하면 여러 클래스에 영향을주는 기능을 재사용 가능한 모듈(aspect)로 캡슐화 할 수 있다

✏️ **Example Description**

- AnimalType: 인터페이스
- Dog, Cat: AnimalType을 구현한 클래스
- PetOwner: AnimalType의 owner, AnimalType에 Dog나 Cat이 주입됨
- **Logger**: logging 기능을 수행하는 클래스 👉 **Cat과 Dog의 sound() 메소드가 수행되기 전 또는 후에 로깅 메시지를 넣음**

✔️ **Run**

- Cat의 sound() 메소드 수행 전에(**before**) 로깅 메시지 출력

  <img src="https://user-images.githubusercontent.com/56067179/110232628-2c331580-7f62-11eb-93ba-a7baa872d631.PNG" width="600"/>

- Dog의 sound() 메소드 수행 후에(**after**) 로깅 메시지 출력

  <img src="https://user-images.githubusercontent.com/56067179/110232629-2d644280-7f62-11eb-83ca-dde89fb45a75.PNG" width="600"/>
 



