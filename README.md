## DemoSpringBootWebApp

Author: Dr. YUHANG ZHAO

### MVC:
![screenshot](https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/MVC-basic.svg/320px-MVC-basic.svg.png)

### Overview:
Model–View–Controller (usually known as MVC) is a software architectural pattern commonly used for developing user interfaces which divides the related program logic into three interconnected elements. This is done to separate internal representations of information from the ways information is presented to and accepted from the user. Following the MVC architectural pattern decouples these major components allowing for code reuse and parallel development. 

### Working Mechanism:
- In `localhost:8080/home.jsp` we fill-in a form and submit the request 
  which contains all fields for an user profile object. 
  Spring Boot directs the request with arguments to CONTROLLER (annotated by `@Controller`);
- Alternatively we can directly use the url `localhost:8080/createProfile` appended with object fields, 
  then it directs the request with arguments to CONTROLLER;
- `ProfileController.java` contains the CONTROLLER methods to handle requests.
  Methods can be implemented either by "dispatch servlet" or "ModelAndView".
  Methods forward the results to `displayProfile.jsp` (VIEW) for displaying;
- `@ResponseBody` binds a method return value to the `HTTP` response body;
- Dependency "tomcat-jasper" is Tomcat's JSP engine, which implements the JSP specification and compiles JSP files to Java code.
- The default location for VIEW is folder `webapp`. 
  For locations other than the default, it needs to be specified in `application.properties`.
- `application.properties` specifies the configurations, e.g., prefix and suffix for views.

### Future Work: 
Replace .jsp implementation for view by Modern JS frameworks.

### System Configuration:
- Windows 7
- Java8
- Spring Tool Suite 3.9.9.RELEASE
- Spring Boot v2.1.7.RELEASE

### Reference: 
"Spring Boot Tutorials | Full Course" by Telusko. https://www.youtube.com/watch?v=35EQXmHKZYs
