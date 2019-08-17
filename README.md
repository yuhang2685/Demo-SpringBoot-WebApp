# DemoSpringBootWebApp

Author: Dr. YUHANG ZHAO

Introduction: 
In this demo we supply a quick-start template with commented explanation for constructing a web service using Spring Boot.

Big Picture:
- In localhost:8080/home.jsp we fill-in a form and submit for user profile, 
  which contains all fields for an object. Then it directs the request with parameter object to the controller;
- Alternatively we can directly input url localhost:8080/createProfile with object fields, 
  then it directs the request with parameter object to the controller;
- In ProfileController.java resides the controller with methods to handle requests.
  The method is implemented either by "dispatch servlet" or "ModelAndView".
  The method forward the object to displayProfile.jsp (VIEW) for showing;
- In application.properties it specifies the prefix and suffix for views.

Future Work: Expand this template with front-end construction using Modern JS framework Angular6.

System Configuration:
- Windows 7
- Spring Tool Suite 3.9.9.RELEASE

Reference: "Spring Boot Tutorials | Full Course" by Telusko. https://www.youtube.com/watch?v=35EQXmHKZYs
