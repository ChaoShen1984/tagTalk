package com.tagTalk.websocket.message.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.tagTalk.websocket.message.SimpleBroadcastMessage;
import com.tagTalk.websocket.message.SimpleMessage;

/**
 * The controller for the messaging system. Declare the the end point that the
 * controller listens to, and the destination it talks to.
 * 
 * @author chaoshen
 *
 */
@Controller
public class MessagingController {

	@MessageMapping("/tagTalkMessaging")
	@SendTo("/tagTalkMessageListener")
	public SimpleBroadcastMessage broadcasting(SimpleMessage message) throws Exception {
		return new SimpleBroadcastMessage("anonymous user said: " + message.getMessage());
	}
}