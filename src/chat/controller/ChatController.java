package chat.controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import chat.model.Chatbot;
import chat.view.ChatFrame;

public class ChatController
{
	private Chatbot simpleBot;
	private ChatFrame appFrame;
	
	public ChatController()
	{
		simpleBot = new Chatbot();
		appFrame = new ChatFrame(this);
	}
	
	public void start()
	{
//		String userInput = "Hi What's up?";
/*		while(!simpleBot.getQuit())
		{
			userInput = interactWithChatbot(userInput);
		}*/
	}
	
	public String interactWithChatbot(String userText)
	{
		String output = "";
		output = simpleBot.processText(userText);
		return output;
	}
	
	public ArrayList<String> useChatbotCheckers(String userText)
	{
		ArrayList<String> output;
		if(userText.equalsIgnoreCase("spooky"))
		{
			output = simpleBot.getSpookyList();
		}
		else
		{
			output = simpleBot.getResponseList();
		}
		
		return output;
	}
	
	public Chatbot getChatbot()
	{
		return simpleBot;
	}
}
