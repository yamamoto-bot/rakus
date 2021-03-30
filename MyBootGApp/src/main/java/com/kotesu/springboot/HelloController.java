package com.kotesu.springboot;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{

	@RequestMapping("/")
	public ModelAndView index(ModelAndView mav) {
		mav.setViewName("index");
		ArrayList<DataObject> data = new ArrayList<DataObject>();
		data.add(new DataObject(0,"taro","taro@yamada"));
		data.add(new DataObject(1,"hanako","hanako@flower"));
		data.add(new DataObject(2,"sachiko","sachiko@happy"));
		mav.addObject("data",data);
		return mav;
	}

	class DataObject{
		private int id;
		private String name;
		private String value;

		public DataObject(int id, String name, String value) {
			super();
			this.id = id;
			this.name = name;
			this.value = value;
		}

		public int getId() {return id;}
		public void setId(int id) {this.id = id;}
		public String getName() {return name;}
		public void setName(String name) {this.name= name;}
		public String getValue() {return value;}
		public void setValue(String value) {this.value=value;}
	}
}