package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@SpringBootApplication
@Controller
public class DemoApplication {

	/*@RequestMapping("/hello")
	public String greeting() {
		return "Hello World! xzq";
	}*/
	@RequestMapping("/1")
	public String index() {

		return "index";
	}
	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("curDate", new Date());
		return "hello";
	}
	@RequestMapping(value ="/study03",method = RequestMethod.GET)
	public  String study03(Model model){
		model.addAttribute("name","向志强");
		model.addAttribute("age",23);

		List<WebDto> list=new ArrayList<WebDto>();
		list.add(new WebDto("向志强","http://www.fxzxzq.com.cn:8080/CURD/"));
		list.add(new WebDto("向辉中","https://www.baidu.com/"));
		list.add(new WebDto("何飘飘","http://bqccj.com/"));
		model.addAttribute("datas",list);
     return "study03";
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}