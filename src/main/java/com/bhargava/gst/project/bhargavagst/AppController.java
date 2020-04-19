package com.bhargava.gst.project.bhargavagst;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
@Controller
public class AppController {
	
	
	@RequestMapping("/welcome")
	public String welcome() {
		System.out.println("hello world");
		return "welcome.jsp";
	}
     
	@RequestMapping("/list_contacts")
	public String listcontact(Model mode) {
		contactbusiness b=new contactbusiness();
		List<contact> containlist=b.getContactList();
		
		mode.addAttribute("contacts",containlist);
		return "contact";
	}
	
}
