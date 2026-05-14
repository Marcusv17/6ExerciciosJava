package com.mycompany.conversordetemperatura;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ConversorDeTemperatura extends JFrame {

    JLabel rotuloCelsius, rotuloFahrenheit, rotuloKelvin, titulo;
    JTextField textoCelsius, textoFahrenheit, textoKelvin;
    JButton converter;

    public ConversorDeTemperatura() {

        super("Conversor de Temperatura");

        Container tela = getContentPane();
        setLayout(null);

        titulo = new JLabel("- CONVERSOR DE TEMPERATURA -");
        titulo.setForeground(Color.RED);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        titulo.setBounds(50, 10, 320, 30);

        rotuloCelsius = new JLabel("Graus Celsius:");
        rotuloFahrenheit = new JLabel("Graus Fahrenheit:");
        rotuloKelvin = new JLabel("Graus Kelvin:");

        textoCelsius = new JTextField(5);
        textoFahrenheit = new JTextField(5);
        textoKelvin = new JTextField(5);

        textoFahrenheit.setEditable(false);
        textoKelvin.setEditable(false);
        
        textoFahrenheit.setBackground(Color.WHITE);
        textoKelvin.setBackground(Color.WHITE);

        converter = new JButton("Converter");

        rotuloCelsius.setBounds(40, 70, 130, 20);
        textoCelsius.setBounds(180, 70, 120, 20);

        rotuloFahrenheit.setBounds(40, 120, 130, 20);
        textoFahrenheit.setBounds(180, 120, 120, 20);

        rotuloKelvin.setBounds(40, 170, 130, 20);
        textoKelvin.setBounds(180, 170, 120, 20);

        converter.setBounds(130, 230, 120, 30);

        converter.setForeground(Color.BLACK);

        converter.setBackground(new Color(173, 216, 230));
        converter.setOpaque(true);
        converter.setBorderPainted(false);

        converter.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                double celsius = Double.parseDouble(textoCelsius.getText());

                double fahrenheit = (celsius * 9 / 5) + 32;
                double kelvin = celsius + 273.15;

                textoFahrenheit.setText(String.valueOf(fahrenheit));
                textoKelvin.setText(String.valueOf(kelvin));
            }
        });

        tela.add(titulo);

        tela.add(rotuloCelsius);
        tela.add(textoCelsius);

        tela.add(rotuloFahrenheit);
        tela.add(textoFahrenheit);

        tela.add(rotuloKelvin);
        tela.add(textoKelvin);

        tela.add(converter);

        setSize(420, 350);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        new ConversorDeTemperatura();

    }
}