
import java.io.Serializable;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author josed
 */
public class Torneo implements Serializable {
    
    private String nombre;
    private ArrayList<Participante> participante = new ArrayList();
    private Boolean flag;
    private int rondas;
    
    private static final long SerialVersionUID=555L;

    public Torneo(String nombre, int rondas) {
        this.nombre = nombre;
        this.rondas = rondas;
    }

    public Torneo(String nombre, Boolean flag) {
        this.nombre = nombre;
        this.flag = flag;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Participante> getParticipante() {
        return participante;
    }

    public void setParticipante(ArrayList<Participante> participante) {
        this.participante = participante;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public int getRondas() {
        return rondas;
    }

    public void setRondas(int rondas) {
        this.rondas = rondas;
    }

    @Override
    public String toString() {
        return nombre + "Rondas: " + rondas;
    }
    
    
    
}
