/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josed
 */
public class Admin extends User {
    
    private int torneosGanados;

    public Admin(String nombre, String contraseña) {
        super(nombre, contraseña);
    }

    public int getTorneosGanados() {
        return torneosGanados;
    }

    public void setTorneosGanados(int torneosGanados) {
        this.torneosGanados = torneosGanados;
    }

    @Override
    public String toString() {
        return "Admin{" + "torneosGanados=" + torneosGanados + '}';
    }
    
    
}
