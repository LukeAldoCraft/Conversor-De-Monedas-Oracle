package mx.com.ComversorMonedas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
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
		
	    
	    String jarPath2 = new File(Menu.class.getProtectionDomain().getCodeSource().getLocation().getPath()).getParent();
        String fontPath = jarPath2 + File.separator + "fuentes" + File.separator + "VT323-Regular.ttf";
        
	 
		setBackground(new Color(0, 0, 0));
		setBounds(100, 100, 845, 556);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("Conversor de Tiempo");
		lblNewJgoodiesTitle.setFont(new Font("VT323", Font.BOLD, 20));
		lblNewJgoodiesTitle.setBounds(207, 23, 259, 40);
		contentPanel.add(lblNewJgoodiesTitle);
		
		JLabel lblConvertirDeHora = new JLabel("Convertir de Hora a Tiempo:");
		lblConvertirDeHora.setFont(new Font("VT323", Font.BOLD, 16));
		lblConvertirDeHora.setBounds(23, 86, 280, 39);
		contentPanel.add(lblConvertirDeHora);
		
		JLabel lblIngresaValor = new JLabel("Ingresa valor:");
		lblIngresaValor.setFont(new Font("VT323", Font.BOLD, 16));
		lblIngresaValor.setBounds(33, 137, 146, 27);
		contentPanel.add(lblIngresaValor);
		
		horaEntrada = new JTextField();
		horaEntrada.setFont(new Font("VT323", Font.PLAIN, 16));
		horaEntrada.setColumns(10);
		horaEntrada.setBounds(178, 143, 100, 19);
		contentPanel.add(horaEntrada);
		
		final JComboBox lstTiempo1 = new JComboBox();
		lstTiempo1.setModel(new DefaultComboBoxModel(new String[] {"SEGUNDOS", "MINUTOS", "DIAS", "SEMANAS", "MESES"}));
		lstTiempo1.setForeground(Color.WHITE);
		lstTiempo1.setFont(new Font("VT323", Font.BOLD, 16));
		lstTiempo1.setBackground(Color.BLACK);
		lstTiempo1.setBounds(307, 139, 146, 24);
		contentPanel.add(lstTiempo1);
		
		JLabel lblConvertirDeHora_1 = new JLabel("Convertir de Tiempo a Hora:");
		lblConvertirDeHora_1.setFont(new Font("VT323", Font.BOLD, 16));
		lblConvertirDeHora_1.setBounds(23, 226, 280, 39);
		contentPanel.add(lblConvertirDeHora_1);
		
		JComboBox lstTiempo2 = new JComboBox();
		lstTiempo2.setModel(new DefaultComboBoxModel(new String[] {"SEGUNDOS", "MINUTOS", "DIAS", "SEMANAS", "MESES"}));
		lstTiempo2.setForeground(Color.WHITE);
		lstTiempo2.setFont(new Font("VT323", Font.BOLD, 16));
		lstTiempo2.setBackground(Color.BLACK);
		lstTiempo2.setBounds(307, 285, 146, 24);
		contentPanel.add(lstTiempo2);
		
		tiempoEntrada = new JTextField();
		tiempoEntrada.setFont(new Font("VT323", Font.PLAIN, 16));
		tiempoEntrada.setColumns(10);
		tiempoEntrada.setBounds(178, 287, 100, 19);
		contentPanel.add(tiempoEntrada);
		
		JLabel lblIngresaValor_1 = new JLabel("Ingresa valor:");
		lblIngresaValor_1.setFont(new Font("VT323", Font.BOLD, 16));
		lblIngresaValor_1.setBounds(33, 283, 146, 27);
		contentPanel.add(lblIngresaValor_1);
		
		JLabel lblNewLabel = new JLabel("");
		String jarPath = new File(Menu.class.getProtectionDomain().getCodeSource().getLocation().getPath()).getParent();
        String imagePath = jarPath + File.separator + "fuentes" + File.separator + "RELOJ2.png";
		lblNewLabel.setIcon(new ImageIcon(imagePath));
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
				btnMenuPrincipal.setFont(new Font("VT323", Font.BOLD, 16));
				btnMenuPrincipal.setBackground(Color.BLACK);
				buttonPane.add(btnMenuPrincipal);
				
				btnMenuPrincipal.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
				          Menu menu = new Menu();
				          menu.main(null);
				          dispose();
					}
				});
				

				 try {
			            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPath));
			         
			            customFont = customFont.deriveFont(Font.BOLD, 20); 
			            
			           
			           btnMenuPrincipal.setFont(customFont);
			            
			        } catch (IOException | FontFormatException e) {
			            ((Throwable) e).printStackTrace();
			           
			        }
				
			}
			{
				JSeparator separator = new JSeparator();
				separator.setOrientation(SwingConstants.VERTICAL);
				buttonPane.add(separator);
			}
			{
				JButton btnIniciar = new JButton("Iniciar");
				btnIniciar.setForeground(Color.WHITE);
				btnIniciar.setFont(new Font("VT323", Font.BOLD, 16));
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
				
				
				
				 try {
			            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPath));
			           
			            customFont = customFont.deriveFont(Font.BOLD, 20); 
			            
			           
			           btnIniciar.setFont(customFont);
			            
			        } catch (IOException | FontFormatException e) {
			            ((Throwable) e).printStackTrace();
			           
			        }
				
				
			}
			{
				JSeparator separator = new JSeparator();
				separator.setOrientation(SwingConstants.VERTICAL);
				buttonPane.add(separator);
			}
			{
				JButton btnCerrar = new JButton("Cerrar");
				btnCerrar.setForeground(Color.WHITE);
				btnCerrar.setFont(new Font("VT323", Font.BOLD, 16));
				btnCerrar.setBackground(Color.BLACK);
				btnCerrar.setActionCommand("Cancel");
				buttonPane.add(btnCerrar);
				
				btnCerrar.addActionListener(new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
						
					}
				});
				

				 try {
			            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPath));
			         
			            customFont = customFont.deriveFont(Font.BOLD, 20); 
			            
			           
			           btnCerrar.setFont(customFont);
			            
			        } catch (IOException | FontFormatException e) {
			            ((Throwable) e).printStackTrace();
			           
			        }
				
				
			}
			
			
		}

		
		 try {
	            Font customFont = Font.createFont(Font.TRUETYPE_FONT, new File(fontPath));
	            Font customFont2 = Font.createFont(Font.TRUETYPE_FONT, new File(fontPath));
	            customFont = customFont.deriveFont(Font.BOLD, 20); 
	            customFont2 = customFont2.deriveFont(Font.BOLD, 26); 
	            
	           lblNewJgoodiesTitle.setFont(customFont2);
	           lblConvertirDeHora.setFont(customFont);
	           lblIngresaValor.setFont(customFont);
	           horaEntrada.setFont(customFont);
	           lstTiempo1.setFont(customFont);
	           lblConvertirDeHora_1.setFont(customFont);
	           lstTiempo2.setFont(customFont);
	           tiempoEntrada.setFont(customFont);
	           lblIngresaValor_1.setFont(customFont);
	           
	            
	        } catch (IOException | FontFormatException e) {
	            ((Throwable) e).printStackTrace();
	           
	        }
		 
	}
}
