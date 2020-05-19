package com.sst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sst.model.Member;

@Controller
public class MainController {
	@RequestMapping("/")
	public String homePage() {
		return "index";
	}

	@RequestMapping("/Home")
	public String Home() {
		return "Home";
	}

	@RequestMapping("/MRegistrationForm")
	public String SaveMemberDetails(Model model) {
		model.addAttribute("member", new Member());
		return "MemberRegistration";
	}

}
