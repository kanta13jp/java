package com.dev2qa;

//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMethod;

//@Controller
//@RequestMapping(value="/")
@RestController
public class HelloWorldController {

    //@RequestMapping(value="/helloWorld", method=RequestMethod.GET)
	@RequestMapping(value="/helloWorld")
    public String helloWorld()
    {
    	System.out.println("helloWorld!");
        // The html file name is helloWorldPage.html.
        return "helloWorldPage";
    }
}
