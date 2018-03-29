import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.ParseException;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;

public class registro extends JFrame {

	private JPanel contentPane;
	private JTextField txtRm;
	private final ButtonGroup buttonGroup = new ButtonGroup();
        JMenuBar barra;
        JMenu Ajuda;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public registro(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
                barra = new JMenuBar();
                setJMenuBar(barra);
                Ajuda = new JMenu("Ajuda");
                 Ajuda.addActionListener(new ActionListener() {
                    
                    public void actionPerformed(ActionEvent evt) {  
                    	JOptionPane.showMessageDialog (null, "Está é a página de registros. Nela você insere seus dados e efetua seu cadastro. "); 
                    }  
              });
                barra.add(Ajuda);
		
		JLabel lblRM = new JLabel("RM");
		lblRM.setBounds(192, 28, 46, 14);
		contentPane.add(lblRM);
		
		JLabel lblHora = new JLabel("Hor\u00E1rio");
		lblHora.setBounds(192, 123, 46, 14);
		contentPane.add(lblHora);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setBounds(192, 176, 46, 14);
		contentPane.add(lblCurso);
		
		JLabel lblAula = new JLabel("Aula");
		lblAula.setBounds(192, 230, 46, 14);
		contentPane.add(lblAula);
		
		JLabel lblAut = new JLabel("Autoriza\u00E7\u00E3o dos Pais");
		lblAut.setBounds(192, 284, 200, 14);
		contentPane.add(lblAut);
		
		JRadioButton rdbtnSim = new JRadioButton("Sim");
		buttonGroup.add(rdbtnSim);
		rdbtnSim.setBounds(192, 301, 109, 23);
		contentPane.add(rdbtnSim);
		
		JRadioButton rdbtnNao = new JRadioButton("N\u00E3o");
		buttonGroup.add(rdbtnNao);
		rdbtnNao.setBounds(192, 322, 109, 23);
		contentPane.add(rdbtnNao);
		
		txtRm = new JTextField();
		txtRm.setBounds(192, 42, 100, 20);
		contentPane.add(txtRm);
		txtRm.setColumns(10);
	 
		MaskFormatter maskhora = null;
		try {
			maskhora = new MaskFormatter ("##:##");
			maskhora.setPlaceholderCharacter('_');
		} catch (ParseException excp) {}
		JFormattedTextField txtHora = new JFormattedTextField(maskhora);
		txtHora.setBounds(192, 143, 100, 20);
		contentPane.add(txtHora);
		
		
		JComboBox cmbCurso = new JComboBox();
		cmbCurso.setModel(new DefaultComboBoxModel(new String[] {"Administra\u00E7\u00E3o", "Contabilidade", "Inform\u00E1tica", "Log\u00EDstica", "Servi\u00E7os Jur\u00EDdicos"}));
		cmbCurso.setBounds(192, 190, 100, 20);
		contentPane.add(cmbCurso);
		
		JComboBox cmbAula = new JComboBox();
		cmbAula.setModel(new DefaultComboBoxModel(new String[] {"1�", "2�", "3�", "4�", "5�", "6�", "7�", "8�"}));
		cmbAula.setBounds(192, 244, 100, 20);
		contentPane.add(cmbAula);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(192, 352, 100, 23);
		contentPane.add(btnEnviar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				telacoordenacao tela = new telacoordenacao ();
				tela.setVisible(true);
				dispose();
			}
		});
		btnVoltar.setBounds(192, 386, 100, 23);
		contentPane.add(btnVoltar);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setBounds(192, 75, 46, 14);
		contentPane.add(lblDia);
		
		MaskFormatter maskdata = null;
		try {
			maskdata = new MaskFormatter ("##/##/##");
			maskdata.setPlaceholderCharacter('_');
		} catch (ParseException excp) {}
		JFormattedTextField txtDia = new JFormattedTextField(maskdata);
		txtDia.setBounds(192, 90, 100, 20);
		contentPane.add(txtDia);
		
	}
}