package chat.controller;

import javax.swing.JOptionPane;

import chat.model.Chatbot;

import java.util.ArrayList;

public class ChatController
{
	private Chatbot simpleBot;
	
	public ChatController()
	{
		simpleBot = new Chatbot();
	}
	
	public void start()
	{
		String userInput = "";
		
		while(!userInput.equalsIgnoreCase("quit"))
		{
			userInput = interactWithChatbot(userInput);
		}
	}
	
	public String interactWithChatbot(String text)
	{
		String output = "";
		String userResponse = JOptionPane.showInputDialog(null, "Hi What's up?");
		output = simpleBot.processText(userResponse);
		
		
		return output;
	}
	
	public String useChatbotCheckers(String text)
	{
		String output = "";
		return output;
	}
	
	public Chatbot getChatbot()
	{
		return simpleBot;
	}
}
