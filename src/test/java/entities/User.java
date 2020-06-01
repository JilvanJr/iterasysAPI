package entities;

import java.util.HashMap;
import java.util.Map;

public class User {
	private Map<String, Object> userMap = new HashMap<>();
	
	public User(int id, String username, String firstName, String lastName, String email, String password, String phone, int userStatus) {
		userMap.put("id", id);
		userMap.put("username", username);
		userMap.put("firstName", firstName);
		userMap.put("lastName", lastName);
		userMap.put("email", email);
		userMap.put("password", password);
		userMap.put("phone", phone);
		userMap.put("userStatus", userStatus);
		
	}
	
	public Map<String, Object> getUser(){
		return userMap;
	}
	
	public void set(String key, Object value) {
		userMap.put(key, value);
	}
	
}
