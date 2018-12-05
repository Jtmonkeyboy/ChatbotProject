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
	private JButton checkerButton;
	private JButton loadButton;
	private JButton saveButton;
	private JTextField chatField;
	private JTextArea chatArea;
	private JScrollPane chatPane;
	
	public ChatPanel(ChatController appController)
	{
		super();
		this.appController = appController;
		appLayout = new SpringLayout();
		
		chatButton = new JButton("Chat");
		checkerButton = new JButton("Check Text");
		loadButton = new JButton("Load");
		saveButton = new JButton("Save");
		
		chatField = new JTextField("Talk to the bot here", 50);
		chatArea = new JTextArea("Chat Area", 20, 50);
		chatPane = new JScrollPane();
		
		setupPanel();
		setupLayout();
		setupListeners();
		setupScrollPane();
	}
	
	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.add(chatButton);
		this.add(checkerButton);
		this.add(loadButton);
		this.add(saveButton);
		this.add(chatField);
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
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);
		
		chatPane.setViewportView(chatArea);
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
	}
	
	
}
