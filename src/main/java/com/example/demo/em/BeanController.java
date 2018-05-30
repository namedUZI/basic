package com.example.demo.em;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BeanController {
	@RequestMapping(value="/xyz")
	public String tiaozhuang() {
		return "success";
	}
}
