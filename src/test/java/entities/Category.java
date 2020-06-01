package entities;

import java.util.HashMap;
import java.util.Map;

public class Category {
	private Map<String, Object> categoryMap = new HashMap<String, Object>();
	public Category(int id, String name) {
		categoryMap.put("id", id);
		categoryMap.put("name", name);
	}
	
	public Map<String, Object> get(){
		return categoryMap;
	}
	
	public void set(String key, Object value) {
		categoryMap.put(key, value);
	}
}
