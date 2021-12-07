package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Profile;

public class MainApp {
	
	
	     public static void main(String[] args) {
	          ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	          Profile profile = (Profile) context.getBean("profile");
	         System.out.println(profile.toString());
	  }
}