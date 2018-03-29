
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.paint.Color;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class cadastrocoordenacao extends JFrame {
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7;
    JTextField texto1,texto2, texto3, texto4;
    JButton button1, button2, button3 ;
    JPasswordField caixa;
    JComboBox lista;
String opcoes[]={"Diretor(a)","Coordenador(a)","Secretário(a)","Professor(a)"};

public cadastrocoordenacao(){
    super("Cadastro do Coordenação");
    Container tela = getContentPane();
    tela.setLayout(null);
     tela.setBackground(java.awt.Color.white);
    
    rotulo1 = new JLabel("Coordenação");
    rotulo1.setForeground(java.awt.Color.red);
    rotulo2 = new JLabel("ID");
    rotulo3 = new JLabel("Senha");
    rotulo4 = new JLabel("E-mail");
    rotulo5 = new JLabel("Nome");
    rotulo6 = new JLabel("Cargo");
    rotulo7 = new JLabel("Contato");
    texto1 = new JTextField(10);
    texto2 = new JTextField(10);
    texto3 = new JTextField(10);
    texto4 = new JTextField(10);
    button1 = new JButton("Importar Foto");
     button1.setForeground(java.awt.Color.red);
    button2 = new JButton("Enviar");
     button2.setForeground(java.awt.Color.red);
    button3 = new JButton("Voltar");
     button3.setForeground(java.awt.Color.red);
    caixa = new JPasswordField(10);
    lista = new JComboBox(opcoes);
            lista.setMaximumRowCount(4);
            
            button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
    cadastro cad = new cadastro();
          
     dispose();}});
            
    rotulo1.setBounds(57,86,370,20);
    rotulo2.setBounds(112,134,18,13);
    rotulo3.setBounds(246,134,38,13);
    rotulo4.setBounds(95,175,35,13);
    rotulo5.setBounds(95,216,35,13);
    rotulo6.setBounds(95,257,35,13);
    rotulo7.setBounds(240,257,44,13);
    texto1.setBounds(136,130,100,20);
    texto2.setBounds(136,171,254,20);
    texto3.setBounds(136,212,254,20);
    texto4.setBounds(290,253,100,20);
    button1.setBounds(136,302,130,23);
    button2.setBounds(100,412,100,23);
    button3.setBounds(320,412,100,23); 
    caixa.setBounds(290,130,100,20);
    lista.setBounds(136,253,100,20);
    
    tela.add(rotulo1);
     tela.add(rotulo2);
     tela.add(rotulo3);
     tela.add(rotulo4);
     tela.add(rotulo5);
     tela.add(rotulo6);
     tela.add(rotulo7);
     tela.add(texto1);
     tela.add(texto2);
     tela.add(texto3);
     tela.add(texto4);
     tela.add(button1);
     tela.add(button2);
     tela.add(button3);
     tela.add(caixa);
     tela.add(lista);
     setSize(500,500);
     setVisible(true);
    
}
}
