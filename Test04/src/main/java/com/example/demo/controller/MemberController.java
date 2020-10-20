package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.vo.MemberVo;
import com.google.gson.Gson;

@Controller
public class MemberController {
	
	@RequestMapping("/listMember6")
	@ResponseBody
	public String member() {
		ArrayList<MemberVo> list = new ArrayList<MemberVo>();
		list.add(new MemberVo("죠니", 27, "일산"));
		list.add(new MemberVo("효니", 24, "고양"));
		list.add(new MemberVo("망갱", 28, "강릉"));
		Gson gson = new Gson();
		return gson.toJson(list);
	}
	
	
	/*@RequestMapping("/member4")
	@ResponseBody
	public String member() {
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		return "줄리~~~♡";
	}*/
	
}
