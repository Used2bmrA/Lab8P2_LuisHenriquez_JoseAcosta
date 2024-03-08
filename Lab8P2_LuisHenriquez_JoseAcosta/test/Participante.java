
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josed
 */
public class Participante extends User {
    
    private ArrayList<Torneo> torneo = new ArrayList();

    public Participante(String nombre, String contraseña) {
        super(nombre, contraseña);
    }

    public ArrayList<Torneo> getTorneo() {
        return torneo;
    }

    public void setTorneo(ArrayList<Torneo> torneo) {
        this.torneo = torneo;
    }

    
    @Override
    public String toString() {
        return "Participante{" + "torneo=" + torneo + '}';
    }
    
    
    
    
    
}
