package amigos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class fr {

	private JFrame frmNmerosAmigos;
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
					fr window = new fr();
					window.frmNmerosAmigos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public fr() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNmerosAmigos = new JFrame();
		frmNmerosAmigos.setTitle("N\u00DAMEROS AMIGOS");
		frmNmerosAmigos.setBounds(100, 100, 623, 393);
		frmNmerosAmigos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmNmerosAmigos.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(56, 140, 116, 22);
		frmNmerosAmigos.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(225, 140, 116, 22);
		frmNmerosAmigos.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(424, 140, 116, 22);
		frmNmerosAmigos.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				String t = textField.getText();
				String t1 = textField_1.getText();

				int n = Integer.parseInt(t);
				int n1 = Integer.parseInt(t1);
				int div1=0;
				int div2=0;
				for (int i = 1; i <n; i++) {
						if(n%i==0)
							div1=div1+i;
				}
				for (int i = 1; i <n1; i++) {
					if(n1%i==0)
						div2=div2+i;
			}

				if(div1==n1 && div2==n){
					textField_2.setText("Son amigos");

				}else{
					textField_2.setText("No son amigos");

				}
				
			}
			
			
			
		});
		btnNewButton.setBounds(244, 217, 97, 25);
		frmNmerosAmigos.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("N\u00FAmero 1");
		lblNewLabel.setBounds(76, 100, 84, 16);
		frmNmerosAmigos.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("N\u00FAmero 2");
		lblNewLabel_1.setBounds(259, 100, 70, 16);
		frmNmerosAmigos.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setBounds(456, 100, 84, 16);
		frmNmerosAmigos.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNmerosAmigos = new JLabel("N\u00DAMEROS AMIGOS");
		lblNmerosAmigos.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblNmerosAmigos.setBounds(198, 38, 189, 16);
		frmNmerosAmigos.getContentPane().add(lblNmerosAmigos);
	}

}
