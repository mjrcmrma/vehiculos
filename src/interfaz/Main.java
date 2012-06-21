/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author Manuel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vehículo carro = new Vehículo("Corsa");
        carro.setLlantas(4);
        carro.setOcupantes(5);
        
        Vehículo camion = new Vehículo("La ruta 3");
        camion.setLlantas(10);
        camion.setOcupantes(15);
        
        Vehículo camioneta = new Vehículo("La ford lobo");
        camioneta.setLlantas(4);
        camioneta.setOcupantes(3);
        
        Vehículo moto = new Vehículo("Harley Davidson");
        moto.setLlantas(2);
        moto.setOcupantes(2);
        moto.teneONo();
        moto.abrocharCinturones();
        
        JOptionPane.showMessageDialog(null, carro);
        JOptionPane.showMessageDialog(null, camion);
        JOptionPane.showMessageDialog(null, camioneta);
        JOptionPane.showMessageDialog(null, moto);
    }
}
