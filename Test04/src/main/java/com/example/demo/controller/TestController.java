package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.vo.MemberVo;
import com.google.gson.Gson;

@Controller
public class TestController {

	@RequestMapping(value = "/info.do", produces = "application/json;charset=utf8")
	@ResponseBody
	public String test() {
		//return "김죠니,28,일산";
		//String str = "{\"name\":\"김죠니\",\"age\":\"28\",\"addr\":\"일산\"}";
		Gson gson = new Gson();
		MemberVo m = new MemberVo("김죠니", 28, "일산");
		String str = gson.toJson(m);
		return str;
	}
}
