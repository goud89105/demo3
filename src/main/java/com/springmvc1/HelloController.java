package com.springmvc1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@Autowired
	HelloService hs;

	@RequestMapping(value="/de", method=RequestMethod.GET)
	public String demo()
	{
		String s=hs.test();
		return s;
		
	}

	@RequestMapping(value="/de", method=RequestMethod.GET)
	public String demo1()
	{
		String s=hs.test();
		return s;
		
	}

}
