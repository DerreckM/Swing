import java.awt.EventQueue;

import javax.swing.JFrame;


public class Basics {

	private JFrame frmBasics;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Basics window = new Basics();
					window.frmBasics.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Basics() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBasics = new JFrame();
		frmBasics.setTitle("Basics");
		frmBasics.setBounds(100, 100, 450, 300);
		frmBasics.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
