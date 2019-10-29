## Demo-SpringBoot-WebApp

#### Author: Dr. YUHANG ZHAO

### Introduction
In this demo we explore for how to build a simple web service using `SpringBoot MVC` without `web.xml`. 

### Overview
- In `localhost:8080/home.jsp` (`VIEW`) we fill-in a form and submit the request 
  containing all fields for an user profile object. 
  Then `Spring Boot` (using `dispatch servlet`) directs the request with arguments to `ProfileController.java`(the `CONTROLLER`, annotated by `@Controller`).
  Alternatively we can directly use the endpoint `localhost:8080/createProfile` appended with object fields, 
  and `Spring Boot` directs the request with arguments to `ProfileController.java`.
- `ProfileController.java` contains the `CONTROLLER` methods to handle requests.
  Methods can be implemented either by using `dispatch servlet` bydefault or `ModelAndView` instead.
  Methods forward the results as an object (therefore in this simple example there is no need for `service`, however we need the `model` containing `UserProfile.java`) to `displayProfile.jsp` (`VIEW`) for display.
- `@ResponseBody` binds a method return value to the `HTTP` response body.
- Dependency `tomcat-jasper` is `Tomcat`'s `JSP` engine, which implements the `JSP` specification and compiles `JSP` files to Java code.
- The default location for `VIEW` in `SpringBoot` is folder `webapp`. 
  For locations other than the default, it needs to be specified in `application.properties`.
- `application.properties` specifies the configurations, e.g., prefix and suffix for `views`.

### Related Projects
See more details about `MVC` and `dispatch servlet` in my [Demo-SpringMVC](https://github.com/yuhang2685/Demo-SpringMVC)

### System Configuration:
- Windows 7
- Java8
- Spring Boot v2.1.7.RELEASE

### Reference: 
- ["Spring Boot Tutorials | Full Course"](https://www.youtube.com/watch?v=35EQXmHKZYs) by Telusko

