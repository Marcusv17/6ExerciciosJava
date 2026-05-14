package com.mycompany.teoremadepitagoras;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TeoremaDePitagoras extends JFrame {

    JLabel rotulo1, rotulo2, resultado, titulo;
    JTextField texto1, texto2;
    JButton calcular;

    public TeoremaDePitagoras() {

        super("Teorema de Pitágoras");

        Container tela = getContentPane();
        setLayout(null);

        titulo = new JLabel("- TEOREMA DE PITÁGORAS -");
        titulo.setForeground(Color.RED);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        titulo.setBounds(85, 10, 300, 30);

        rotulo1 = new JLabel("Cateto A:");
        rotulo2 = new JLabel("Cateto B:");

        texto1 = new JTextField(5);
        texto2 = new JTextField(5);

        resultado = new JLabel("");

        calcular = new JButton("Calcular");

        rotulo1.setBounds(50, 70, 100, 20);
        texto1.setBounds(150, 70, 120, 20);

        rotulo2.setBounds(50, 110, 100, 20);
        texto2.setBounds(150, 110, 120, 20);

        calcular.setBounds(130, 160, 120, 30);

        resultado.setBounds(50, 220, 300, 20);

        calcular.setForeground(Color.BLACK);

        calcular.setBackground(new Color(173, 216, 230));
        calcular.setOpaque(true);
        calcular.setBorderPainted(false);

        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double a = Double.parseDouble(texto1.getText());
                double b = Double.parseDouble(texto2.getText());

                double c = Math.sqrt((a * a) + (b * b));

                resultado.setVisible(true);

                resultado.setText("Hipotenusa = " + c);
            }
        });

        resultado.setVisible(false);

        tela.add(titulo);

        tela.add(rotulo1);
        tela.add(texto1);

        tela.add(rotulo2);
        tela.add(texto2);

        tela.add(calcular);

        tela.add(resultado);

        setSize(400, 350);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        new TeoremaDePitagoras();

    }
}