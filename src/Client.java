import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Client extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField chatText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws UnknownHostException,
	IOException, InterruptedException{
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client frame = new Client();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		Socket socket = new Socket("localhost", 4444);
	    Thread.sleep(1000);
		
		
	    
	    
	    
	}

	/**
	 * Create the frame.
	 */
	public Client() {
		setTitle("Server Client");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
		
		JPanel CardPanel = new JPanel();
		contentPane.add(CardPanel);
		CardPanel.setLayout(new CardLayout(0, 0));
		
		JPanel LoginPanel = new JPanel();
		CardPanel.add(LoginPanel, "login");
		LoginPanel.setLayout(new BoxLayout(LoginPanel, BoxLayout.Y_AXIS));
		
		JPanel panel = new JPanel();
		LoginPanel.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		
		JLabel lblClient = new JLabel("Client");
		lblClient.setFont(new Font("Arial Black", Font.PLAIN, 40));
		panel.add(lblClient);
		
		JPanel panel_1 = new JPanel();
		LoginPanel.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2);
		
		JLabel lblEnterYourName = new JLabel("ENTER YOUR NAME");
		lblEnterYourName.setFont(new Font("Arial Narrow", Font.PLAIN, 26));
		panel_2.add(lblEnterYourName);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3);
		
		textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4);
		
		JButton btnEnterChat = new JButton("Login");
		btnEnterChat.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnEnterChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		panel_4.add(btnEnterChat);
		
		JPanel ClientPanel = new JPanel();
		CardPanel.add(ClientPanel, "chat");
		
		CardLayout cardLayout = (CardLayout) CardPanel.getLayout();
		
		ClientPanel.setLayout(new BoxLayout(ClientPanel, BoxLayout.Y_AXIS));
		
		JScrollPane scrollPane = new JScrollPane();
		ClientPanel.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JPanel panel_7 = new JPanel();
		ClientPanel.add(panel_7);
		
		chatText = new JTextField();
		panel_7.add(chatText);
		chatText.setColumns(25);
		
		JButton btnSubmit = new JButton("Submit");
		panel_7.add(btnSubmit);
		
		btnEnterChat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(CardPanel, "chat");
				
			}
		});
		
	}
}

