import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        // Uso de objeto anemico
        TiempoAnemico tiempo = new TiempoAnemico();

        // Formato largo
        System.out.print("Fecha actual en formato largo: ");
        System.out.print(tiempo.getFecha().getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("ES"))
                + " " + tiempo.getFecha().getDayOfMonth()
                + " de " + tiempo.getFecha().getMonth().getDisplayName(TextStyle.FULL, new Locale("ES"))
                + " de " + tiempo.getFecha().getYear()
                + ", ");
        System.out.println(tiempo.getHora().format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        // Formato corto
        System.out.print("Fecha actual en formato corto: ");
        System.out.println(tiempo.getFecha().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ", " + tiempo.getHora().format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        // Uso de objeto no anemico
        Tiempo tiempo2 = new Tiempo();
        tiempo2.formatoLargo();
        tiempo2.formatoCorto();
    }
}
