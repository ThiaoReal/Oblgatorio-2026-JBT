
package logica;

import java.io.Serializable;

public class Instante implements Serializable{
    private Fecha fecha;
    private Tiempo tiempo;

    public Instante() {
        fecha = new Fecha();
        tiempo = new Tiempo();
    }
    
    @Override
    public String toString() {
        return fecha + " - " + tiempo;
    }

}
