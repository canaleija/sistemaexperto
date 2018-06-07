package PrototiposSistemaExperto;

import java.util.*;

/**
 *
 * @author Desarrollo
 */
public class BasedeConocimiento extends MotorInferencia{
    
    private String nombrebase;
    private LinkedList <Regla> regla;
    
    public BasedeConocimiento(String nombrebase){
        this.nombrebase = nombrebase;
        this.regla = new LinkedList<>();
    }     
    
    public void agregarreglas(Regla nuevaregla){
        this.getReglas().add(nuevaregla);
    }     
    
    public void setNombrebase(String nombrebase) {
        this.nombrebase = nombrebase;
    }
    public String getNombrebase() {
        return nombrebase;
    }      

    public void setReglas(LinkedList<Regla> regla) {
        this.regla = regla;
    }
    public LinkedList<Regla> getReglas() {
        return regla;
    }
    
//    public LinkedList <Regla> agregarregla(Regla regla){
//        LinkedList<Regla> nuevaregla = new LinkedList<>();//conocimiento(regla);
//        for(int i=0; i<10; i++){
//            nuevaregla.add(new Regla(regla.getNombreregla(),regla.getPremisa(),regla.getConclusion(),regla.isEstadoregla()));
//        }
//        return nuevaregla;
//    }  
//    public boolean existeregla(Regla nombreregla){
//        return this.getRegla().contains(nombreregla.getNombreregla());
//    }
    
}