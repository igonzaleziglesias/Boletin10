package boletin10_2;

import javax.swing.JOptionPane;

public class Xogo {

    private int numero, intentos;
    private int n = (int) (Math.random() * 49) + 1;

    public void xogar() {
        System.out.println(n);
        do {
            intentos = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1, Indique el numero de intentos permitidos: "));
        } while (intentos <= 0);

        for (int i = 1; i <= intentos; i++) {
            if (i == intentos) {
                JOptionPane.showMessageDialog(null, "ULTIMA OPORTUNIDAD");
            }
            int juego = 0;

            do {
                juego = Integer.parseInt(JOptionPane.showInputDialog("Indique o " + i + " intento: "));

            } while ((juego < 1) || (juego > 50));

            if (juego > n) {

                if (((juego - n) >= 20) || ((n - juego) >= 20)) {
                    JOptionPane.showMessageDialog(null, "El numero es menor y estas muy lejos");
                } else if ((((juego - n) >= 10) || ((n - juego) >= 10)) && (((juego - n) < 20) || ((n - juego) < 20))) {
                    JOptionPane.showMessageDialog(null, "El numero es menor y estas lejos");
                } else if ((((juego - n) < 10) || ((n - juego) < 10)) && (((juego - n) >= 5) || ((n - juego) >= 5))) {
                    JOptionPane.showMessageDialog(null, "El numero es menor y estas cerca");
                } else if (((juego - n) <= 5) || ((n - juego) <= 5)) {
                    JOptionPane.showMessageDialog(null, "El numero es menor y estas muy cerca");

                }

            } else if (juego < n) {
                if (((juego - n) >= 20) || ((n - juego) >= 20)) {
                    JOptionPane.showMessageDialog(null, "El numero es mayor y estas muy lejos");
                } else if ((((juego - n) >= 10) || ((n - juego) >= 10)) && (((juego - n) < 20) || ((n - juego) < 20))) {
                    JOptionPane.showMessageDialog(null, "El numero es mayor y estas lejos");
                } else if ((((juego - n) < 10) || ((n - juego) < 10)) && (((juego - n) >= 5) || ((n - juego) >= 5))) {
                    JOptionPane.showMessageDialog(null, "El numero es mayor y estas cerca");
                } else if (((juego - n) <= 5) || ((n - juego) <= 5)) {
                    JOptionPane.showMessageDialog(null, "El numero es mayor y estas muy cerca");

                }

            } else if (juego == n) {
                JOptionPane.showMessageDialog(null, "HAS ACERTADO");
                i = intentos;

            }
            if ((i == intentos) && (juego != numero)) {
                JOptionPane.showMessageDialog(null, "HAS PERDIDO");
            }

        }
    }

}
