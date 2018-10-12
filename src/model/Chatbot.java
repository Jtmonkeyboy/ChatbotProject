package model;

import java.util.ArrayList;

public class Chatbot
{
	private ArrayList<String> respondList = new ArrayList<String>();
	private ArrayList<String> spookyList = new ArrayList<String>();
	private String content;
	private String currentUser;
	private String joke;
	
	
	public Chatbot()
	{
		
	}
	
	public Chatbot(String userIput)
	{
		
	}
	
	public void askName()
	{
		
	}
	
	public String getContent()
	{
		return content;
	}
	
	public String getCurrentUser()
	{
		return currentUser;
	}
	
	public String getJoke()
	{
		return joke;
	}
	
	public void setContent(String content)
	{
		this.content = content;
	}
	
	public void setCurrentUser(String currentUser)
	{
		this.currentUser = currentUser;
	}
	
	public void setJoke(String joke)
	{
		this.joke = joke;
	}
	
	
}
