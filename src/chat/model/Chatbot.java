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
	private boolean quit;
	private ArrayList<String> keyMash = new ArrayList<String>();
	
	
	public Chatbot()
	{
		this.joke = "What is a pirate's favorite restaurant? ARRRRR-by's";
		this.content = new String("Cake");
		this.currentUser = new String("This is the default user :( boring!!!");
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
		
		buildTheLists();
	}
	
	public Chatbot(String content)
	{
		this.content = content;
		this.joke = new String("Your life");
		this.currentUser = new String("user");
		
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();
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
		responseList.add("What did you say?");
		responseList.add("Hey! No way?! same!");
		
		spookyList.add("Halloween");
		spookyList.add("Jack Skellington!!!!");
		spookyList.add("Boo!!!!");
		spookyList.add("2 spooky 4 me!!");
		spookyList.add("Halloween is just a cosplay!");
		spookyList.add("Scary!!");
		spookyList.add("*Chills down your spine*");
		spookyList.add("Trick or Treat?");
		spookyList.add("Zombies are coming!");
		
		keyMash.add("sdf");
	}
	
	public String processText(String userText)
	{
		String answer = "";
			
		
		if(legitimacyChecker(userText)) //This checks if there is a null or the user is just keyboard mashing.
		{
			if(userText.equals("quit")) //This is what we type if we want to quit the chatBot because we are set in an infinite loop.
			{
				setQuit(true);
			}
			if(contentChecker(userText)) //This checks if the use said the special word which in this case is "cake".
			{
			answer += "You said the special words";
			}
			else //This is the default saying if everything is correct.
			{
			answer += "You said: " + userText + "\n";
			answer += "Chatbot says: " + userText + "\n";
			}
		}
		else //The user is keyboard mashing or said nothing the code jumps straight to here to tell the user that what they said is invalid or a null.
		{
			answer += "You said: null\n";
			answer += "Chatbot says: What did you say?";
		}
		
		return answer; //And finally returns what the system should say back.
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
	
	public boolean getQuit()
	{
		return quit;
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
	
	public void setQuit(Boolean quit)
	{
		this.quit = quit;
	}
	
	public boolean contentChecker(String testContent)
	{
		boolean check = true;
		
		if(testContent.equals(content))
		{
			check = true;
		}
		else if(testContent.startsWith(content + " "))
		{
			check = true;
		}
		else if(testContent.endsWith(" " + content))
		{
			check = true;
		}
		else if(testContent.contains(" " + content + " "))
		{
			check = true;
		}
		else
		{
			check = false;
		}
		
		return check;
	}
	
	public boolean spookyChecker(String userText)
	{
		boolean check = false;
		for(String spookyString : spookyList)
		{
			if(userText.contains(spookyString))
			{
				check = true;
			}
		}
		return check;
	}
	
	public boolean legitimacyChecker(String input)
	{
		boolean legit = true;
		
		if(input == null)
		{
			legit = false;
		}
		else if(input.length() < 2)
		{
			legit = false;
		}
		else if(input.contains("sdf") || input.contains("fds") || 
				input.contains("jkl") || input.contains("lkj") || 
				input.contains("cvb") || input.contains("bvc") || 
				input.contains("jhg") || input.contains("ghj") ||
				input.contains("jf") || input.contains("fj") ||
				input.contains("kj") ||	input.contains("kd") || 
				input.contains("fd") ||input.contains("df") ||
				input.contains("zx") || input.contains("xz") || 
				input.contains(""))
		{
			legit = false;
		}
		else if(isKeyMash(input))
		{
			legit = false;
		}
		else
		{
			legit = true;
		}
		
		return legit;
	}
	
	private boolean isKeyMash(String userText)
	{
		boolean isMash = false;
		
		for(int index = 0; index < keyMash.size(); index++)
		{
			if(userText.contains(keyMash.get(index)))
			{
				isMash = true;
			}
		}
		
		return isMash;
	}
	
}
