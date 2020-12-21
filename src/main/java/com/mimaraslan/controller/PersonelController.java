package com.mimaraslan.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mimaraslan.model.Personel;
//http://localhost:8080/_006_SpringMVC/personel
@Controller
@RequestMapping("/personel")
public class PersonelController {
	static Set<Personel> personeller;
	static {
		personeller =new HashSet<Personel>();
		Personel personel=null;
		for(int i=1;i<=10;i++) {
			personel=new Personel(i,"pesonel"+i);
			personeller.add(personel);
			
		}
	}
	//http://localhost:8080/_006_SpringMVC/personellistele
     @RequestMapping("/listele")
	public Personel name(){
		return  (Personel) personeller;
    	 
     }
}
