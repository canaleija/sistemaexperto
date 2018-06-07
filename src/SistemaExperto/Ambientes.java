package SistemaExperto;

import java.util.*;
import PrototiposSistemaExperto.Objetos;

/**
 *
 * @author Desarrollo
 */
public class Ambientes {
    
    private String nombre;
    private int[] valoresAmbiente;
   
    public Ambientes(String nombre, int[] valoresAmbiente){
        this.nombre=nombre;
        this.valoresAmbiente=valoresAmbiente;
    }
    
    public void setNombreAmbiente(String nombre){
        this.nombre=nombre;
    }

    public String getNombreAmbiente(){
        return nombre;
    }

    public void setValoresAmbiente(int[] valoresAmbiente) {
        this.valoresAmbiente = valoresAmbiente;
    }    
    
    public int[] getValoresAmbiente() {
        return valoresAmbiente;
    }
    
}
