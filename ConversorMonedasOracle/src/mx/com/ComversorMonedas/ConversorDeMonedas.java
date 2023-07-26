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
import java.util.HashMap;

import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class ConversorDeMonedas extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField datoEntrada1;
	private JTextField datoEntrada2;
	private HashMap valoresDivisa = new HashMap();
	public static String datoRecivido1;
	public static String datoRecivido2;
	public static String divisaRecivida1;
	public static String divisaRecivida2;
	public static String resultadoDivisa1;
	public static String resultadoDivisa2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			ConversorDeMonedas dialog = new ConversorDeMonedas();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConversorDeMonedas() {
		
		
		valoresDivisa.put("DOLAR -  ESTADO UNIDENSE", "USD");
		valoresDivisa.put("PESO - ARGENTINO", "ARS");
		valoresDivisa.put("PESO - CHILENO", "CLP");
		valoresDivisa.put("PESO - COLOMBIANO", "COP");
		valoresDivisa.put("REAL - BRASILEÑO", "BRL");
		valoresDivisa.put("BOLIVAR - VENEZOLANO", "VEF");
		valoresDivisa.put("EURO", "EUR");
		valoresDivisa.put("LIBRA", "GBP");
		
		
		
		setBackground(new Color(0, 0, 0));
		setBounds(100, 100, 703, 446);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblConversorDeMonedas = DefaultComponentFactory.getInstance().createTitle("Conversor De Monedas");
		lblConversorDeMonedas.setFont(new Font("VT323", Font.BOLD, 28));
		lblConversorDeMonedas.setBounds(185, 23, 269, 39);
		contentPanel.add(lblConversorDeMonedas);
		
		JLabel lblIngresaLaCantidad = new JLabel("Convertir de Peso Mexicano a Divisa:");
		lblIngresaLaCantidad.setFont(new Font("VT323", Font.BOLD, 22));
		lblIngresaLaCantidad.setBounds(46, 86, 382, 39);
		contentPanel.add(lblIngresaLaCantidad);
		
		JLabel lblIngresaValor = new JLabel("Ingresa valor:");
		lblIngresaValor.setFont(new Font("VT323", Font.BOLD, 22));
		lblIngresaValor.setBounds(26, 141, 146, 27);
		contentPanel.add(lblIngresaValor);
		
		datoEntrada1 = new JTextField();
		datoEntrada1.setFont(new Font("VT323", Font.PLAIN, 22));
		datoEntrada1.setBounds(173, 145, 69, 19);
		contentPanel.add(datoEntrada1);
		datoEntrada1.setColumns(10);
		
		JLabel lblConvertiDeDivisa = new JLabel("Convertir de  Divisa a Peso Mexicano:");
		lblConvertiDeDivisa.setFont(new Font("VT323", Font.BOLD, 22));
		lblConvertiDeDivisa.setBounds(46, 240, 382, 39);
		contentPanel.add(lblConvertiDeDivisa);
		
		JComboBox lstDivisa1 = new JComboBox();
		lstDivisa1.setForeground(new Color(255, 255, 255));
		lstDivisa1.setBackground(new Color(0, 0, 0));
		lstDivisa1.setFont(new Font("VT323", Font.BOLD, 20));
		lstDivisa1.setModel(new DefaultComboBoxModel(new String[] {"DOLAR -  ESTADO UNIDENSE", "PESO - ARGENTINO", "PESO - CHILENO", "PESO - COLOMBIANO", "REAL - BRASILEÑO", "BOLIVAR - VENEZOLANO", "EURO", "LIBRA"}));
		lstDivisa1.setBounds(254, 143, 233, 24);
		contentPanel.add(lstDivisa1);
		
		JLabel lblIngresaValor_1 = new JLabel("Ingresa valor:");
		lblIngresaValor_1.setFont(new Font("VT323", Font.BOLD, 22));
		lblIngresaValor_1.setBounds(26, 291, 149, 27);
		contentPanel.add(lblIngresaValor_1);
		
		datoEntrada2 = new JTextField();
		datoEntrada2.setFont(new Font("VT323", Font.PLAIN, 22));
		datoEntrada2.setColumns(10);
		datoEntrada2.setBounds(173, 295, 83, 19);
		contentPanel.add(datoEntrada2);
		
		JComboBox lstDivisa2 = new JComboBox();
		lstDivisa2.setModel(new DefaultComboBoxModel(new String[] {"DOLAR -  ESTADO UNIDENSE", "PESO - ARGENTINO", "PESO - CHILENO", "PESO - COLOMBIANO", "REAL - BRASILEÑO", "BOLIVAR - VENEZOLANO", "EURO", "LIBRA"}));
		lstDivisa2.setForeground(Color.WHITE);
		lstDivisa2.setFont(new Font("VT323", Font.BOLD, 20));
		lstDivisa2.setBackground(Color.BLACK);
		lstDivisa2.setBounds(263, 291, 224, 24);
		contentPanel.add(lstDivisa2);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/home/aldo/Documentos/EscuelaTareas/Conversor-De-Monedas-Oracle/ConversorMonedasOracle/bin/mx/com/fuentes/pingu-peque.png"));
		lblNewLabel.setBounds(505, 86, 182, 212);
		contentPanel.add(lblNewLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(154, 153, 150));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			JButton btnMenuPrincipal = new JButton("Menu Principal");
			btnMenuPrincipal.setFont(new Font("VT323", Font.BOLD, 22));
			btnMenuPrincipal.setForeground(new Color(255, 255, 255));
			btnMenuPrincipal.setBackground(new Color(0, 0, 0));
			buttonPane.add(btnMenuPrincipal);
			
			JSeparator separator = new JSeparator();
			separator.setOrientation(SwingConstants.VERTICAL);
			buttonPane.add(separator);
			{
				JButton btnIniciar = new JButton("Iniciar");
				btnIniciar.setForeground(new Color(255, 255, 255));
				btnIniciar.setBackground(new Color(0, 0, 0));
				btnIniciar.setFont(new Font("VT323", Font.BOLD, 22));
				btnIniciar.setActionCommand("OK");
				buttonPane.add(btnIniciar);
				getRootPane().setDefaultButton(btnIniciar);
				
				btnIniciar.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						String recivido1 = datoEntrada1.getText();
						String recivido2 = datoEntrada2.getText();
						datoRecivido1 = recivido1;
						datoRecivido2 = recivido2;
						divisaRecivida1 = (String)lstDivisa1.getSelectedItem();
						divisaRecivida2 = (String)lstDivisa2.getSelectedItem();
						
						
						try {
							 
							 if(recivido1.isEmpty() || recivido2.isEmpty()) {
									throw new MyEcxeption(0);
								}  else if (Double.parseDouble(recivido1) == 0 || Double.parseDouble(recivido2) == 0) {
									throw new MyEcxeption(1);
								} 
							 
						 } catch (NumberFormatException eexeption){
							 
							 eexeption.printStackTrace();
							 throw new MyEcxeption(2);
								
						 }
						
						
						
						double monto = Double.parseDouble(recivido1);
						String monedaBase = "MXN";
						String monedaObjetivo = (String) valoresDivisa.get(divisaRecivida1);
						
						apiSolicitud api = new apiSolicitud("e3f8331596-974a05189e-rydmef");
						resultadoDivisa1 = String.valueOf(api.conversorDivisa(monto, monedaBase, monedaObjetivo));
						
						
						double monto2 = Double.parseDouble(recivido2);
						String monedaBase2 = (String) valoresDivisa.get(divisaRecivida2);
						String monedaObjetivo2 = "MXN";
						
						apiSolicitud api2 = new apiSolicitud("e3f8331596-974a05189e-rydmef");
						resultadoDivisa2 = String.valueOf(api2.conversorDivisa(monto2, monedaBase2, monedaObjetivo2));
						
						
						
						RespuestaConversorMonedas conversor = new  RespuestaConversorMonedas();
						conversor.main(null);
						dispose();
					}
				});
				
			}
			
			JSeparator separator_1 = new JSeparator();
			separator_1.setOrientation(SwingConstants.VERTICAL);
			buttonPane.add(separator_1);
			{
				JButton btnCerrar = new JButton("Cerrar");
				btnCerrar.setBackground(new Color(0, 0, 0));
				btnCerrar.setForeground(new Color(255, 255, 255));
				btnCerrar.setFont(new Font("VT323", Font.BOLD, 22));
				btnCerrar.setActionCommand("Cancel");
				buttonPane.add(btnCerrar);
				
				btnCerrar.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
					     System.exit(0);
						
					}
				});
				
			}
			
			btnMenuPrincipal.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent e) {
					Menu menu = new Menu();
					menu.main(null);
					dispose();
				}
			});
			
		}
				
		
	}
}
