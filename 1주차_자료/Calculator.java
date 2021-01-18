

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(3, 3));
		setContentPane(contentPane);
		
		textBox = new JTextField();
		textBox.setBackground(Color.WHITE);
		textBox.setEditable(false);
		textBox.setHorizontalAlignment(SwingConstants.RIGHT);
		textBox.setText("0");
		contentPane.add(textBox, BorderLayout.NORTH);
		textBox.setColumns(10);
		
		JButton btnClear = new JButton("C");
		contentPane.add(btnClear, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 3, 3));
		
		JButton btn_7 = new JButton("7");
		panel.add(btn_7);
		
		JButton btn_8 = new JButton("8");
		panel.add(btn_8);
		
		JButton btn_9 = new JButton("9");
		panel.add(btn_9);
		
		JButton btnPlus = new JButton("+");
		panel.add(btnPlus);
		
		JButton btn_4 = new JButton("4");
		panel.add(btn_4);
		
		JButton btn_5 = new JButton("5");
		panel.add(btn_5);
		
		JButton btn_6 = new JButton("6");
		panel.add(btn_6);
		
		JButton btnMinus = new JButton("-");
		panel.add(btnMinus);
		
		JButton btn_1 = new JButton("1");
		panel.add(btn_1);
		
		JButton btn_2 = new JButton("2");
		panel.add(btn_2);
		
		JButton btn_3 = new JButton("3");
		panel.add(btn_3);
		
		JButton btnMul = new JButton("*");
		panel.add(btnMul);
		
		JButton btn_0 = new JButton("0");
		panel.add(btn_0);
		
		JButton btnDot = new JButton(".");
		panel.add(btnDot);
		
		JButton btnDiv = new JButton("/");
		panel.add(btnDiv);
		
		JButton btnEqual = new JButton("=");
		panel.add(btnEqual);
	}
}
