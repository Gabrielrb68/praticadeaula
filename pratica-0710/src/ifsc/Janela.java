package ifsc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Janela extends JFrame {

	private JPanel texto2;
	private JTextField nota1;
	private JTextField nota2;
	private JTextField nota3;
	private JTextField resultado;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Janela frame = new Janela();
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
	public Janela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		texto2 = new JPanel();
		texto2.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(texto2);
		texto2.setLayout(null);
		
		nota1 = new JTextField();
		nota1.setBounds(59, 55, 86, 20);
		texto2.add(nota1);
		nota1.setColumns(10);
		
		nota2 = new JTextField();
		nota2.setBounds(59, 86, 86, 20);
		texto2.add(nota2);
		nota2.setColumns(10);
		
		nota3 = new JTextField();
		nota3.setBounds(59, 117, 86, 20);
		texto2.add(nota3);
		nota3.setColumns(10);
		
		resultado = new JTextField();
		resultado.setBounds(279, 68, 86, 20);
		texto2.add(resultado);
		resultado.setColumns(10);
		
		JLabel texto1 = new JLabel("Nota 1");
		texto1.setBounds(20, 61, 46, 14);
		texto2.add(texto1);
		
		JLabel numero2 = new JLabel("Nota 2");
		numero2.setBounds(20, 92, 46, 14);
		texto2.add(numero2);
		
		JLabel texto3 = new JLabel("Nota 3");
		texto3.setBounds(20, 120, 46, 14);
		texto2.add(texto3);
		
		JLabel lblNewLabel_3 = new JLabel("Resultado");
		lblNewLabel_3.setBounds(205, 71, 66, 14);
		texto2.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setBounds(20, 14, 46, 14);
		texto2.add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(59, 11, 86, 20);
		texto2.add(txtNome);
		txtNome.setColumns(10);
		
		JButton btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
			    String numero1 = nota1.getText();
			    String numero2 = nota2.getText();
				String numero3 = nota3.getText();
				
				if(!nota1.getText().isEmpty() || !nota2.getText().isEmpty() || !nota3.getText().isEmpty()) {
					Double nm1 = Double.valueOf(numero1);
					Double nm2 = Double.valueOf(numero2);
					Double nm3 = Double.valueOf(numero3);
					Double media = (nm1+nm2+nm3)/3;
					JOptionPane.showMessageDialog(btnCalcular,"A media e: "+media);
					resultado.setText(String.valueOf(media));
					
					
					
				}
				else
					JOptionPane.showMessageDialog(btnCalcular,"Um dos valores esta vazio!");
				
				
			}
		});
		btnCalcular.setBounds(82, 172, 89, 23);
		texto2.add(btnCalcular);
	}
}
