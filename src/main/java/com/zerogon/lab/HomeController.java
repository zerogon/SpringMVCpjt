package com.zerogon.lab;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/page")
public class HomeController {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
		model.addAttribute("serverTime", null );
		return "home";
	}
	
	@RequestMapping(value = "/sendPage", method = RequestMethod.GET)
	public String sendPageForm(Locale locale, Model model) {
		System.out.println("컨트롤러 접속 성공");
		return "sendPage";
	}
	@RequestMapping(value = "/sendPagePro", method = RequestMethod.POST)
	public String sendPageFormPro(Model model, String id, String pwd) {
		System.out.println("sendPagePro 요청");
		model.addAttribute("id", id );
		model.addAttribute("pwd", pwd );
		return "receivePage";
	}
	
}
