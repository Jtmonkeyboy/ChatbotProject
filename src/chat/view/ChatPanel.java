package chat.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
	private JButton resetButton;
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
		resetButton = new JButton("Clear");
		
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
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(new Color(66, 134, 244));
		this.add(chatButton);
		this.add(checkerButton);
		this.add(loadButton);
		this.add(saveButton);
		this.add(resetButton);
		this.add(chatField);
		this.add(chatPane);
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, chatPane, 50, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, chatPane, 50, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, chatPane, -50, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, chatField, 22, SpringLayout.SOUTH, chatPane);
		appLayout.putConstraint(SpringLayout.WEST, chatField, 0, SpringLayout.WEST, chatPane);
		appLayout.putConstraint(SpringLayout.EAST, chatField, 0, SpringLayout.EAST, chatPane);
		appLayout.putConstraint(SpringLayout.SOUTH, chatButton, -104, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, chatButton, -54, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, checkerButton, -204, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, chatButton, 50, SpringLayout.EAST, checkerButton);
		appLayout.putConstraint(SpringLayout.SOUTH, checkerButton, -104, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, loadButton, -104, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, loadButton, 50, SpringLayout.EAST, saveButton);
		appLayout.putConstraint(SpringLayout.WEST, saveButton, 50, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, saveButton, -104, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, saveButton, -662, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.EAST, resetButton, -369, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.WEST, checkerButton, 50, SpringLayout.EAST, resetButton);
		appLayout.putConstraint(SpringLayout.WEST, resetButton, 338, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, loadButton, -50, SpringLayout.WEST, resetButton);
		appLayout.putConstraint(SpringLayout.SOUTH, resetButton, -104, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.NORTH, chatButton, 12, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, checkerButton, 12, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, resetButton, 12, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, loadButton, 12, SpringLayout.SOUTH, chatField);
		appLayout.putConstraint(SpringLayout.NORTH, saveButton, 12, SpringLayout.SOUTH, chatField);
	}
	
	private void setupListeners()
	{
		chatButton.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent click)
			{
				String input = chatField.getText();
				String output = "";
				output = appController.interactWithChatbot(input);
				chatArea.append(output);
				chatField.setText("");
				chatArea.setCaretPosition(chatArea.getDocument().getLength());
			}
				});
		
		checkerButton.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent click)
			{
				
			}	
				});
		
		loadButton.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent click)
			{
				
			}
				});
		
		saveButton.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent click)
			{
				
			}
				});
		
		resetButton.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent click)
			{
				chatArea.setText("");
			}
				});
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
