package project_study.webstudy.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ControllerTest {
	
	@GetMapping("/test")
	public String hello() {
		return "/FooterHeader.html";
	}
}
