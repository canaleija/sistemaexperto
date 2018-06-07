package PrototiposSistemaExperto;

/**
 *
 * @author Desarrollo
 */
public class Premisa {
    
    private boolean estadoPremisa;    
    private Objetos datosPremisa;
    
    public Premisa(Objetos datosPremisa, boolean estadoPremisa){
        this.datosPremisa=datosPremisa;
        this.estadoPremisa=estadoPremisa;
    }

    public void setDatosPremisa(Objetos datosPremisa){
        this.datosPremisa=datosPremisa;
    }    
    public Objetos getDatosPremisa(){
        return datosPremisa;
    }
    
    public void setEstadoPremisa(boolean estadoPremisa) {
        this.estadoPremisa = estadoPremisa;
    } 
    public boolean isEstadoPremisa() {
        return estadoPremisa;
    }        
    
}