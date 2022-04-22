
/**
 * L'ERP CyberCar permettant la gestion des stocks de voiture
 * des clients et des ressources humaines
 * @author Lagaillarde
 *
 */
import java.awt.EventQueue;

import javax.swing.JFrame;

public class CyberCar {

	private JFrame frame;

	/**
	 * Launch the application.
	 */

	/**
	 * 
	 * @param args parametre du main
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CyberCar window = new CyberCar();
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
	public CyberCar() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
