
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class cadastroaluno extends JFrame {
    JLabel rotulo1, rotulo2, rotulo3, rotulo4, rotulo5, rotulo6, rotulo7, rotulo8,rotulo9, rotulo10, rotulo11;
    JTextField texto1,texto2, texto3, texto4,texto5,texto6,texto7;
    JButton button1, button2, button3;
    JPasswordField caixa;
    JComboBox lista;
String opcoes[]={"Administração","Logística","Informática","Contabilidade"};

public cadastroaluno(){
    super("Cadastro do Aluno");
    Container tela = getContentPane();
    tela.setLayout(null);
     tela.setBackground(java.awt.Color.white);
     
    rotulo1 = new JLabel("Aluno");
    rotulo2 = new JLabel("RM");
    rotulo3 = new JLabel("Senha");
    rotulo4 = new JLabel("E-mail");
    rotulo5 = new JLabel("Nome");
    rotulo6 = new JLabel("Curso");
    rotulo7 = new JLabel("Ano");
    rotulo8 = new JLabel("Responsável");
    rotulo9 = new JLabel("Nome");
    rotulo10 = new JLabel("E-mail");
    rotulo11 = new JLabel("Telefone");
    texto1 = new JTextField(10);
    texto2 = new JTextField(10);
    texto3 = new JTextField(10);
    texto4 = new JTextField(10);
    texto5 = new JTextField(10);
    texto6 = new JTextField(10);
    texto7 = new JTextField(10); 
    button1 = new JButton("Importar Foto");
    button1.setForeground(java.awt.Color.red);
    button2 = new JButton("Enviar");
    button2.setForeground(java.awt.Color.red);
    button3 = new JButton("Voltar");
    button3.setForeground(java.awt.Color.red);
    caixa = new JPasswordField(10);
    lista = new JComboBox(opcoes);
            lista.setMaximumRowCount(3);
            
     button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
    cadastro cad = new cadastro();
          
     dispose();}});
            
    rotulo1.setBounds(69,30,370,20);
    rotulo2.setBounds(100,70,24,14);
    rotulo3.setBounds(251,70,38,13);
    rotulo4.setBounds(100,100,35,13);
    rotulo5.setBounds(100,138,35,13);
    rotulo6.setBounds(100,179,34,13);
    rotulo7.setBounds(263,179,26,13);
    rotulo8.setBounds(69,200,370,150);
    rotulo9.setBounds(100,297,35,13);
    rotulo10.setBounds(100,340,35,13);
    rotulo11.setBounds(95,377,100,13);
    texto1.setBounds(141,100,254,20);
    texto2.setBounds(141,70,100,20);
    texto3.setBounds(141,130,254,20);
    texto4.setBounds(295,175,100,20);
    texto5.setBounds(146,294,247,20);
    texto6.setBounds(146,335,247,20);
    texto7.setBounds(146,376,100,20);
    button1.setBounds(141,225,150,23);
    button2.setBounds(100,412,100,23);
    button3.setBounds(320,412,100,23); 
    caixa.setBounds(295,70,100,20);
    lista.setBounds(141,180,110,20);
    
     tela.add(rotulo1);
     tela.add(rotulo2);
     tela.add(rotulo3);
     tela.add(rotulo4);
     tela.add(rotulo5);
     tela.add(rotulo6);
     tela.add(rotulo7);
     tela.add(rotulo8);
     tela.add(rotulo9);
     tela.add(rotulo10);
     tela.add(rotulo11);
     tela.add(texto1);
     tela.add(texto2);
     tela.add(texto3);
     tela.add(texto4);
     tela.add(texto5);
     tela.add(texto6);
     tela.add(texto7);
     tela.add(button1);
     tela.add(button2);
     tela.add(button3);
     tela.add(caixa);
     tela.add(lista);
     setSize(500,500);
     setVisible(true);
    
}
}
