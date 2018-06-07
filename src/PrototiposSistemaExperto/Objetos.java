package PrototiposSistemaExperto;

/**
 *
 * @author Desarrollo
 */
public class Objetos{
    
    private String [] tipo;    
    private int [] valor;
    
    public Objetos(){}
    
    public Objetos(int [] valor){
        this.valor=valor;
    }
    
    public Objetos(String [] tipo, int [] valor){
        this.tipo=tipo;
        this.valor=valor;
    }
    
    public void setTipo(String [] tipo) {
        this.tipo = tipo;
    }        
    public String [] getTipo() {
        return tipo;
    }
    
    public void setValor(int [] valor) {
        this.valor = valor;
    }
    public int [] getValor() {
        return valor;
    }
}