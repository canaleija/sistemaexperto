package PrototiposSistemaExperto;

import java.util.*;

/**
 *
 * @author Desarrollo
 */
public class Regla {
    
    private String nombreregla;
    private Premisa premisa;
    private Conclusion conclusion;
    private boolean estadoregla;
    
    public Regla(){}
    
    public Regla(Premisa premisa, Conclusion conclusion){
        this.premisa=premisa;
        this.conclusion=conclusion;
    }  
    
    public Regla(Premisa premisa, Conclusion conclusion, boolean estadoregla){
        this.premisa=premisa;
        this.conclusion=conclusion;
        this.estadoregla=estadoregla;
    }

    public Regla(String nombreregla, Premisa premisa, Conclusion conclusion, boolean estadoregla){
        this.nombreregla=nombreregla;
        this.premisa=premisa;
        this.conclusion=conclusion;
        this.estadoregla=estadoregla;
    }      

    public void setNombreregla(String nombreregla){
        this.nombreregla=nombreregla;
    }
    public String getNombreregla() {
        return nombreregla;
    }     
    
    public void setPremisa(Premisa premisa){
        this.premisa=premisa;
    }
    public Premisa getPremisa(){
        return premisa;
    }

    public void setConclusion(Conclusion conclusion){
        this.conclusion=conclusion;
    }
    public Conclusion getConclusion(){
        return conclusion;
    }

    public void setEstadoregla(boolean estadoregla) {
        this.estadoregla = estadoregla;
    }    
    public boolean isEstadoregla() {
        return estadoregla;
    }
    
}