import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTable;
import java.awt.ScrollPane;
import javax.swing.JList;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class InsuranceGUI {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private Database db;
	private JTable table;
	List<List<Object>> data;
	List<List<Object>> polData;
	List<List<Object>> purData;
	private JTable table_1;
	private JTable table_2;
	private JTextField t1;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;

	/**
	 * Launch the application.
	 */
	public void Start() {
		this.frame.setVisible(true);
	}

	/**
	 * Create the application.
	 */
	public InsuranceGUI(Database d, List<List<Object>> o, List<List<Object>> po, List<List<Object>> pu) {
		this.db = d;
		this.data = o;
		this.polData = po;
		this.purData = pu;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 750, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 734, 461);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setFont(new Font("Calibri", Font.PLAIN, 13));
		lblNewLabel.setBounds(215, 183, 84, 20);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(329, 183, 237, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Calibri", Font.PLAIN, 13));
		lblPassword.setBounds(215, 228, 84, 20);
		panel.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(329, 226, 237, 20);
		panel.add(passwordField);
		
		JPanel panel_1 = new JPanel();
		panel_1.setVisible(false);
		panel_1.setBackground(Color.ORANGE);
		panel_1.setBounds(0, 0, 734, 461);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2_3 = new JPanel();
		panel_2_3.setBounds(0, 22, 734, 439);
		panel_1.add(panel_2_3);
		panel_2_3.setLayout(null);
		
		JLabel label1 = new JLabel("Title");
		label1.setBounds(149, 41, 70, 14);
		panel_2_3.add(label1);
		
		JLabel label2 = new JLabel("First Name");
		label2.setBounds(149, 66, 70, 14);
		panel_2_3.add(label2);
		
		JLabel label3 = new JLabel("Surname");
		label3.setBounds(149, 91, 70, 14);
		panel_2_3.add(label3);
		
		JLabel label4 = new JLabel("Age");
		label4.setBounds(149, 116, 70, 14);
		panel_2_3.add(label4);
		
		JLabel label5 = new JLabel("Gender");
		label5.setBounds(149, 141, 70, 14);
		panel_2_3.add(label5);
		
		JLabel label6 = new JLabel("Address");
		label6.setBounds(149, 166, 70, 14);
		panel_2_3.add(label6);
		
		JLabel label7 = new JLabel("City");
		label7.setBounds(149, 191, 70, 14);
		panel_2_3.add(label7);
		
		JLabel label8 = new JLabel("Country");
		label8.setBounds(149, 216, 70, 14);
		panel_2_3.add(label8);
		
		JLabel label9 = new JLabel("Postcode");
		label9.setBounds(149, 241, 70, 14);
		panel_2_3.add(label9);
		
		JLabel label10 = new JLabel("Number");
		label10.setBounds(149, 266, 70, 14);
		panel_2_3.add(label10);
		
		JLabel label11 = new JLabel("Policy");
		label11.setBounds(149, 291, 70, 14);
		panel_2_3.add(label11);
		
		t1 = new JTextField();
		t1.setBounds(217, 38, 118, 20);
		panel_2_3.add(t1);
		t1.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(217, 66, 118, 20);
		panel_2_3.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(217, 91, 118, 20);
		panel_2_3.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(217, 116, 118, 20);
		panel_2_3.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(217, 163, 118, 20);
		panel_2_3.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(217, 188, 118, 20);
		panel_2_3.add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(217, 213, 118, 20);
		panel_2_3.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(217, 241, 118, 20);
		panel_2_3.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(217, 266, 118, 20);
		panel_2_3.add(textField_8);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(217, 137, 47, 23);
		panel_2_3.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Female");
		rdbtnNewRadioButton_1.setBounds(268, 137, 109, 23);
		panel_2_3.add(rdbtnNewRadioButton_1);
		
		ButtonGroup radioGroup = new ButtonGroup();
		radioGroup.add(rdbtnNewRadioButton_1);
		radioGroup.add(rdbtnNewRadioButton);
		
		String[] s1 = {"Health Insurance", "Home Insurance", "Car Insurance", "Business Insurance"};
		JComboBox comboBox = new JComboBox(s1);
		comboBox.setBounds(217, 291, 118, 22);
		panel_2_3.add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Add Customer");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gender = "";
				if(rdbtnNewRadioButton.isSelected()) {
					gender = "Male";
				}
				if(rdbtnNewRadioButton_1.isSelected()) {
					gender = "Female";
				}
				String[] cust = {t1.getText(), textField_1.getText(), textField_2.getText(),  textField_3.getText(),gender, textField_4.getText(), textField_5.getText(), textField_6.getText(), textField_7.getText(), textField_8.getText(), (String) comboBox.getSelectedItem()};
				try {
					db.insertCustomer(cust);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(414, 291, 128, 23);
		panel_2_3.add(btnNewButton_1);
		

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 22, 734, 439);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		String[] columnNames = { "ID", "Title", "First Name", "Surname", "Age", "Gender", "Address", "City", "Country", "Postcode", "Phone Number" };
		/*Object[][]data = {
				{"Mr","Matthew","Jeffery", 23, "Male", "59 Oak Road", "Dublin", "Ireland", "G76 F4X2", "938484354"},
				{"Ms","Freida","Rozemyne", 18, "Female", "78 Ehrenfest", "Berlin", "Germany", "H4C FD3F", "246275457"}
		};*/
		
		Object[][] newData = new Object[data.size()][];
		int i = 0;
		for(List<Object> nestedObject: data) {
			newData[i++] = nestedObject.toArray(new Object[nestedObject.size()]);
		}
		table = new JTable(newData, columnNames);
		table.setBounds(10, 11, 724, 59);
		//panel_2.add(table);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setLocation(0, 0);
		scrollPane.setSize(734, 427);
		panel_2.add(scrollPane);
		scrollPane.setViewportView(table);
		
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(0, 22, 734, 439);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(0, 0, 734, 439);
		panel_2_1.add(scrollPane_1);
		
		String[] columnNames2 = { "ID", "Policy Name", "Description", "Base Price"};
		Object[][] newData2 = new Object[polData.size()][];
		int j = 0;
		for(List<Object> nestedObject: polData) {
			newData2[j++] = nestedObject.toArray(new Object[nestedObject.size()]);
		}
		table_1 = new JTable(newData2, columnNames2);
		table_1.setBounds(10, 11, 724, 59);
		scrollPane_1.setViewportView(table_1);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(0, 22, 734, 439);
		panel_1.add(panel_2_2);
		panel_2_2.setLayout(null);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(0, 0, 734, 439);
		panel_2_2.add(scrollPane_2);
		
		String[] columnNames3 = { "First Name", "Surname", "Policy", "Purchase Date", "Expiration", "Premium"};
		Object[][] newData3 = new Object[purData.size()][];
		int k = 0;
		for(List<Object> nestedObject: purData) {
			newData3[k++] = nestedObject.toArray(new Object[nestedObject.size()]);
		}
		table_2 = new JTable(newData3, columnNames3);
		table_2.setBounds(10, 11, 724, 59);
		scrollPane_2.setViewportView(table_2);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 734, 22);
		panel_1.add(menuBar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Customers");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(true);
				panel_2_1.setVisible(false);
				panel_2_2.setVisible(false);
				panel_2_3.setVisible(false);
			}
		});
		menuBar.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Policies");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
				panel_2_1.setVisible(true);
				panel_2_2.setVisible(false);
				panel_2_3.setVisible(false);
			}
			
		});
		menuBar.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Policies Held");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
				panel_2_1.setVisible(false);
				panel_2_2.setVisible(true);
				panel_2_3.setVisible(false);
			}
		});
		menuBar.add(mntmNewMenuItem_2);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Add Customer");
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
				panel_2_1.setVisible(false);
				panel_2_2.setVisible(false);
				panel_2_3.setVisible(true);
			}
		});
		menuBar.add(mntmNewMenuItem_3);
		
		
		JButton btnNewButton = new JButton("Log In");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String passwordy = String.valueOf(passwordField.getPassword());
				if(textField.getText().equals("root") && passwordy.equals("root")) {
					panel.setVisible(false);
					panel_1.setVisible(true);
				}
			}
		});
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 13));
		btnNewButton.setBounds(362, 277, 89, 23);
		panel.add(btnNewButton);
		
		
	}
}
