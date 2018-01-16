package com.project.HelloHuman.controllers;

import java.security.Principal;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller

@RequestMapping("/")

public class HomeController{

	@RequestMapping("")

	public String index(@RequestParam(value="first",defaultValue="Human") String first,@RequestParam(value="last",defaultValue="") String last,Model model){

		model.addAttribute("first",first);

		model.addAttribute("last",last);

		return "index";

	}

}