package janela;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class janelona extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					janelona frame = new janelona();
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
	public janelona() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(197, 10, -45, 22);
		contentPane.add(textArea);
		
		JComboBox<String> boxCaixa = new JComboBox<>();
		boxCaixa.setBounds(91, 22, 175, 22);
		
		String[] vetorMateriais = {"Tesoura","Caneta","Lápis","Papel","Canetão","Cola"};
		
		for (int i = 0; i < vetorMateriais.length; i++) {
			
			boxCaixa.addItem(vetorMateriais[i]);
		}
		
		contentPane.add(boxCaixa);
		
		JTextPane painelTexto = new JTextPane();
		painelTexto.setBounds(64, 70, 312, 147);
		contentPane.add(painelTexto);
		
		JLabel lblNewLabel = new JLabel("Opções:");
		lblNewLabel.setBounds(38, 24, 72, 18);
		contentPane.add(lblNewLabel);
		
		JButton oBotao = new JButton("ADICIONAR");
		oBotao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String valorSelecionado = (String) boxCaixa.getSelectedItem();
				painelTexto.setText(painelTexto.getText()+valorSelecionado+",");
			
			}
		});
		oBotao.setBounds(290, 22, 134, 23);
		contentPane.add(oBotao);
	}
}
