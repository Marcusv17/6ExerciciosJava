package com.mycompany.tipodetriangulos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TipoDeTriangulos extends JFrame {

    JLabel rotulo1, rotulo2, rotulo3, resultado, titulo;
    JTextField texto1, texto2, texto3;
    JButton verificar;

    public TipoDeTriangulos() {

        super("Tipo de Triângulo");

        Container tela = getContentPane();
        setLayout(null);

        titulo = new JLabel("- TRIÂNGULOS -");
        titulo.setForeground(Color.RED);
        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        titulo.setBounds(125, 10, 200, 30);

        rotulo1 = new JLabel("Lado 1:");
        rotulo2 = new JLabel("Lado 2:");
        rotulo3 = new JLabel("Lado 3:");

        texto1 = new JTextField(5);
        texto2 = new JTextField(5);
        texto3 = new JTextField(5);

        resultado = new JLabel("");

        verificar = new JButton("Verificar Tipo");

        rotulo1.setBounds(50, 60, 100, 20);
        texto1.setBounds(150, 60, 150, 20);

        rotulo2.setBounds(50, 100, 100, 20);
        texto2.setBounds(150, 100, 150, 20);

        rotulo3.setBounds(50, 140, 100, 20);
        texto3.setBounds(150, 140, 150, 20);

        verificar.setBounds(110, 190, 160, 30);

        resultado.setBounds(50, 240, 300, 20);

        verificar.setForeground(Color.BLACK);

        verificar.setBackground(new Color(173, 216, 230));
        verificar.setOpaque(true);
        verificar.setBorderPainted(false);

        verificar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                int l1 = Integer.parseInt(texto1.getText());
                int l2 = Integer.parseInt(texto2.getText());
                int l3 = Integer.parseInt(texto3.getText());

                resultado.setVisible(true);

                if (l1 == l2 && l2 == l3) {

                    resultado.setText("Triângulo Equilátero");

                } else if (l1 == l2 || l1 == l3 || l2 == l3) {

                    resultado.setText("Triângulo Isósceles");

                } else {

                    resultado.setText("Triângulo Escaleno");

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

        tela.add(verificar);

        tela.add(resultado);

        setSize(400, 350);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        new TipoDeTriangulos();

    }
}