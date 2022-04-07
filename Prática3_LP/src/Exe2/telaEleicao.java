package Exe2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class telaEleicao extends JFrame {

	private JPanel contentPane;
	private JTextField seuVoto;
	private int candidato1;
	private int candidato2;
	private int nulo;
	private int branco;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaEleicao frame = new telaEleicao();
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
	public telaEleicao() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Eug\u00EAnio = 7");
		lblNewLabel.setFont(new Font("Nirmala UI", Font.BOLD, 12));
		lblNewLabel.setBounds(88, 29, 126, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblJos = new JLabel("Jos\u00E9 = 9");
		lblJos.setFont(new Font("Nirmala UI", Font.BOLD, 12));
		lblJos.setBounds(88, 65, 126, 25);
		contentPane.add(lblJos);
		
		JLabel lblNulo = new JLabel("Nulo = 1");
		lblNulo.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		lblNulo.setBounds(88, 101, 126, 25);
		contentPane.add(lblNulo);
		
		JLabel lblBranco = new JLabel("Branco 2 ");
		lblBranco.setFont(new Font("Nirmala UI", Font.PLAIN, 12));
		lblBranco.setBounds(88, 137, 126, 25);
		contentPane.add(lblBranco);
		
		JLabel lblSeuVoto = new JLabel("Seu voto: ");
		lblSeuVoto.setFont(new Font("Nirmala UI", Font.BOLD, 13));
		lblSeuVoto.setBounds(9, 170, 69, 25);
		contentPane.add(lblSeuVoto);
		

		
		
		seuVoto = new JTextField();
		seuVoto.setBounds(88, 173, 44, 20);
		contentPane.add(seuVoto);
		seuVoto.setColumns(10);
		
		JButton botaoVotar = new JButton("Votar");
		botaoVotar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int voto = Integer.parseInt(seuVoto.getText());
				
				switch (voto) {
					
				case 7:
					candidato1 ++;
					JOptionPane.showMessageDialog(null,"Voto registrado com sucesso!");
					seuVoto.setText("");
					break;
						
				case 9:
					candidato2++;
					JOptionPane.showMessageDialog(null,"Voto registrado com sucesso!");
					seuVoto.setText("");
					break;
						
				case 1:
					nulo ++;
					JOptionPane.showMessageDialog(null,"Voto registrado com sucesso!");
					seuVoto.setText("");
					break;
						
				case 2:
					branco ++;
					JOptionPane.showMessageDialog(null,"Voto registrado com sucesso!");
					seuVoto.setText("");
					break;
					
				default: JOptionPane.showMessageDialog(null,"Entrada inválida, tente novamente.");
					break;
				
				}
			
			}
		});
		botaoVotar.setForeground(Color.GREEN);
		botaoVotar.setBounds(27, 209, 95, 23);
		contentPane.add(botaoVotar);
		
		JButton botaoCancelar = new JButton("Cancelar");
		botaoCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		botaoCancelar.setForeground(Color.RED);
		botaoCancelar.setBounds(143, 209, 95, 23);
		contentPane.add(botaoCancelar);
		
		JButton botaoApurar = new JButton("Apurar");
		botaoApurar.setForeground(Color.YELLOW);
		botaoApurar.setBounds(262, 209, 95, 23);
		contentPane.add(botaoApurar);
	}
}
