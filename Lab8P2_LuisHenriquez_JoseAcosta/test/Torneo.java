
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
    Boolean flag;
    
    private static final long SerialVersionUID=555L;

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

    @Override
    public String toString() {
        return "Torneo{" + "nombre=" + nombre + ", participante=" + participante + ", flag=" + flag + '}';
    }
    
    
    
}
