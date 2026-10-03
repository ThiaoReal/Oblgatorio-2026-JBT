package logica;

import java.io.Serializable;
import java.util.Random;

public class Pass implements Serializable{
    private Instante instante;
    private String contrasenia;
    private Random azar;
    private TIPO tipo;
    
    /**
     * <p> Su función es servir para clasificar las contraseñas (Logica de Joaquin)</p>
     * 
     */
    public enum TIPO{
        DEBIL,
        MEDIO,
        FUERTE
    }
    
    /**
     * <p> Esto inicializa todo, y hace que se genere la contraseña
     * 
     */
    public Pass() {
        azar = new Random();
        instante = new Instante();
        generarContrasenia();
        tipo = clasificacionContrasenia();
    }
    
    /* En esta clase se ubican las 
    politicas de contraseña */
    
    
    /**
     * <h2>Clasifica la contraseña en base a estas condiciones:</h2>
     * <p>  -Según si tiene números o no (1, 2, 3, ..., 9)</p>
     * <p>  -Según si contiene mayusculas o no (A, B, C, ..., Z)</p>
     * <p>  -Según si contiene minusculas o no (a, b, c, ..., z)</p>
     * <p>  -Según si contiene caracteres especiales o no (", |, &, ..., *)</p>
     * 
     * @return Devuelve el tipo de contraseña (debil, media o fuerte)
     * 
     */
    public TIPO clasificacionContrasenia(){
        
        return TIPO.DEBIL;
    }
    
    /**
     * <p>Genera una contraseña pseudo-aleatoria, ya que genera caracteres desde el 
     * <a href="https://theasciicode.com.ar/">' ' (32)</a>
     * hasta el 
     * <a href="https://theasciicode.com.ar/">'~' (126)</a></p>
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
