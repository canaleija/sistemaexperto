package SistemaExperto;

import java.util.*;
import java.io.*;
import PrototiposSistemaExperto.BasedeConocimiento;
import PrototiposSistemaExperto.BasedeHechos;
import PrototiposSistemaExperto.MotorInferencia;
import PrototiposSistemaExperto.Objetos;
import PrototiposSistemaExperto.Premisa;
import PrototiposSistemaExperto.Conclusion;
import PrototiposSistemaExperto.Regla;
import PrototiposSistemaExperto.ExplicaciondeAcciones;

/**
 *
 * @author Desarrollo
 */
public class SistemaExperto {

    BasedeConocimiento base = new BasedeConocimiento("Conocimiento");
    String explicacion = new String("");
    
    Objetos objetospremisa1;   
    Objetos objetospremisa2;
    Objetos objetospremisa3;
    Objetos objetospremisa4;
    Objetos objetospremisa5;
    Objetos objetospremisa6;
    Objetos objetospremisa7;
    Objetos objetospremisa8;
    Objetos objetospremisa9;    
    Ambientes ambiente1;
    Ambientes ambiente2;     
    Ambientes ambiente3;
    Ambientes ambiente4;
    Ambientes ambiente5;
    Ambientes ambiente6;
    Ambientes ambiente7;
    Ambientes ambiente8;
    Ambientes ambiente9;
    
//------------------------------------------------------------------------------------------------------------------------------------------------------------    
//Base de Conocimiento
    public void conocimiento(){
        
        objetospremisa1 = new Objetos(new String []{"Usuario: ","Número Siluetas: ","Intensidad Iluminación: ","Canal TV: ","Lista Reproducción: "}, new int []{1,1,1,1,1});
        objetospremisa2 = new Objetos(new String []{"Usuario: ","Número Siluetas: ","Intensidad Iluminación: ","Canal TV: ","Lista Reproducción: "}, new int []{2,2,2,2,2});
        objetospremisa3 = new Objetos(new String []{"Usuario: ","Número Siluetas: ","Intensidad Iluminación: ","Canal TV: ","Lista Reproducción: "}, new int []{3,3,3,3,3});
        objetospremisa4 = new Objetos(new String []{"Usuario: ","Número Siluetas: ","Intensidad Iluminación: ","Canal TV: ","Lista Reproducción: "}, new int []{4,4,4,4,4});
        objetospremisa5 = new Objetos(new String []{"Usuario: ","Número Siluetas: ","Intensidad Iluminación: ","Canal TV: ","Lista Reproducción: "}, new int []{4,4,4,4,4});
        objetospremisa6 = new Objetos(new String []{"Usuario: ","Número Siluetas: ","Intensidad Iluminación: ","Canal TV: ","Lista Reproducción: "}, new int []{4,4,4,4,4});
        objetospremisa7 = new Objetos(new String []{"Usuario: ","Número Siluetas: ","Intensidad Iluminación: ","Canal TV: ","Lista Reproducción: "}, new int []{4,4,4,4,4});
        objetospremisa8 = new Objetos(new String []{"Usuario: ","Número Siluetas: ","Intensidad Iluminación: ","Canal TV: ","Lista Reproducción: "}, new int []{4,4,4,4,4});
        objetospremisa9 = new Objetos(new String []{"Usuario: ","Número Siluetas: ","Intensidad Iluminación: ","Canal TV: ","Lista Reproducción: "}, new int []{4,4,4,4,4});        
        ambiente1 = new Ambientes("Ambiente 1 ", new int []{1,1,1,1,1});
        ambiente2 = new Ambientes("Ambiente 2 ", new int []{2,2,2,2,2});
        ambiente3 = new Ambientes("Ambiente 3 ", new int []{3,3,3,3,3});
        ambiente4 = new Ambientes("Ambiente 4 ", new int []{4,4,4,4,4});
        ambiente5 = new Ambientes("Ambiente 4 ", new int []{4,4,4,4,4});
        ambiente6 = new Ambientes("Ambiente 4 ", new int []{4,4,4,4,4});        
        ambiente7 = new Ambientes("Ambiente 4 ", new int []{4,4,4,4,4});
        ambiente8 = new Ambientes("Ambiente 4 ", new int []{4,4,4,4,4});        
        ambiente9 = new Ambientes("Ambiente 4 ", new int []{4,4,4,4,4});
        
        Premisa premisa1 = new Premisa(objetospremisa1,false);         
        Premisa premisa2 = new Premisa(objetospremisa2,false); 
        Premisa premisa3 = new Premisa(objetospremisa3,false); 
        Premisa premisa4 = new Premisa(objetospremisa4,false);
        Premisa premisa5 = new Premisa(objetospremisa5,false);
        Premisa premisa6 = new Premisa(objetospremisa6,false);
        Premisa premisa7 = new Premisa(objetospremisa7,false);
        Premisa premisa8 = new Premisa(objetospremisa8,false);
        Premisa premisa9 = new Premisa(objetospremisa9,false);        
        Conclusion conclusion1 = new Conclusion(ambiente1,false);
        Conclusion conclusion2 = new Conclusion(ambiente2,false);        
        Conclusion conclusion3 = new Conclusion(ambiente3,false);
        Conclusion conclusion4 = new Conclusion(ambiente4,false);        
        Conclusion conclusion5 = new Conclusion(ambiente5,false);
        Conclusion conclusion6 = new Conclusion(ambiente6,false);
        Conclusion conclusion7 = new Conclusion(ambiente7,false);
        Conclusion conclusion8 = new Conclusion(ambiente8,false);
        Conclusion conclusion9 = new Conclusion(ambiente9,false);        
        
        Regla regla1 = new Regla("Regla 1",premisa1,conclusion1,false);
        Regla regla2 = new Regla("Regla 2",premisa2,conclusion2,false);
        Regla regla3 = new Regla("Regla 3",premisa3,conclusion3,false);
        Regla regla4 = new Regla("Regla 4",premisa4,conclusion4,false);
        Regla regla5 = new Regla("Regla 4",premisa5,conclusion5,false);
        Regla regla6 = new Regla("Regla 4",premisa6,conclusion6,false);
        Regla regla7 = new Regla("Regla 4",premisa7,conclusion7,false);
        Regla regla8 = new Regla("Regla 4",premisa8,conclusion8,false);
        Regla regla9 = new Regla("Regla 4",premisa9,conclusion9,false);        
        
        base.agregarreglas(regla1);
        base.agregarreglas(regla2);
        base.agregarreglas(regla3);
        base.agregarreglas(regla4);
        base.agregarreglas(regla5);
        base.agregarreglas(regla6);
        base.agregarreglas(regla7);
        base.agregarreglas(regla8);
        base.agregarreglas(regla9);
        
    }
    
//------------------------------------------------------------------------------------------------------------------------------------------------------------    
//Motor de Inferencia    
    public String inferir_regla(ExplicaciondeAcciones explicacion){
        conocimiento();
        base.ponens();
        this.explicacion=explicacion.getExplicar();
        return this.explicacion;
    }
//------------------------------------------------------------------------------------------------------------------------------------------------------------        
    public static void main(String[] args) {
        
        SistemaExperto se = new SistemaExperto();
        MotorInferencia infiere = new MotorInferencia();
        ExplicaciondeAcciones explica = new ExplicaciondeAcciones("");
        
        DatosEntrada valores = new DatosEntrada(new int[]{1,1,1,1,1});
        BasedeHechos hecho = new BasedeHechos(valores.getvaloresEntrada());        
        
        System.out.println("Datos Entrada: " +Arrays.toString(valores.getvaloresEntrada()));
        System.out.println("Base de Hechos: " +Arrays.toString(hecho.getDatosHechos()));
        
        se.inferir_regla(explica);
        
   }
    
}
