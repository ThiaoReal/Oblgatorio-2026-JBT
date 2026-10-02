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
     * Genera una contraseña al azar y tambien inicializa los datos del Pass
     */
    public Pass() {
        azar = new Random();
        instante = new Instante();
        int lenght = azar.nextInt(10)+5;
        contrasenia = "";
        for(int i = 0; i < lenght; i++){
            contrasenia += (char) azar.nextInt(94) + 32;
        }
    }
    
    /* En esta clase se ubican las 
    politicas de contraseña */
    
    
    @Override
    public String toString() {
        return "\n[" + contrasenia + "]" + "{" + instante + "}";
    }
}
