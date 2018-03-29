
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class cadastro extends JFrame {
    JLabel rotulo1;
    JRadioButton opcao1, opcao2;
    JButton button1;
    ButtonGroup grupo;
    public cadastro(){
       super("Cadastro");
       Container tela = getContentPane();
       tela.setBackground(java.awt.Color.white);
       tela.setLayout(null);
       rotulo1 = new JLabel("Você é:");
       opcao1 = new JRadioButton ("Aluno");
       opcao2 = new JRadioButton ("Coordenação");
       button1 = new JButton ("Enviar");
       button1.setForeground(java.awt.Color.red);
       rotulo1.setBounds(164,159,44,13);
       opcao1.setBounds(167,178,100,17);
       opcao2.setBounds(167,201,150,17);
       button1.setBounds(167,233,100,23);
       grupo = new ButtonGroup();
       grupo.add(opcao1);
       grupo.add(opcao2);
       
       button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
    if(opcao1.isSelected())
    {cadastroaluno cadaluno = new cadastroaluno();}
    else
        if(opcao2.isSelected())
    {cadastrocoordenacao cadcoor = new cadastrocoordenacao();{
    }
    dispose();}}});
       tela.add(rotulo1);
       tela.add(opcao1);
       tela.add(opcao2);
       tela.add(button1);
       setSize(500,500);
       setVisible(true);
    }
            
   
    }  
    
    

