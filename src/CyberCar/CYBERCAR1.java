package CyberCar;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JPasswordField;

public class CYBERCAR1 extends JFrame {

	private JPanel contentPane;
	private JTextField nameUser;
	private JPasswordField motDePasse;
	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CYBERCAR1 frame = new CYBERCAR1();
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
	public CYBERCAR1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 741, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(22, 10, 591, 87);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("GESTIONNAIRE DE RESSOURCES HUMAINES");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(10, 10, 571, 67);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.activeCaption);
		panel_1.setBounds(76, 177, 485, 179);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nom d'utilsateur");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(28, 23, 137, 25);
		panel_1.add(lblNewLabel);
		
		JLabel lblMotDePasse = new JLabel("Mot de passe");
		lblMotDePasse.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMotDePasse.setBounds(28, 65, 137, 31);
		panel_1.add(lblMotDePasse);
		
		nameUser = new JTextField();
		nameUser.setBounds(181, 23, 195, 25);
		panel_1.add(nameUser);
		nameUser.setColumns(10);
		
		JButton ButtonConnect = new JButton("Se connecter");
		ButtonConnect.setBackground(Color.BLUE);
		ButtonConnect.setFont(new Font("Tahoma", Font.BOLD, 16));
		ButtonConnect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Outils sf = new Outils();
				sf.secondFrame.setVisible(true);
//				frame.dispose();
				frame.setVisible(false);
				//  contentPane.setVisible(false);
				
			}
		});
		ButtonConnect.setBounds(294, 124, 158, 45);
		panel_1.add(ButtonConnect);
		
		motDePasse = new JPasswordField();
		motDePasse.setBounds(182, 73, 194, 25);
		panel_1.add(motDePasse);
		
		JButton btnFermer = new JButton("Fermer");
		btnFermer.setBackground(Color.RED);
		btnFermer.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnFermer.setBounds(552, 378, 120, 49);
		contentPane.add(btnFermer);
	}
}
