package demo;

import org.json.simple.JSONObject;

public class JsonDemo {
	public static void main(String[] args) {
		JSONObject jo = new JSONObject();
		
		jo.put("name", "tongchinhchung1");
		jo.put("password", "chinhchung0804");
		System.out.println(jo);
		System.out.println(jo.get("name"));
	}
}