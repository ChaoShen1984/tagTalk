package com.tagTalk.websocket.message;

/**
 * The data model for {@link SimpleMessage}.
 * 
 * @author Chao Shen
 *
 */
public class SimpleBroadcastMessage {

	private String message;

	public SimpleBroadcastMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
