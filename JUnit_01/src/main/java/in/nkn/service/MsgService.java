package in.nkn.service;

import org.springframework.stereotype.Service;

@Service
public class MsgService {

	public String getWelcomeMsg() {
		return "Welcome Narendar";
	}
	
	
	public String getGreetMsg() {
		return "Good Morning";
	}
	
}
