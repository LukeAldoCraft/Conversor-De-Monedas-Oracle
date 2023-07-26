package mx.com.ComversorMonedas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

public class RespuestaConversorMonedas extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RespuestaConversorMonedas dialog = new RespuestaConversorMonedas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RespuestaConversorMonedas() {
		
		ConversorDeMonedas conversor = new ConversorDeMonedas();
		String resultado1 =  conversor.resultadoDivisa1;
		String resultado2 = conversor.resultadoDivisa2;
		String seleccion1 = conversor.divisaRecivida1;
		String seleccion2 = conversor.divisaRecivida2;
		String recibido1 = conversor.datoRecivido1;
		String recibido2 = conversor.datoRecivido2;
		
		
		
		
		
		setBackground(new Color(0, 0, 0));
		setBounds(100, 100, 717, 479);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel pesoEntrada = new JLabel("");
			pesoEntrada.setFont(new Font("VT323", Font.BOLD, 22));
			pesoEntrada.setBounds(12, 58, 64, 15);
			contentPanel.add(pesoEntrada);
			
			pesoEntrada.setText(recibido1);
			
		}
		{
			JLabel lblPesosMexicanosEquibalesn = new JLabel("Pesos Mexicanos equivalen  a");
			lblPesosMexicanosEquibalesn.setFont(new Font("VT323", Font.BOLD, 22));
			lblPesosMexicanosEquibalesn.setBounds(70, 58, 293, 15);
			contentPanel.add(lblPesosMexicanosEquibalesn);
		}
		{
			JLabel divisaSalida = new JLabel("");
			divisaSalida.setFont(new Font("VT323", Font.BOLD, 22));
			divisaSalida.setBounds(361, 58, 334, 15);
			contentPanel.add(divisaSalida);
			
			divisaSalida.setText(resultado1.concat(" " + seleccion1));
			
		}
		{
			JLabel divisaEntrada = new JLabel("");
			divisaEntrada.setFont(new Font("VT323", Font.BOLD, 22));
			divisaEntrada.setBounds(12, 134, 271, 15);
			contentPanel.add(divisaEntrada);
			
			divisaEntrada.setText(recibido2.concat(" " + seleccion2));
			
		}
		{
			JLabel lblEquivalenA = new JLabel("Equivalen a             Pesos Mexicanos");
			lblEquivalenA.setFont(new Font("VT323", Font.BOLD, 22));
			lblEquivalenA.setBounds(295, 134, 400, 15);
			contentPanel.add(lblEquivalenA);
		}
		{
			JLabel pesoSalida = new JLabel("");
			pesoSalida.setFont(new Font("VT323", Font.BOLD, 22));
			pesoSalida.setBounds(425, 134, 91, 15);
			contentPanel.add(pesoSalida);
			
			pesoSalida.setText(resultado2);
			
		}
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon("/home/aldo/Documentos/EscuelaTareas/Conversor-De-Monedas-Oracle/ConversorMonedasOracle/bin/mx/com/fuentes/moneda-peque.png"));
			lblNewLabel.setBounds(288, 198, 113, 113);
			contentPanel.add(lblNewLabel);
		}
		{
			JLabel lblElTipoDe = new JLabel("El tipo de cambio se actualiza en tiempo real gracias a una Api");
			lblElTipoDe.setFont(new Font("VT323", Font.BOLD, 22));
			lblElTipoDe.setBounds(39, 333, 622, 23);
			contentPanel.add(lblElTipoDe);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(154, 153, 150));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnRegresarAlConversor = new JButton("Regresar al Conversor");
				btnRegresarAlConversor.setForeground(Color.WHITE);
				btnRegresarAlConversor.setFont(new Font("VT323", Font.BOLD, 22));
				btnRegresarAlConversor.setBackground(Color.BLACK);
				btnRegresarAlConversor.setActionCommand("Cancel");
				buttonPane.add(btnRegresarAlConversor);
				
				btnRegresarAlConversor.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						ConversorDeMonedas conversorMoneda = new ConversorDeMonedas();
						conversorMoneda.main(null);
						dispose();
						
					}
				});
				
			}
			
			JSeparator separator = new JSeparator();
			separator.setOrientation(SwingConstants.VERTICAL);
			buttonPane.add(separator);
			{
				JButton btnCerrar = new JButton("Cerrar");
				btnCerrar.setFont(new Font("VT323", Font.BOLD, 22));
				btnCerrar.setBackground(new Color(0, 0, 0));
				btnCerrar.setForeground(new Color(255, 255, 255));
				btnCerrar.setActionCommand("Cancel");
				buttonPane.add(btnCerrar);
				
				btnCerrar.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
						
					}
				});
				
			}
		}
	}
}
