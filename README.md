# DemoSpringBootWebApp

Author: Dr. YUHANG ZHAO

Introduction: 
In this demo we supply a quick-start code base with explanation for constructing a web service using Spring Boot.

Overview:
- In localhost:8080/home.jsp we fill-in a form and submit the request, 
  which contains all fields for an user profile object. 
  Spring Boot directs the request with parameters to CONTROLLER (annotated by @Controller);
- Alternatively we can directly input the url as localhost:8080/createProfile appended with object fields, 
  then it directs the request to CONTROLLER;
- In ProfileController.java it resides the CONTROLLER methods to handle particular requests.
  Methods can be implemented either by "dispatch servlet" or "ModelAndView".
  Methods forward the results to displayProfile.jsp (VIEW) for displaying;
- @ResponseBody can be used to print the String typed method result on a page;
- Dependency "tomcat-jasper" for Spring Boot to recognize that the String typed method results in CONTROLLER 
  are names of jsp files.
- The default location for VIEW is folder "webapp". 
	For locations other than the default, it needs to be specified in application.properties.
- application.properties specifies the configurations, e.g., prefix and suffix for views.

Future Work: Expand with front-end code base using Modern JS frameworks.

System Configuration:
- Windows 7
- Spring Tool Suite 3.9.9.RELEASE
- Spring Boot v2.1.7.RELEASE

Reference: "Spring Boot Tutorials | Full Course" by Telusko. https://www.youtube.com/watch?v=35EQXmHKZYs
