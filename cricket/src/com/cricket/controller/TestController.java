package com.cricket.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cricket.bo.TestBo;
import com.cricket.service.TestService;

@Controller
public class TestController {

	
	@Autowired
	TestService testService;
	
	TestBo testBo;
	
	@RequestMapping(value="create", method=RequestMethod.GET)
	public String create(Model model)
	{
		model.addAttribute("testBo", testBo);
		return "createTest";
		
	}
	
	@RequestMapping(value="createTest", method=RequestMethod.POST)
	public String createTest(@Valid @ModelAttribute("testBo")TestBo testBo,Model model,BindingResult br)
	{
		return "createTest";
		
	}
}
