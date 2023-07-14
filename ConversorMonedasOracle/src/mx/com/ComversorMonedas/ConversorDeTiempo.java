package mx.com.ComversorMonedas;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class ConversorDeTiempo extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField horaEntrada1;
	private JTextField horaEntrada2;

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
		
		horaEntrada1 = new JTextField();
		horaEntrada1.setFont(new Font("VT323", Font.PLAIN, 22));
		horaEntrada1.setColumns(10);
		horaEntrada1.setBounds(178, 143, 44, 19);
		contentPanel.add(horaEntrada1);
		
		JComboBox lstTiempo1 = new JComboBox();
		lstTiempo1.setModel(new DefaultComboBoxModel(new String[] {"SEGUNDOS", "MINUTOS", "DIAS", "SEMANAS", "AÑOS"}));
		lstTiempo1.setForeground(Color.WHITE);
		lstTiempo1.setFont(new Font("VT323", Font.BOLD, 20));
		lstTiempo1.setBackground(Color.BLACK);
		lstTiempo1.setBounds(233, 140, 146, 24);
		contentPanel.add(lstTiempo1);
		
		JLabel lblConvertirDeHora_1 = new JLabel("Convertir de Tiempo a Hora:");
		lblConvertirDeHora_1.setFont(new Font("VT323", Font.BOLD, 22));
		lblConvertirDeHora_1.setBounds(23, 226, 280, 39);
		contentPanel.add(lblConvertirDeHora_1);
		
		JComboBox lstTiempo2 = new JComboBox();
		lstTiempo2.setModel(new DefaultComboBoxModel(new String[] {"SEGUNDOS", "MINUTOS", "DIAS", "SEMANAS", "AÑOS"}));
		lstTiempo2.setForeground(Color.WHITE);
		lstTiempo2.setFont(new Font("VT323", Font.BOLD, 20));
		lstTiempo2.setBackground(Color.BLACK);
		lstTiempo2.setBounds(33, 285, 146, 24);
		contentPanel.add(lstTiempo2);
		
		horaEntrada2 = new JTextField();
		horaEntrada2.setFont(new Font("VT323", Font.PLAIN, 22));
		horaEntrada2.setColumns(10);
		horaEntrada2.setBounds(361, 287, 44, 19);
		contentPanel.add(horaEntrada2);
		
		JLabel lblIngresaValor_1 = new JLabel("Ingresa valor:");
		lblIngresaValor_1.setFont(new Font("VT323", Font.BOLD, 22));
		lblIngresaValor_1.setBounds(208, 283, 146, 27);
		contentPanel.add(lblIngresaValor_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(ConversorDeTiempo.class.getResource("/mx/com/fuentes/RELOJ2.png")));
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
			}
		}
	}
}
