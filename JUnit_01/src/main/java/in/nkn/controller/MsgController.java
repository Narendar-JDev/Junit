package in.nkn.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nkn.service.MsgService;

@RestController
public class MsgController {

	@Autowired
	private MsgService msgservice;
	
	@GetMapping("/welcome")
	public String getWelcome() {
		String welcomeMsg = msgservice.getWelcomeMsg();
		return welcomeMsg;
	}
	
	@GetMapping("/greet")
	public String getGreet() {
		String greetMsg = msgservice.getGreetMsg();
		return greetMsg;
	}
	
}
