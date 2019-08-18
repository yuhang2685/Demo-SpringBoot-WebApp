# DemoSpringBootWebApp

Author: Dr. YUHANG ZHAO

Introduction: 
In this demo we supply a quick-start code base with explanation for constructing a web service using Spring Boot.

Big Picture:
- In localhost:8080/home.jsp we fill-in a form and submit the request, 
  which contains all fields for an user profile object. 
  Spring directs the request to the controller;
- Alternatively we can directly input the url as localhost:8080/createProfile appended with object fields, 
  then it directs the request to the controller;
- In ProfileController.java resides the controller with methods to handle particular requests.
  Methods are can be implemented by either "dispatch servlet" or "ModelAndView".
  Methods forward the results to displayProfile.jsp (VIEW) for displaying;
- application.properties specifies the configurations, e.g., prefix and suffix for views.

Future Work: Expand with front-end code base using Modern JS frameworks.

System Configuration:
- Windows 7
- Spring Tool Suite 3.9.9.RELEASE

Reference: "Spring Boot Tutorials | Full Course" by Telusko. https://www.youtube.com/watch?v=35EQXmHKZYs
