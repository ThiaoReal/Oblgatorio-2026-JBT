package logica;
import java.io.Serializable;
import java.time.LocalTime;
public class Tiempo implements Serializable{
    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo() {
        hora = LocalTime.now().getHour();
        minuto = LocalTime.now().getMinute();
        segundo = LocalTime.now().getSecond();
    }

    // Coloca 0 adelante
    public String hora() {
        String h = String.valueOf(hora);
        if (hora < 10) {
            h = "0" + h;
        }
        return h;
    }
    // Coloca 0 adelante
    public String minuto() {
        String m = String.valueOf(minuto);
        if (minuto < 10) {
            m = "0" + m;
        }
        return m;
    }
    // Coloca 0 adelante
    public String segundo() {
        String s = String.valueOf(segundo);
        if (segundo < 10) {
            s = "0" + s;
        }
        return s;
    }
    @Override
    public String toString() {
        return hora() + ":" + minuto() + ":" + segundo();
    }
}
