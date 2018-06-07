package PrototiposSistemaExperto;

import SistemaExperto.Ambientes;

/**
 *
 * @author Desarrollo
 */
public class Conclusion {
    
    private boolean estadoConclusion;
    private Ambientes ambiente;
    
    public Conclusion(Ambientes ambiente, boolean estadoConclusion){
        this.ambiente=ambiente;
        this.estadoConclusion=estadoConclusion;
    }
    
    public void setDatosConclusion(Ambientes ambiente) {
        this.ambiente = ambiente;
    }
    public Ambientes getDatosConclusion() {
        return ambiente;
    }
    
    public void setEstadoConclusion(boolean estadoConclusion) {
        this.estadoConclusion = estadoConclusion;
    }
    public boolean isEstadoConclusion() {      
        return estadoConclusion;
    }
}
