package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

	@GetMapping("/listMember")
	public String listMember(HttpServletRequest request) {
		System.out.println("회원 목록입니다.");
		return "ok";
	}
	
	@GetMapping("/deleteMember")
	public String deleteMember(HttpServletRequest request) {
		System.out.println("회원 삭제입니다.");
		return "ok";
	}
}
