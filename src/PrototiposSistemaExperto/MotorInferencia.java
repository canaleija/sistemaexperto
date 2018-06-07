package PrototiposSistemaExperto;

import java.util.Arrays;

/**
 *
 * @author Desarrollo
 */
public class MotorInferencia{
    
    private BasedeConocimiento base;
    private BasedeHechos hechos;    
    private Regla regla;
    private ExplicaciondeAcciones explica;
    
    public MotorInferencia(){
    }

    public MotorInferencia(BasedeConocimiento base){
        this.base=base;
    }
    
//Regla PONENS -->  A implica B  --> si A=true entonces B=true,  "Al afirmar afirma"
    public void ponens(){
        //Comprobar A
        for(Regla reglas:this.base.getReglas()){
            do{
                regla.getPremisa().setEstadoPremisa(false);
                regla.setEstadoregla(false);
                explica.setExplicar("La premisa es falsa");
            }
            
            while(Arrays.equals(this.regla.getPremisa().getDatosPremisa().getValor(), this.hechos.getDatosHechos()));
                regla.getPremisa().setEstadoPremisa(true);
                explica.setExplicar("La premisa es verdadera");
                
                
            if (regla.getPremisa().isEstadoPremisa()==true){
                regla.getConclusion().setEstadoConclusion(true);
                explica.setExplicar("La conclusion es verdadera");
            }
            else{
                regla.getConclusion().setEstadoConclusion(false);
                explica.setExplicar("La conclusion es falsa");
            }
            
            if(regla.getConclusion().isEstadoConclusion()==true){
                regla.setEstadoregla(true);
                explica.setExplicar("La Regla "+this.regla.getNombreregla()+" es verdadera");
            }
            else{
                regla.setEstadoregla(false);
                explica.setExplicar("La Regla "+this.regla.getNombreregla()+" es falsa");
            }
        }
        
    }

//Regla TOLLENS      -->     A implica B    -->     si B=false entonces A=false     "Al negar niega"
//    public void tollens(){
//        //Comprobar B
//            do{
//                this.regla.getConclusion().setEstadoConclusion(false);
//                this.explica.setExplicar("La Regla "+this.regla.getNombreregla()+" es falsa  debido a que la conclusion es falsa");            
//            }
//            while(Arrays.equals(this.regla.getConclusion().getDatosConclusion().getValoresAmbiente(), this.hechos.getDatosHechos()));
//                this.regla.getConclusion().setEstadoConclusion(true);
//                this.explica.setExplicar("Los datos de la conclusion son verdaderos, por lo tanto, la premisa es verdadera "+this.regla.getNombreregla());
//            
//            if (this.regla.getConclusion().isEstadoConclusion()==true){
//                this.regla.getPremisa().setEstadoPremisa(true);
//                this.explica.setExplicar("Premisa TRUE");
//            }
//            else{
//                this.regla.getPremisa().setEstadoPremisa(false);
//                this.explica.setExplicar("Premisa FALSE");
//            }
//            
//            if(this.regla.getPremisa().isEstadoPremisa()==true){
//                this.regla.setEstadoregla(true);
//                this.explica.setExplicar("Regla TRUE");                
//            }
//            else{
//                this.regla.setEstadoregla(false);
//                this.explica.setExplicar("Regla FALSE");                
//            }
//            this.explica.setExplicar("La Regla "+this.regla.getNombreregla()+" es verdadera");
//            this.explica.setExplicar("No se ha podido utilizar Tollens debido a que existen elementos de tipo null");
//
//    }
    
    //public void encadenamientoadelante(){
    //    for(Regla reglas:this.base.getRegla()){
    //        ponens();
    //        System.out.println(this.base.getRegla());
    //        System.out.println(this.regla.getNombreregla());
    //    }
    //}
    
    public void encadenamientoatras(){
    }
    
}