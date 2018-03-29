
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class senha extends JFrame {
JLabel rotulo1, rotulo2, rotulo3;
JTextField texto1,texto2;
JButton button1;

public senha(){
            super("Nova Senha");
            Container tela = getContentPane();
            tela.setBackground(java.awt.Color.white);
            setLayout(null);
            rotulo1 = new JLabel("RM/ID");
            rotulo2 = new JLabel ("E-mail");
            rotulo3 = new JLabel ("A senha será enviada em seu e-mail");
            texto1 = new JTextField(10);
            texto2 = new JTextField(10);
            button1 = new JButton("Enviar");
            button1.setForeground(java.awt.Color.red);
            
            rotulo1.setBounds(114,153,43,13);
            rotulo2.setBounds(114,212,100,13);
            rotulo3.setBounds(114,297,250,13);
            texto1.setBounds(117,169,100,20);
            texto2.setBounds(117,228,254,20);
            button1.setBounds(205,261,75,23);
            
            tela.add(rotulo1);
            tela.add(rotulo2);
            tela.add(rotulo3);
            tela.add(texto1);
            tela.add(texto2);
            tela.add(button1);
            setSize(500,500);
            setVisible(true);
}
}