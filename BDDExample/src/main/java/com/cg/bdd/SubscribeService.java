package com.cg.bdd;

public class SubscribeService {
	
	public String subscribeToInfo(String email){
		return validateEmail(email);
	}
	
	private String validateEmail(String email){
		if(email.contains("@")){
			return "Welcome";
		}else{
			return "Error";
		}
	}

}
