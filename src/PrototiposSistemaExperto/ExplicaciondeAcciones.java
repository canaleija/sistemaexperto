package PrototiposSistemaExperto;

/**
 *
 * @author Desarrollo
 */
public class ExplicaciondeAcciones {
    
    private String explicar;
    
    public ExplicaciondeAcciones(String explicacion) {
        this.explicar = explicacion;
    }

    public ExplicaciondeAcciones(){}
    
    public void setExplicar(String explicar) {
        this.explicar = explicar;
    }    
    public String getExplicar() {
        return explicar;
    }
    
}
