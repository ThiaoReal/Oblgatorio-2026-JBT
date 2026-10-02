package logica;

import java.io.Serializable;
import java.util.ArrayList;

public class LstUsuarios implements Serializable {

    private ArrayList<Usuario> lista;

    public LstUsuarios() {
        lista = new ArrayList<>();
    }

    /* Métodos primitivos */
    public void agregar(Usuario u) {
        lista.add(u);    
    }
    public void eliminar(Usuario u) {
        lista.remove(u);
    }
    public void eliminar(int i) {
        lista.remove(i);
    }
    public int cantidad() {
        return lista.size();
    }
    public Usuario devolver(int i) {
        return lista.get(i);
    }
    public boolean sinRegistros() {
        return lista.isEmpty();
    }
    
    /* Métodos específicos */
    
    /*
    Métodos específicos sobre la lista de usuarios (sugerencias):
    - Devolver id de un usuario según su posición.
    - Devolver boolean si existe un usuario en la lista con un id proporcionado
    - Devolver un Usuario de la lista según su id.
    - Otras
    */
    

    @Override
    public String toString() {
        return lista.toString();
    }
}
