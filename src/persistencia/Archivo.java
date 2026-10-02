package persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import logica.LstUsuarios;

public class Archivo {

    private static Archivo persistencia;
    private String ruta;

    private Archivo() {
        ruta = "usuarios.dat";
    }

    public static Archivo getInstancia() {
        if (persistencia == null) {
            persistencia = new Archivo();
        }
        return persistencia;
    }

    public LstUsuarios usuariosRegistrados() {
        LstUsuarios usuarios = new LstUsuarios();
        try {
            // Abro el archivo
            FileInputStream f = new FileInputStream(ruta);
            ObjectInputStream o = new ObjectInputStream(f);
            // Obtengo la información en el archivo
            usuarios = (LstUsuarios) o.readObject();
            // Cierro el archivo
            o.close();
            f.close();
        } catch (Exception ex) {
            System.out.println("Se genera el archivo estudiantes.dat");
        }

        return usuarios;
    }

    public void registrarUsuario(LstUsuarios usuarios) {
        try {
            // Abro el archivo
            FileOutputStream f = new FileOutputStream(ruta);
            ObjectOutputStream o = new ObjectOutputStream(f);
            // Actualizo la información en el archivo
            o.writeObject(usuarios);
            // Cierro el archivo
            o.close();
            f.close();
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }
    
} // Find de clase