package SistemaExperto;

import java.util.*;

/**
 *
 * @author Desarrollo
 */

//Base de Hechos
public class DatosEntrada {

    private int valorusuario;
    private int valorsilueta;       
    private int valorluz;
    private int valorcanal;
    private int valormusica;
    private int [] valoresentrada;
    private int aleatorio;
     
    public DatosEntrada(){
        this.valorusuario = (int)(Math.random()*5)+1;
        this.valorsilueta = (int)(Math.random()*5)+1;
        this.valorluz = (int)(Math.random()*5)+1;
        this.valorcanal = (int)(Math.random()*5)+1;
        this.valormusica = (int)(Math.random()*5)+1;
    }
    
    public DatosEntrada(int valorusuario, int valorsilueta, int valorluz, int valorcanal, int valormusica){
        this.valorusuario = valorusuario;
        this.valorsilueta = valorsilueta;        
        this.valorluz = valorluz;
        this.valorcanal = valorcanal;
        this.valormusica = valormusica;
    }
    
    public DatosEntrada(int [] valoresentrada){
        this.valoresentrada=valoresentrada;
    }
    
    public void setvalorSiluetas(int siluetas){
        siluetas=(int)(Math.random()*5)+1;        
        this.valorsilueta=siluetas;
    }
    public int getvalorSiluetas(){
        return valorsilueta;
    }
    
    public void setvalorUsuario(int usuario){
        usuario=(int)(Math.random()*5)+1; 
        this.valorsilueta=usuario;
    }
    public int getvalorUsuario(){
        return valorusuario;
    }    
    
    public void setvalorLuz(int luz){
        luz=(int)(Math.random()*5)+1; 
        this.valorsilueta=luz;  
    }    
    public int getvalorLuz(){
        return valorluz;
    }

    public void setvalorCanal(int canal){
        canal=(int)(Math.random()*5)+1;         
        this.valorsilueta=canal;    
    }    
    public int getvalorCanal(){
        return valorcanal;
    }

    public void setvalorListaMusica(int listamusica){
        listamusica=(int)(Math.random()*5)+1;         
        this.valorsilueta=listamusica;
    }    
    public int getvalorListaMusica(){
        return valormusica;
    }

    public void setvaloresEntrada(int [] valoresentrada){
        valoresentrada = new int[4];
        valoresentrada[0]=getvalorSiluetas();
        valoresentrada[1]=getvalorUsuario();
        valoresentrada[2]=getvalorLuz();
        valoresentrada[3]=getvalorCanal();
        valoresentrada[4]=getvalorListaMusica();
        this.valoresentrada=valoresentrada;
    }

    public int [] getvaloresEntrada(){
        return valoresentrada;
    }    
        
}