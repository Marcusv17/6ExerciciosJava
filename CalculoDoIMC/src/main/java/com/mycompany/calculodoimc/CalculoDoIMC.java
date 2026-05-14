package com.mycompany.calculodoimc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculoDoIMC extends JFrame {

    JLabel rotuloPeso, rotuloAltura, resultado, titulo;
    JTextField textoPeso, textoAltura;
    JButton calcular;

    public CalculoDoIMC() {

        super("Cálculo IMC");

        Container tela = getContentPane();
        setLayout(null);

        titulo = new JLabel("- CÁLCULO IMC -");
        titulo.setForeground(Color.RED);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        titulo.setBounds(135, 10, 420, 30);
        

        rotuloPeso = new JLabel("Peso:");
        rotuloAltura = new JLabel("Altura:");

        textoPeso = new JTextField(5);
        textoAltura = new JTextField(5);

        resultado = new JLabel("");

        calcular = new JButton("Calcular IMC");

        rotuloPeso.setBounds(50, 70, 100, 20);
        textoPeso.setBounds(150, 70, 120, 20);

        rotuloAltura.setBounds(50, 110, 100, 20);
        textoAltura.setBounds(150, 110, 120, 20);

        calcular.setBounds(135, 170, 150, 30);

        resultado.setBounds(50, 230, 320, 20);

        calcular.setForeground(Color.BLACK);

        calcular.setBackground(new Color(255, 200, 120));
        calcular.setOpaque(true);
        calcular.setBorderPainted(false);

        calcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double peso = Double.parseDouble(textoPeso.getText());
                double altura = Double.parseDouble(textoAltura.getText());

                double imc = peso / (altura * altura);

                resultado.setVisible(true);

                if (imc < 18.5) {

                    resultado.setText("Você está abaixo do peso. IMC = " + imc);

                } else if (imc >= 18.5 && imc <= 24.9) {

                    resultado.setText("Você está no peso ideal. IMC = " + imc);

                } else {

                    resultado.setText("Você está cima do peso. IMC = " + imc);

                }
            }
        });

        resultado.setVisible(false);

        tela.add(titulo);

        tela.add(rotuloPeso);
        tela.add(textoPeso);

        tela.add(rotuloAltura);
        tela.add(textoAltura);

        tela.add(calcular);

        tela.add(resultado);

        setSize(420, 350);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        new CalculoDoIMC();

    }
}