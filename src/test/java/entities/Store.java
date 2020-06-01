package entities;

import java.util.HashMap;
import java.util.Map;

public class Store {
	Map<String, Object> storeMap = new HashMap<>();
	
	public Store(User user, Pet pet, int quantity, String shipDate, String status, boolean complete) {
		storeMap.put("id", user.getUser().get("id"));
		storeMap.put("petId", pet.getPet().get("id"));
		storeMap.put("quantity", quantity);
		storeMap.put("shipDate", shipDate);
		storeMap.put("status", status);
		storeMap.put("complete", complete);
	}
	
	public Map<String, Object> getStore(){
		return storeMap;
	}
	
	public void set(String key, Object value) {
		storeMap.put(key, value);
	}
}
