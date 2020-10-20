package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.dao.BookDao;
import com.google.gson.Gson;

@Controller
public class BookController {

	@Autowired
	private BookDao dao;
	

	public void setDao(BookDao dao) {
		this.dao = dao;
	}
	
	@RequestMapping(value = "/listBook",produces = "application/json;charset=utf8")
	@ResponseBody
	public String listBook() {
		Gson gson = new Gson();
		return gson.toJson(dao.findAll());
	}
}
