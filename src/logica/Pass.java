package logica;

import java.io.Serializable;
import java.util.Random;

public class Pass implements Serializable{
    private Instante instante;
    private String contrasenia;
    private Random azar;
    
    /**
     * 
     * <p> Su función es servir para clasificar las contraseñas (Parte de Joaquin)
     * 
     */
    public enum TIPO{
        DEBIL,
        MEDIO,
        FUERTE
    }
    
    /**
     * 
     * <p> Esto inicializa todo, y hace que se genere la contraseña
     * 
     */
    public Pass() {
        azar = new Random();
        instante = new Instante();
        generarContrasenia();
    }
    
    /* En esta clase se ubican las 
    politicas de contraseña */
    
    /**
     * 
     * <p>Genera una contraseña pseudo-aleatoria, ya que genera caracteres(char) desde el 
     * <a href="https://theasciicode.com.ar/">32( )</a>
     *  hasta el 
     * <a href="https://theasciicode.com.ar/">126 (~)</a>
     * 
     */
    private void generarContrasenia(){
        int lenght = azar.nextInt(10)+5;
        contrasenia = "";
        for(int i = 0; i < lenght; i++){
            contrasenia += (char) azar.nextInt(95) + 32;
        }
    }
    
    @Override
    public String toString() {
        return "\n[" + contrasenia + "]" + "{" + instante + "}";
    }
}
