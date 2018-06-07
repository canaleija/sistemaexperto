package PrototiposSistemaExperto;

import SistemaExperto.DatosEntrada;
import java.util.*;

/**
 *
 * @author Desarrollo
 */
public class BasedeHechos {
    
    private int [] datosHechos;
    private DatosEntrada datos; 
    
    public BasedeHechos(int [] datosHechos){
        this.datosHechos=datosHechos;
    }

    public void DatosHechos(DatosEntrada datosEntrada) {
        this.datosHechos=datosEntrada.getvaloresEntrada().clone();
    }
    
    public int [] getDatosHechos(){
        return datosHechos;
    }

}
