package com.zerogon.lab;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.UserDAO;
import model.UserVO;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/page")
public class HomeController {
	
	@Autowired
	UserDAO userDAO;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("serverTime", null );
		return "home";
	}
	
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String mainForm(Locale locale, Model model) {
		return "main";
	}
	@RequestMapping(value = "/page1", method = RequestMethod.GET)
	public String page1Form(Locale locale, Model model) {
		return "page1";
	}
	@RequestMapping(value = "/page2", method = RequestMethod.GET)
	public String page2Form(Locale locale, Model model) {
		return "page2";
	}
	@RequestMapping(value = "/sendPage", method = RequestMethod.GET)
	public String sendPageForm(Locale locale, Model model) {
		return "sendPage";
	}
	@RequestMapping(value = "/sendPagePro", method = RequestMethod.POST)
	public String sendPageFormPro(Model model, String email, String password) {
		UserVO usrVO = userDAO.selectUserInfo(email);
		System.out.println(usrVO);
		model.addAttribute("usrVO", usrVO );
		return "receivePage";
	}
	
}
