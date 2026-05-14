package com.mycompany.formuladebhaskara;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormulaDeBhaskara extends JFrame {

    JLabel rotulo1, rotulo2, rotulo3, resultado, titulo;
    JTextField texto1, texto2, texto3;
    JButton calcular;

    public FormulaDeBhaskara() {

        super("Bhaskara");

        Container tela = getContentPane();
        setLayout(null);

        titulo = new JLabel("- FÓRMULA DE BHASKARA -");
        titulo.setForeground(Color.RED);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        titulo.setBounds(90, 10, 420, 30);
        

        rotulo1 = new JLabel("Valor de A:");
        rotulo2 = new JLabel("Valor de B:");
        rotulo3 = new JLabel("Valor de C:");

        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);

        resultado = new JLabel("");

        calcular = new JButton("Calcular");

        rotulo1.setBounds(50, 70, 100, 20);
        texto1.setBounds(150, 70, 120, 20);

        rotulo2.setBounds(50, 110, 100, 20);
        texto2.setBounds(150, 110, 120, 20);

        rotulo3.setBounds(50, 150, 100, 20);
        texto3.setBounds(150, 150, 120, 20);

        calcular.setBounds(140, 210, 120, 30);

        resultado.setBounds(50, 270, 320, 20);

        calcular.setForeground(Color.BLACK);

        calcular.setBackground(new Color(255, 255, 153));
        calcular.setOpaque(true);
        calcular.setBorderPainted(false);

        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double a = Double.parseDouble(texto1.getText());
                double b = Double.parseDouble(texto2.getText());
                double c = Double.parseDouble(texto3.getText());

                double delta = Math.pow(b, 2) - (4 * a * c);

                resultado.setVisible(true);

                if (delta < 0) {

                    resultado.setText("Não existem raízes reais.");

                } else {

                    double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                    resultado.setText("X1 = " + x1 + " | X2 = " + x2);

                }
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

        tela.add(calcular);

        tela.add(resultado);

        setSize(420, 380);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        new FormulaDeBhaskara();

    }
}