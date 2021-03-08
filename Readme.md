오늘부터 그 동안 우격다짐으로 넣어져 있던 개념들을 다시 정리할 겸
아래와 같은 순서대로 개념을 다시 정리하고 포트폴리오를 작성해보고자 합니다

1. JSP Model 1 (3일 예상)
2. JSP Model 2 (3일 예상)
3. Spring MVC Project (4일 예상)
4. Spring Boot Project (3일 예상)
5. 이후 포트폴리오 페이지 구상
6. 포트폴리오 Project (1달 예상)


해당 1-6번까지 전부 약 2달안에는 끝내는 방식으로 진행해보고자 한다.
이후에 프로젝트 부분이 끝날때 마다 해당 프로젝트 md 파일에 위와 같이 업데이트 내역을 업로드 할 예정.

1번과 2번을 먼저 하는 이유는 MVC 모델을 다시 이해하고 흘러가는 사이클을 알아보고자 함이고
이후에는 주로 쓰이는 스프링을 이용하여 웹 프로젝트를 구축하여 보고
이를 이용하여서 포트폴리오 페이지를 작성하는것에 의의가 있다.


* 3월 4일
    * Spring MVC Project를 통한 웹페이지 연습 시작
         ***
         
         이전에는 model1과 model2를 통해서 기초적인 jsp mvc에 흐름에 대해서 알았다면
         이제 이를 더 편히 해주기 위한 Spring 프레임워크를 이용한 연습이 되겠다.
         불편했던 설정 부분 복잡했던 부분들을 전부 Spring에서 담당해주기 때문에
         개발자 입장에서는 더욱 편하게 코딩을 할 수 있는 환경이 이루어지고
         이를 이용하여서 예제를 작성해보고자 한다.
         
         일단 오늘은 기본적인 설정을 마쳤고 다음날부터 해보고자 한다.        
         
         ***
     
* 3월 5~7일
    * Spring MVC Project를 통한 웹페이지 연습 시작 - 못함
         ***
         
         주말 및 다른 일로 인해서 연습 못함 월요일부터 할 예정      
         
         ***
         
* 3월 8일
    * Spring MVC Project를 통한 웹페이지 연습 시작 2
         ***
         
             <context-param>
                 <param-name>contextConfigLocation</param-name>
                 <param-value>/WEB-INF/dispatcher-servlet.xml</param-value>
             </context-param>
             
            을 하지 않았다가 계속 삽질만 한거 같다
            
            현재 고쳐야 할 부분은 Tomcat에서 로그가 한글이 깨지니 UTF-8을 적용해주는것
            앞단을 조금 꾸며보는 것이고
            
            이제부터 스프링 프레임워크를 통한 어노테이션을 이용하다 보니 정말로 편해지는 것을 느끼게 되었다.     
         
         ***