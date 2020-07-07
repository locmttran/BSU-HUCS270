[CS270-1] Basic GUI Interface

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Register extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

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
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register");
			
		JLabel lblNewLabel_1 = new JLabel("Name:");
		
		JLabel lblNewLabel_2 = new JLabel("Email:");
		
		JLabel lblNewLabel_3 = new JLabel("Phone Number:");
		
		textField = new JTextField();
		
		textField_1 = new JTextField();
		
		textField_2 = new JTextField();
		
		JButton btnNewButton = new JButton("Sign Up!");
		
		JButton btnNewButton_1 = new JButton("X");
		
		
		setUndecorated(true);
	}

}
