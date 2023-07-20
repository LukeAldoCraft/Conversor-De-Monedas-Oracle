package mx.com.ComversorMonedas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;

public class RespuestaConversorDeTiempo extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RespuestaConversorDeTiempo dialog = new RespuestaConversorDeTiempo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RespuestaConversorDeTiempo() {
		
		ConversorDeTiempo conversor = new ConversorDeTiempo();
		String resultado1 =  conversor.resultadoHora;
		String resultado2 = conversor.resultadoTiempo;
		String seleccion1 = conversor.selectTiempo1;
		String seleccion2 = conversor.selectTiempo2;
		String recibido1 = conversor.resibioHora;
		String recibido2 = conversor.resibidoTiempo;
		
		setBackground(new Color(0, 0, 0));
		setBounds(100, 100, 706, 457);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel horas1 = new JLabel("");
		horas1.setFont(new Font("VT323", Font.BOLD, 22));
		horas1.setBounds(23, 58, 82, 15);
		contentPanel.add(horas1);
		
		JLabel lblHorasEquivalenA = new JLabel("Horas equivalen a :");
		lblHorasEquivalenA.setFont(new Font("VT323", Font.BOLD, 22));
		lblHorasEquivalenA.setBounds(99, 58, 243, 15);
		contentPanel.add(lblHorasEquivalenA);
		
		JLabel tiempoC1 = new JLabel("");
		tiempoC1.setFont(new Font("VT323", Font.BOLD, 22));
		tiempoC1.setBounds(317, 58, 297, 15);
		contentPanel.add(tiempoC1);
		
		JLabel horas2 = new JLabel("");
		horas2.setFont(new Font("VT323", Font.BOLD, 22));
		horas2.setBounds(35, 155, 109, 15);
		contentPanel.add(horas2);
		
		JLabel lblTiempoEquivalenA = new JLabel("equivalen a  :                              Horas");
		lblTiempoEquivalenA.setFont(new Font("VT323", Font.BOLD, 22));
		lblTiempoEquivalenA.setBounds(147, 155, 510, 15);
		contentPanel.add(lblTiempoEquivalenA);
		
		JLabel tiempoC2 = new JLabel("");
		tiempoC2.setFont(new Font("VT323", Font.BOLD, 22));
		tiempoC2.setBounds(303, 155, 230, 15);
		contentPanel.add(tiempoC2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(RespuestaConversorDeTiempo.class.getResource("/mx/com/fuentes/relogne.png")));
		lblNewLabel.setBounds(280, 218, 128, 133);
		contentPanel.add(lblNewLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(154, 153, 150));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			JButton btnRegresarAlConversor = new JButton("Regresar al Conversor");
			btnRegresarAlConversor.setForeground(Color.WHITE);
			btnRegresarAlConversor.setFont(new Font("VT323", Font.BOLD, 22));
			btnRegresarAlConversor.setBackground(Color.BLACK);
			btnRegresarAlConversor.setActionCommand("Cancel");
			buttonPane.add(btnRegresarAlConversor);
			
			JButton btnCerrar = new JButton("Cerrar");
			btnCerrar.setForeground(Color.WHITE);
			btnCerrar.setFont(new Font("VT323", Font.BOLD, 22));
			btnCerrar.setBackground(Color.BLACK);
			btnCerrar.setActionCommand("Cancel");
			buttonPane.add(btnCerrar);
			
			btnCerrar.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					System.exit(0);
				}
			});
			
			btnRegresarAlConversor.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					ConversorDeTiempo conversorTiempo = new ConversorDeTiempo();
					conversorTiempo.main(null);
					dispose();
					
				}
			});
		}
		
		horas1.setText(recibido1);
		tiempoC1.setText(resultado1.concat(" " + seleccion1));
	    horas2.setText(recibido2.concat(" " + seleccion2));
	    tiempoC2.setText(resultado2);
		
		
	}
}
