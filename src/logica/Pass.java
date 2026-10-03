package logica;

import java.io.Serializable;
import java.util.Random;

public class Pass implements Serializable{
    private Instante instante;
    private String contrasenia;
    private Random azar;
    
    public enum TIPO{
        DEBIL,
        MEDIO,
        FUERTE
    }
    
    /**
     * @see Esto inicializa todo, y genera la contraseña
     */
    public Pass() {
        azar = new Random();
        instante = new Instante();
        generarContrasenia();
    }
    
    /* En esta clase se ubican las 
    politicas de contraseña */
    
    
    private void generarContrasenia(){
        int lenght = azar.nextInt(10)+5;
        contrasenia = "";
        for(int i = 0; i < lenght; i++){
            contrasenia += (char) azar.nextInt(94) + 32;
        }
    }
    
    @Override
    public String toString() {
        return "\n[" + contrasenia + "]" + "{" + instante + "}";
    }
}
