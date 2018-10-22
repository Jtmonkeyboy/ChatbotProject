package chat.model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Chatbot
{
	private ArrayList<String> responseList = new ArrayList<String>();
	private ArrayList<String> spookyList = new ArrayList<String>();
	private String content;
	private String currentUser;
	private String joke;
	
	
	public Chatbot()
	{
		this.joke = "What is a pirate's favorite restaurant? ARRRRR-by's";
		this.content = new String("boring content drab empty blah");
		this.currentUser = new String("This is the default user :( boring!!!");
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		
		buildTheLists();
	}
	
	private void buildTheLists()
	{
		responseList.add("How are you?");
		responseList.add(0, "Hello");
		responseList.add("Goodbye - no more talking!");
		responseList.add("That's not very nice.");
		responseList.add("That's offensive!");
		responseList.add("Feels bad man.");
		responseList.add("Lol wut?");
		responseList.add("¯\\_(ツ)_/¯");
		responseList.add("no u");
		responseList.add("I love you!");
		responseList.add("Stop!");
		responseList.add("That is very kind.");
		responseList.add("*Jumps out window*");
		responseList.add("*Just stares*");
		responseList.add("What is the meaning of life?");
		responseList.add("Are we friends?");
		
		spookyList.add("Halloween");
		spookyList.add("Jack Skellington!!!!");
		spookyList.add("Boo!!!!");
		spookyList.add("2 spooky 4 me!!");
		spookyList.add("Halloween is just a cosplay!");
		spookyList.add("Scary!!");
		spookyList.add("*Chills down your spine*");
		spookyList.add("Trick or Treat?");
		spookyList.add("Zombies are coming!");
	}
	
	public String processText(String userText)
	{
		String answer = "";
		answer += "You said: " + userText;
		answer += "Chatbot says: " + userText;
		JOptionPane.showMessageDialog(null, answer);
		
		return answer;
	}
	
	public Chatbot(String userIput)
	{
		
	}
	
	public void askName()
	{
		
	}
	
	public ArrayList<String> getSpookyList()
	{
		return spookyList;
	}
	
	public ArrayList<String> getResponseList()
	{
		return responseList;
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
