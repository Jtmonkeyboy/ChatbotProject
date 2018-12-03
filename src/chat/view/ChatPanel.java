package chat.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import chat.controller.ChatController;

public class ChatPanel extends JPanel
{
	private SpringLayout appLayout;
	private ChatController appController;
	private JButton chatButton;
	private JTextField inputField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	
	public ChatPanel(ChatController appController)
	{
		super();
		this.appController = appController;
		
		chatButton = new JButton("Click me!");
		
		setupPanel();
		setupLayout();
		setupListeners();
		setupScrollPane();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(chatButton);
		this.add(inputField);
		this.add(chatArea);
		this.add(chatPane);
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}
	
	private void setupScrollPane()
	{
		
	}
	
	
}
