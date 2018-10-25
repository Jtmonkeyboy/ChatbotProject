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
	
	public String interactWithChatbot(String userText)
	{
		String output = "";
		String userResponse = JOptionPane.showInputDialog(null, "Hi What's up?");
		if(userResponse.equals(""))
		{
			output += "You said: null\n";
			output += "Chatbot says: null";
		}
		else
		{
			output += "You said: " + userResponse + "\n";
			output += "Chatbot says: " + userResponse;
		}
		
		return output;
	}
	
	public String useChatbotCheckers(String userText)
	{
		String output = "";
		if(userText.equalsIgnoreCase("spooky"))
		{
			output = "Halloween";
		}
		return output;
	}
	
	public Chatbot getChatbot()
	{
		return simpleBot;
	}
}
