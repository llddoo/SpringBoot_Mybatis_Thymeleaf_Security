package com.iu.s1.board.notice;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/notice/**")
public class NoticeController {

	@GetMapping("list")
	public void getList() {
		System.out.println("Notice List !!!!!");
	}
	
	@GetMapping("insert")
	public void setInsert() {
		System.out.println("Notice Insert !!!!!");
	}
}
