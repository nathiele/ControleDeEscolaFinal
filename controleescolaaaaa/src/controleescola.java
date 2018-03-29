
import java.awt.Container;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.event.*;
import java.awt.*;
import javafx.scene.paint.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class controleescola extends JFrame{
JLabel rotulo1, rotulo2, rotulo3,imagem;
JTextField texto1;
JPasswordField caixa;
JButton button1, button2, button3;
JComboBox lista;
String opcoes[]={"Aluno","Coordenação"};
ImageIcon icone;


        public controleescola(){
            super("Login");
            Container tela = getContentPane();
            setLayout(null);
            tela.setBackground(java.awt.Color.white);
            rotulo1 = new JLabel("Entrar como:");
            rotulo2 = new JLabel ("RM/ID");
            rotulo3 = new JLabel ("Senha");
            texto1 = new JTextField(10);
            icone = new ImageIcon("logo.png");
            caixa = new JPasswordField(10);
            imagem  =new JLabel (icone);
            button1 = new JButton("Entrar");
            button1.setForeground(java.awt.Color.red);
            button2 = new JButton("Cadastrar-se");
            button2.setForeground(java.awt.Color.red);
            button3 = new JButton("Recuperar Senha");
            button3.setForeground(java.awt.Color.red);
            lista = new JComboBox(opcoes);
            lista.setMaximumRowCount(2);
            rotulo1.setBounds(230,90,100,20);
            rotulo2.setBounds(230,150,100,20);
            rotulo3.setBounds(230,210,100,20);
            texto1.setBounds(230,170,150,20);
            caixa.setBounds(230,230,150,20);
            button1.setBounds(230,280,150,20);
            button2.setBounds(230,315,150,20);
            button3.setBounds(230,345,150,20);
            lista.setBounds(230,115,150,20);
            imagem.setBounds(10,30,200,420);
            
            
            
            
            button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
    if(lista.getSelectedItem().toString() == "Aluno")
        
    {telaaluno telaa = new telaaluno();
    }
    
    else
        
        if(lista.getSelectedItem().toString() == "Coordenação")
    {telacoordenacao telac = new telacoordenacao();
    
    
    dispose();}}});
            
            button2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
    cadastro cad = new cadastro();
          
     dispose();}});
            
            button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
    senha senha = new senha ();
          
     dispose();}});
           
            
            tela.add(rotulo1);
            tela.add(rotulo2);
            tela.add(rotulo3);
            tela.add(texto1);
            tela.add(caixa);
            tela.add(button1); 
            tela.add(button2);
            tela.add(button3);
            tela.add(lista);
            tela.add(imagem);
            setSize(500,500);
            setVisible(true);
        }
        
               
    
    public static void main(String[] args) {
       controleescola app= new controleescola();
       app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
