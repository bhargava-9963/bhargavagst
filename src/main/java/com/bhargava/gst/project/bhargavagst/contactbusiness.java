package com.bhargava.gst.project.bhargavagst;
import java.util.ArrayList;
import java.util.List;
public class contactbusiness {

	public List<contact> getContactList(){
		List<contact>  listcontact=new ArrayList<>();
		
		listcontact.add(new contact("Marry john","marryjohn@gmail.com","USA"));
		listcontact.add(new contact("bhargava","bhargava@gmail.com","india"));
		listcontact.add(new contact("koturi","koturi@gmail.com","india"));
		listcontact.add(new contact("kbhargav","kbhargava@gmail.com","england"));
		
		return listcontact;
		
	}
	
}
