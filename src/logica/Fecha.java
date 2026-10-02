package logica;
import java.io.Serializable;
import java.time.LocalDate;
public class Fecha implements Serializable{
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        dia = LocalDate.now().getDayOfMonth();
        mes = LocalDate.now().getMonthValue();
        anio = LocalDate.now().getYear();
    }
    // Coloca 0 adelante
    public String dia() {
        String d = String.valueOf(dia);
        if (dia < 10) {
            d = "0" + d;
        }
        return d;
    }
    // Coloca 0 adelante
    public String mes() {
        String m = String.valueOf(mes);
        if (mes < 10) {
            m = "0" + m;
        }
        return m;
    }
    @Override
    public String toString() {
        return dia() + "/" + mes() + "/" + anio;
    }
}
