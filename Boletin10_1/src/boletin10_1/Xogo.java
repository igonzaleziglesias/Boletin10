package boletin10_1;

import javax.swing.JOptionPane;

public class Xogo {

    private int numero, intentos;

    public void pedirDatos() {
        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1, Indique el numero a adivinar: "));
        } while ((numero < 1) || (numero > 50));
        do {
            intentos = Integer.parseInt(JOptionPane.showInputDialog("Jugador 1, Indique el numero de intentos permitidos: "));
        } while (intentos <= 0);
    }

    public void xogar() {

        for (int i = 1; i <= intentos; i++) {
            if (i==intentos){
                JOptionPane.showMessageDialog(null,"ULTIMA OPORTUNIDAD");      
            }
            int juego=0;
            
            do{
            juego = Integer.parseInt(JOptionPane.showInputDialog("Indique o "+i+" intento: "));
            }while ((juego < 1) || (juego > 50));
            
            if (juego > numero) {
                JOptionPane.showMessageDialog(null, "El numero es menor");
            } else if (juego < numero) {
                JOptionPane.showMessageDialog(null, "El numero es mayor");
            } else if (juego == numero) {
                JOptionPane.showMessageDialog(null, "HAS ACERTADO");
                i = intentos;

            }
            if ((i==intentos)&&(juego!=numero)) JOptionPane.showMessageDialog(null, "HAS PERDIDO");

        }
    }

}
