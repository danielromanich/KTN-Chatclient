package com.client.message;

import org.json.simple.JSONObject;

public class MessageCreator {
	
	@SuppressWarnings("unchecked")
	public JSONObject createMessage(String...messages) {
		JSONObject json = new JSONObject();
		if (messages.length % 2 == 0 && messages.length > 1) {
			for (int i = 0; i < messages.length; i += 2) {
				json.put((String) messages[i], (String)messages[i + 1]);
			}
		}
		return json;
	}

}
