package com.springmvc1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

	@RequestMapping(value="/get", method=RequestMethod.GET)
	public String demo()
	{
		return "demo controller";
		
	}
	
	
	@RequestMapping(value="/get", method=RequestMethod.GET)
	public String demo1()
	{
		return "demo controller";
		
	}

	@RequestMapping(value="/get", method=RequestMethod.GET)
	public String demo12()
	{
		return "demo controller";
		
	}

}
