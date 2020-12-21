package com.mimaraslan.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value="/merkez")
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/detay/{id}/{adi}/{soyadi}", method = RequestMethod.GET)
	public String anasayfa(@PathVariable("id") int id,
			               @PathVariable("adi") String adi,
			               @PathVariable("soyadi") String soyadi,
			
			Model model) {
               model.addAttribute("id", id);
               model.addAttribute("adi", adi);
               model.addAttribute("soyadi", soyadi);
               
		
		return "home";
	}
	
}
