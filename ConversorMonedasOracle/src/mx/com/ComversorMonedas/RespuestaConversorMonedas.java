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
		setBackground(new Color(0, 0, 0));
		setBounds(100, 100, 697, 465);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel pesoEntrada = new JLabel("$");
			pesoEntrada.setFont(new Font("VT323", Font.BOLD, 22));
			pesoEntrada.setBounds(31, 58, 70, 15);
			contentPanel.add(pesoEntrada);
		}
		{
			JLabel lblPesosMexicanosEquibalesn = new JLabel("Pesos Mexicanos equivalen  a");
			lblPesosMexicanosEquibalesn.setFont(new Font("VT323", Font.BOLD, 22));
			lblPesosMexicanosEquibalesn.setBounds(98, 60, 289, 15);
			contentPanel.add(lblPesosMexicanosEquibalesn);
		}
		{
			JLabel divisaSalida = new JLabel("$");
			divisaSalida.setFont(new Font("VT323", Font.BOLD, 22));
			divisaSalida.setBounds(408, 60, 70, 15);
			contentPanel.add(divisaSalida);
		}
		{
			JLabel divisaEntrada = new JLabel("$");
			divisaEntrada.setFont(new Font("VT323", Font.BOLD, 22));
			divisaEntrada.setBounds(31, 134, 70, 15);
			contentPanel.add(divisaEntrada);
		}
		{
			JLabel lblEquivalenA = new JLabel("Equivalen a                Pesos Mexicanos");
			lblEquivalenA.setFont(new Font("VT323", Font.BOLD, 22));
			lblEquivalenA.setBounds(98, 136, 418, 15);
			contentPanel.add(lblEquivalenA);
		}
		{
			JLabel pesoSalida = new JLabel("$");
			pesoSalida.setFont(new Font("VT323", Font.BOLD, 22));
			pesoSalida.setBounds(224, 134, 70, 15);
			contentPanel.add(pesoSalida);
		}
		{
			JLabel lblNewLabel = new JLabel("");
			lblNewLabel.setIcon(new ImageIcon(RespuestaConversorMonedas.class.getResource("/mx/com/fuentes/moneda-peque.png")));
			lblNewLabel.setBounds(257, 217, 113, 113);
			contentPanel.add(lblNewLabel);
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
