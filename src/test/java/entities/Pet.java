package entities;

import java.util.HashMap;
import java.util.Map;

public class Pet {
	private Map<String, Object> petMap = new HashMap<String, Object>();
	
	public Pet(int id, Category category, String name, String status) {
		petMap.put("id", id);
		petMap.put("category", category.get());
		petMap.put("name", name);
		petMap.put("status", status);
	}
	
	public Map<String, Object> getPet(){
		return petMap;
	}
	
	public void set(String key, Object value) {
		petMap.put(key, value);
	}
}
