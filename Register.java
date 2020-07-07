import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.List;

import javax.swing.JTextField;
import javax.swing.Action;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Register extends JFrame {

	private JPanel contentPane, updatePane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel name, phone, email;
	private ArrayList<String> list = new ArrayList<String>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Register frame = new Register();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 445, 361);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(70, 130, 180));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblNewLabel.setBounds(167, 43, 103, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(68, 133, 103, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(68, 158, 103, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Phone Number:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_3.setBounds(68, 183, 103, 14);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(167, 182, 180, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				System.out.print(name);
							
			}
			
		});
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setBounds(167, 157, 180, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		textField_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				String email = textField_1.getText();
							
			}
			
		});
		
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setBounds(167, 132, 180, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) {
				String pNumber = textField_2.getText();
							
			}
			
		});
		
		JButton btnNewButton = new JButton("Sign Up!");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				updatePane = new JPanel();
				updatePane.add(name);
				updatePane.add(email);
				updatePane.add(phone);
				
			}
		});
		btnNewButton.setBounds(167, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("X");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dispose();
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(255, 0, 0));
		btnNewButton_1.setBounds(397, 0, 48, 23);
		contentPane.add(btnNewButton_1);
		
		setUndecorated(true);
	}

}
