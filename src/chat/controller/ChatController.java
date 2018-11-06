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
		String userInput = "Hi What's up?";
		while(!simpleBot.getQuit())
		{
			userInput = interactWithChatbot(userInput);
		}
	}
	
	public String interactWithChatbot(String userText)
	{
		String output = "";
		String userResponse = JOptionPane.showInputDialog(null, userText);
		
		output = simpleBot.processText(userResponse);
		
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
