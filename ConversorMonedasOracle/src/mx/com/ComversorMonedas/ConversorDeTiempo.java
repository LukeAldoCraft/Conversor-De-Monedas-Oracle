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

import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

import javax.swing.ImageIcon;


public class ConversorDeTiempo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField horaEntrada;
	private JTextField tiempoEntrada;
    private HashMap valoresTiempo = new HashMap();   
    public static String resultadoHora;
    public static String resultadoTiempo;
    public static String selectTiempo1;
    public static String selectTiempo2;
    public static String resibioHora;
    public static String resibidoTiempo;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try {
			ConversorDeTiempo dialog = new ConversorDeTiempo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public ConversorDeTiempo() {
		
		
		valoresTiempo.put("SEGUNDOS", 3600.00);
	    valoresTiempo.put("MINUTOS", 60.00);
	    valoresTiempo.put("DIAS", 0.0416667);
	    valoresTiempo.put("SEMANAS", 0.00595238);
	    valoresTiempo.put("MESES", 0.00136986);
		
		
		
		
		
		setBackground(new Color(0, 0, 0));
		setBounds(100, 100, 719, 434);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Conversor de Tiempo");
		lblNewJgoodiesTitle.setFont(new Font("VT323", Font.BOLD, 28));
		lblNewJgoodiesTitle.setBounds(207, 23, 259, 40);
		contentPanel.add(lblNewJgoodiesTitle);
		
		JLabel lblConvertirDeHora = new JLabel("Convertir de Hora a Tiempo:");
		lblConvertirDeHora.setFont(new Font("VT323", Font.BOLD, 22));
		lblConvertirDeHora.setBounds(23, 86, 280, 39);
		contentPanel.add(lblConvertirDeHora);
		
		JLabel lblIngresaValor = new JLabel("Ingresa valor:");
		lblIngresaValor.setFont(new Font("VT323", Font.BOLD, 22));
		lblIngresaValor.setBounds(33, 137, 146, 27);
		contentPanel.add(lblIngresaValor);
		
		horaEntrada = new JTextField();
		horaEntrada.setFont(new Font("VT323", Font.PLAIN, 22));
		horaEntrada.setColumns(10);
		horaEntrada.setBounds(178, 143, 100, 19);
		contentPanel.add(horaEntrada);
		
		final JComboBox lstTiempo1 = new JComboBox();
		lstTiempo1.setModel(new DefaultComboBoxModel(new String[] {"SEGUNDOS", "MINUTOS", "DIAS", "SEMANAS", "MESES"}));
		lstTiempo1.setForeground(Color.WHITE);
		lstTiempo1.setFont(new Font("VT323", Font.BOLD, 20));
		lstTiempo1.setBackground(Color.BLACK);
		lstTiempo1.setBounds(307, 139, 146, 24);
		contentPanel.add(lstTiempo1);
		
		JLabel lblConvertirDeHora_1 = new JLabel("Convertir de Tiempo a Hora:");
		lblConvertirDeHora_1.setFont(new Font("VT323", Font.BOLD, 22));
		lblConvertirDeHora_1.setBounds(23, 226, 280, 39);
		contentPanel.add(lblConvertirDeHora_1);
		
		JComboBox lstTiempo2 = new JComboBox();
		lstTiempo2.setModel(new DefaultComboBoxModel(new String[] {"SEGUNDOS", "MINUTOS", "DIAS", "SEMANAS", "MESES"}));
		lstTiempo2.setForeground(Color.WHITE);
		lstTiempo2.setFont(new Font("VT323", Font.BOLD, 20));
		lstTiempo2.setBackground(Color.BLACK);
		lstTiempo2.setBounds(307, 285, 146, 24);
		contentPanel.add(lstTiempo2);
		
		tiempoEntrada = new JTextField();
		tiempoEntrada.setFont(new Font("VT323", Font.PLAIN, 22));
		tiempoEntrada.setColumns(10);
		tiempoEntrada.setBounds(178, 287, 100, 19);
		contentPanel.add(tiempoEntrada);
		
		JLabel lblIngresaValor_1 = new JLabel("Ingresa valor:");
		lblIngresaValor_1.setFont(new Font("VT323", Font.BOLD, 22));
		lblIngresaValor_1.setBounds(33, 283, 146, 27);
		contentPanel.add(lblIngresaValor_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/home/aldo/Documentos/EscuelaTareas/Conversor-De-Monedas-Oracle/ConversorMonedasOracle/bin/mx/com/fuentes/RELOJ2.png"));
		lblNewLabel.setBounds(488, 31, 191, 298);
		contentPanel.add(lblNewLabel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(154, 153, 150));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnMenuPrincipal = new JButton("Menu Principal");
				btnMenuPrincipal.setForeground(Color.WHITE);
				btnMenuPrincipal.setFont(new Font("VT323", Font.BOLD, 22));
				btnMenuPrincipal.setBackground(Color.BLACK);
				buttonPane.add(btnMenuPrincipal);
				
				btnMenuPrincipal.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
				          Menu menu = new Menu();
				          menu.main(null);
				          dispose();
					}
				});
				
			}
			{
				JSeparator separator = new JSeparator();
				separator.setOrientation(SwingConstants.VERTICAL);
				buttonPane.add(separator);
			}
			{
				JButton btnIniciar = new JButton("Iniciar");
				btnIniciar.setForeground(Color.WHITE);
				btnIniciar.setFont(new Font("VT323", Font.BOLD, 22));
				btnIniciar.setBackground(Color.BLACK);
				btnIniciar.setActionCommand("OK");
				buttonPane.add(btnIniciar);
				
				btnIniciar.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						
						 String textoHora = horaEntrada.getText();
						 String textoTiempo = tiempoEntrada.getText();
						 resibioHora = textoHora;
						 resibidoTiempo = textoTiempo;
						 
						 try {
							 
							 if(textoHora.isEmpty() || textoTiempo.isEmpty()) {
									throw new MyEcxeption(0);
								}  else if (Double.parseDouble(textoHora) == 0 || Double.parseDouble(textoTiempo) == 0) {
									throw new MyEcxeption(1);
								} 
							 
						 } catch (NumberFormatException eexeption){
							 
							 eexeption.printStackTrace();
							 throw new MyEcxeption(2);
								
						 }
						 
						 selectTiempo1 = (String) lstTiempo1.getSelectedItem();
						 
						resultadoHora = String.valueOf((Double) valoresTiempo.get(selectTiempo1) * Double.parseDouble(textoHora));
						 
						selectTiempo2 = (String) lstTiempo2.getSelectedItem();
						
						resultadoTiempo = String.valueOf( Double.parseDouble(textoTiempo) / (Double) valoresTiempo.get(selectTiempo2));
						
						RespuestaConversorDeTiempo respuesta = new RespuestaConversorDeTiempo();
						respuesta.main(null);
						dispose();
					}
				});
			}
			{
				JSeparator separator = new JSeparator();
				separator.setOrientation(SwingConstants.VERTICAL);
				buttonPane.add(separator);
			}
			{
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
			}
			
			
		}
		
		
	}
}
