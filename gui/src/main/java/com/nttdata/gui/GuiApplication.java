package com.nttdata.gui;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
public class GuiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GuiApplication.class, args);
		Runtime rTime = Runtime.getRuntime();
		String url = "/gui.html";
		
		ModelAndView model = new ModelAndView("htmlPageName");
		/*model.addAttribute("surname1", "someValue");
		model.addAttribute("surname2", "someValue");
		model.addAttribute("surname3", "someValue");
		model.addAttribute("name1", "someValue");
		model.addAttribute("name2", "someValue");
		model.addAttribute("name3", "someValue");*/
	}
}
