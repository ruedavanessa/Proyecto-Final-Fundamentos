package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VueloView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	 JTextField numero;
	 private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VueloView frame = new VueloView();
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
	public VueloView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 578, 446);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero");
		lblNewLabel.setBounds(10, 11, 46, 14);
		contentPane.add(lblNewLabel);
		
		numero = new JTextField();
		numero.setBounds(76, 9, 104, 17);
		contentPane.add(numero);
		numero.setColumns(10);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerDateModel(new Date(1762837200000L), new Date(1762837200000L), null, Calendar.DAY_OF_YEAR));
		spinner.setBounds(396, 107, 156, 30);
		contentPane.add(spinner);
		
		JLabel lblOrigen = new JLabel("Origen");
		lblOrigen.setBounds(10, 60, 46, 14);
		contentPane.add(lblOrigen);
		
		JLabel lblDestino = new JLabel("Destino");
		lblDestino.setBounds(10, 115, 58, 14);
		contentPane.add(lblDestino);
		
		JLabel lblAerolinea = new JLabel("Aerolinea");
		lblAerolinea.setBounds(316, 60, 58, 14);
		contentPane.add(lblAerolinea);
		
		JLabel lblAsientos = new JLabel("Asientos");
		lblAsientos.setBounds(316, 11, 58, 14);
		contentPane.add(lblAsientos);
		
		JLabel lblFecha = new JLabel("FechaHoraSalida");
		lblFecha.setBounds(288, 115, 86, 14);
		contentPane.add(lblFecha);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1A", "1B ", "1C ", "1D", "1E"}));
		comboBox.setBounds(400, 7, 75, 22);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Avianca ", "LATAM", "Viva Air", "Wingo"}));
		comboBox_1.setBounds(400, 56, 86, 22);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Medellin", "Cartagena ", "Bucaramanga", "Cali", "Barranquilla "}));
		comboBox_2.setBounds(78, 111, 102, 22);
		contentPane.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Medellin", "Cartagena ", "Bucaramanga", "Cali", "Barranquilla "}));
		comboBox_3.setBounds(75, 56, 112, 22);
		contentPane.add(comboBox_3);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		table.setBounds(55, 235, 458, 161);
		contentPane.add(table);
		
		JButton btnConsultar = new JButton("Consultar Vuelo");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnConsultar.setBounds(147, 170, 128, 37);
		contentPane.add(btnConsultar);
		
		JButton btnEliminar = new JButton("Eliminar Vuelo");
		btnEliminar.setBounds(440, 170, 112, 37);
		contentPane.add(btnEliminar);
		
		JButton btnActualizar = new JButton("Actualizar Vuelo");
		btnActualizar.setBounds(285, 170, 136, 37);
		contentPane.add(btnActualizar);
		
		JButton btnCrear = new JButton("Crear Vuelo");
		btnCrear.setBounds(10, 170, 128, 37);
		contentPane.add(btnCrear);

	}
}
