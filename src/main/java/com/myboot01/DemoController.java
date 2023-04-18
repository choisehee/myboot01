package com.myboot01;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {

	@ResponseBody
	@RequestMapping("/")
	public String home() {
		System.out.println("nice");
		return "hi";
	}

	@RequestMapping("/hello.do")
	public String hello(Model model) {

		model.addAttribute("zzzz", "nicenice");

		return "hello";
		// html 파일명과 동일해야 함 이거 외에는 변수와 같은거라 달라도 실행이 된다
	}

	@RequestMapping("/hihi.do")
	public String hello2() {
		return "hello2";
		// html 파일명과 동일해야 함 이거 외에는 변수와 같은거라 달라도 실행이 된다
	}

	@RequestMapping("/hi.do")
	public String hi(Model model) {
	    model.addAttribute("message", "hi.jsp입니다");
	    return "hi";
	}

}
