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
public class Vehículo {
    
    private String nombre;
    private int ocupantes, llantas;
    private boolean cinturones;
    private boolean tieneCinturones;
    private boolean estaAbrochado;
    
    public Vehículo(String n){
        this.nombre = n;
        this.cinturones = false;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the ocupantes
     */
    public int getOcupantes() {
        return ocupantes;
    }

    /**
     * @param ocupantes the ocupantes to set
     */
    public void setOcupantes(int ocupantes) {
        this.ocupantes = ocupantes;
    }

    /**
     * @return the llantas
     */
    public int getLlantas() {
        return llantas;
    }

    /**
     * @param llantas the llantas to set
     */
    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }
    
    public void abrocharCinturones(){
        if(this.tieneCinturones)
        {
            JOptionPane.showMessageDialog(null, "Cinturones abrochados");
            cinturones = true;
        }
        else JOptionPane.showMessageDialog(null, "No tenemos cinturones");
    }
    
    public void teneONo(){
        tieneCinturones = false;
    }
    
    public boolean getCinturones(){
        return cinturones;
    }
    
 @Override
    public String toString(){
        return this.getNombre() + " puede llevar a " + this.getOcupantes() + " gracias a sus " + this.getLlantas() + " llantas";
    }

    /**
     * @return the cinturones
     */
    public boolean isCinturones() {
        return cinturones;
    }

    /**
     * @param cinturones the cinturones to set
     */
    public void setCinturones(boolean cinturones) {
        this.cinturones = cinturones;
    }

    /**
     * @return the tieneCinturones
     */
    public boolean isTieneCinturones() {
        return tieneCinturones;
    }

    /**
     * @param tieneCinturones the tieneCinturones to set
     */
    public void setTieneCinturones(boolean tieneCinturones) {
        this.tieneCinturones = tieneCinturones;
    }

    /**
     * @return the estaAbrochado
     */
    public boolean isEstaAbrochado() {
        return estaAbrochado;
    }

    /**
     * @param estaAbrochado the estaAbrochado to set
     */
    public void setEstaAbrochado(boolean estaAbrochado) {
        this.estaAbrochado = estaAbrochado;
    }
}
