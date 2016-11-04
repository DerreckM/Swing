import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Layout {

	private JFrame frame;
	private JTextField textField;
	private JButton btnSayHi;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Layout window = new Layout();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Layout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.BLACK);
		frame.getContentPane().setFont(new Font("Lucida Grande", Font.BOLD, 13));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setForeground(Color.BLACK);
		lblName.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblName.setBounds(6, 12, 61, 16);
		frame.getContentPane().add(lblName);
		
		textField = new JTextField();
		textField.setBounds(59, 6, 170, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(6, 81, 438, 16);
		frame.getContentPane().add(lblNewLabel);
		
		btnSayHi = new JButton("Say Hi");
		btnSayHi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = textField.getText();
				lblNewLabel.setText("Hi " + name + "!");
			}
		});
		btnSayHi.setBounds(6, 40, 117, 29);
		frame.getContentPane().add(btnSayHi);
		
	}
}
