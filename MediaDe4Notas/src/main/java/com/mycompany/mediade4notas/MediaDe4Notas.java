package com.mycompany.mediade4notas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MediaDe4Notas extends JFrame {

    JLabel rotulo1, rotulo2, rotulo3, rotulo4, resultado, titulo;
    JTextField texto1, texto2, texto3, texto4;
    JButton calcular;

    public MediaDe4Notas() {

        super("Média de Notas");

        Container tela = getContentPane();
        setLayout(null);

        titulo = new JLabel("- MÉDIA DE NOTAS -");
        titulo.setForeground(Color.RED);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        titulo.setBounds(110, 10, 420, 30);
        

        rotulo1 = new JLabel("Nota 1:");
        rotulo2 = new JLabel("Nota 2:");
        rotulo3 = new JLabel("Nota 3:");
        rotulo4 = new JLabel("Nota 4:");

        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);
        texto4 = new JTextField(5);

        resultado = new JLabel("");

        calcular = new JButton("Calcular Média");

        rotulo1.setBounds(50, 60, 100, 20);
        texto1.setBounds(150, 60, 120, 20);

        rotulo2.setBounds(50, 100, 100, 20);
        texto2.setBounds(150, 100, 120, 20);

        rotulo3.setBounds(50, 140, 100, 20);
        texto3.setBounds(150, 140, 120, 20);

        rotulo4.setBounds(50, 180, 100, 20);
        texto4.setBounds(150, 180, 120, 20);

        calcular.setBounds(110, 230, 150, 30);

        resultado.setBounds(50, 290, 300, 20);

        calcular.setForeground(Color.BLACK);

        calcular.setBackground(new Color(144, 238, 144));
        calcular.setOpaque(true);
        calcular.setBorderPainted(false);

        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double n1 = Double.parseDouble(texto1.getText());
                double n2 = Double.parseDouble(texto2.getText());
                double n3 = Double.parseDouble(texto3.getText());
                double n4 = Double.parseDouble(texto4.getText());

                double media = (n1 + n2 + n3 + n4) / 4;

                resultado.setVisible(true);

                resultado.setText("Média = " + media);
            }
        });

        resultado.setVisible(false);

        tela.add(titulo);

        tela.add(rotulo1);
        tela.add(texto1);

        tela.add(rotulo2);
        tela.add(texto2);

        tela.add(rotulo3);
        tela.add(texto3);

        tela.add(rotulo4);
        tela.add(texto4);

        tela.add(calcular);

        tela.add(resultado);

        setSize(400, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        new MediaDe4Notas();

    }
}