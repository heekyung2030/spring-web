package com.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/sample")
public class SampleController {

	@RequestMapping("/main.do")
	public String sample() {
		return "sample/main";
	}

	
	@RequestMapping
	public String master() {
		return "master";
	}

	public String bugfix() {
		return "sample/main";
	}

}
