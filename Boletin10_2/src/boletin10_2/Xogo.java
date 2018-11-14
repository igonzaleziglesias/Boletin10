package boletin10_2;

import javax.swing.JOptionPane;

public class Xogo {

    private int numero, numIntentos;
    private int n = (int) (Math.random() * 49) + 1;

    public void xogar() {
        System.out.println(n);
        do {
            numIntentos = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1, Indique el numero de intentos permitidos: "));
        } while (numIntentos <= 0);

        for (int i = 1; i <= numIntentos; i++) {
            if (i == numIntentos) {
                JOptionPane.showMessageDialog(null, "ULTIMA OPORTUNIDAD");
            }
            int intento = 0;

            do {
                intento = Integer.parseInt(JOptionPane.showInputDialog("Indique o " + i + " intento: "));

            } while ((intento < 1) || (intento > 50));

            if (intento > n) {

                if (((intento - n) >= 20) || ((n - intento) >= 20)) {
                    JOptionPane.showMessageDialog(null, "El numero es menor y estas muy lejos");
                } else if ((((intento - n) >= 10) || ((n - intento) >= 10)) && (((intento - n) < 20) || ((n - intento) < 20))) {
                    JOptionPane.showMessageDialog(null, "El numero es menor y estas lejos");
                } else if ((((intento - n) < 10) || ((n - intento) < 10)) && (((intento - n) >= 5) || ((n - intento) >= 5))) {
                    JOptionPane.showMessageDialog(null, "El numero es menor y estas cerca");
                } else if (((intento - n) <= 5) || ((n - intento) <= 5)) {
                    JOptionPane.showMessageDialog(null, "El numero es menor y estas muy cerca");

                }

            } else if (intento < n) {
                if (((intento - n) >= 20) || ((n - intento) >= 20)) {
                    JOptionPane.showMessageDialog(null, "El numero es mayor y estas muy lejos");
                } else if ((((intento - n) >= 10) || ((n - intento) >= 10)) && (((intento - n) < 20) || ((n - intento) < 20))) {
                    JOptionPane.showMessageDialog(null, "El numero es mayor y estas lejos");
                } else if ((((intento - n) < 10) || ((n - intento) < 10)) && (((intento - n) >= 5) || ((n - intento) >= 5))) {
                    JOptionPane.showMessageDialog(null, "El numero es mayor y estas cerca");
                } else if (((intento - n) <= 5) || ((n - intento) <= 5)) {
                    JOptionPane.showMessageDialog(null, "El numero es mayor y estas muy cerca");

                }

            } else if (intento == n) {
                JOptionPane.showMessageDialog(null, "HAS ACERTADO");
                i = numIntentos;

            }
            if ((i == numIntentos) && (intento != numero)) {
                JOptionPane.showMessageDialog(null, "HAS PERDIDO");
            }

        }
    }

}
