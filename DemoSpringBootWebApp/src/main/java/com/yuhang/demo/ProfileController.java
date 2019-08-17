package com.yuhang.demo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProfileController {

	//YH: The method below handles the request specified by name.
	@RequestMapping("createProfile")

	/*
	 * YH: 
	 * We use servlet "request dispatcher" for the method implementation.
	 * We can print the returned string on a new web page by using @ResponseBody.
	 * However, we use a jsp page as an output view with below steps.
	 * We add dependency "tomcat jasper" for accepting jsp files,
	 * by which it knows the return string is the name of a jsp page.
	 * Spring uses auto configuration to search for the page by name. 
	 * The default location is folder "webapp". 
	 * For other location than the default location, specify it in application.properties.
	 * Also, we can hide view type jsp there, because it is normal to change front end techniques.
	 * 
	 * Example: submit form in localhost:8080/home.jsp
	 * or call the service directly by localhost:8080/createProfile?name=yuhang
	 */	
	/*
	public String processProfile(HttpServletRequest req) {
		
		HttpSession session = req.getSession();	
		String name = req.getParameter("name");			
		session.setAttribute("name", name);
		return "displayName";
	}
	*/
	
	
	// YH: Simplify the above method implementation method by Spring Dependency Injection:
	//     the parameterized object will be created by Spring.	
	/*
       public String processProfile(@RequestParam("name") String myName, HttpSession session)
     		{			
				session.setAttribute("name", myName);
	 			return "displayName";
	 		}
	*/
    	public String processProfile(UserProfile up, HttpSession session)
  			{			
				session.setAttribute("obj", up);
	 			return "displayProfile";
	 		}
	
	// YH: We had seen how to use ModelAndView in DemoSpringMVC.
	/*
	public ModelAndView processProfile(@RequestParam("name") String myName) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name", myName);
		mv.setViewName("displayName");
		return mv;
	}
	*/
	
	
	// Example: submit form in localhost:8080/home.jsp
	// or call the service directly by localhost:8080/createProfile?uid=1&uname=Yuhang&uoccupation=developer&uarea=Hamilton&uurl=https://www.linkedin.com/in/yuhang-zhao-232348165/		
	/*
	public ModelAndView processProfile(UserProfile up) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj", up);
		mv.setViewName("displayProfile");
		return mv;
	}
	*/
	
}
