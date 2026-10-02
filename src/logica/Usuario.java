package logica;

import java.io.Serializable;

public class Usuario implements Serializable{

    private String id;
    private LstInicioSesiones lstInicios;
    private LstCambiosPass lstCambios;

    public Usuario() {
        lstInicios = new LstInicioSesiones();
        lstCambios = new LstCambiosPass();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String verCambios() {
        return lstCambios.toString();
    }

    public String verSesiones() {
        return lstInicios.toString();
    }

    /* 
    Operaciones específicas sobre el usuario que implica:
    - La lista de inicio de sesión de un usuario en concreto
    - La lista de cambio de contraseñas de un usuario en concreto
    */

    @Override
    public String toString() {
        return "Usuario:" + id + "\nInicios de sesion: " + verSesiones()
                + "\ncambios de pass: " + verCambios();
    }

}
