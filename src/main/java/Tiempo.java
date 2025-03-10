import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * Clase que representa a un objeto no anemico dado a que posee el comportamiento esperado.
 */

public class Tiempo {
    private LocalDateTime fecha;

    public Tiempo() {
        this.fecha = LocalDateTime.now();
    }

    public void formatoLargo() {
        System.out.print("Fecha actual en formato largo: ");
        System.out.print(this.fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("ES"))
                + " " + this.fecha.getDayOfMonth()
                + " de " + this.fecha.getMonth().getDisplayName(TextStyle.FULL, new Locale("ES"))
                + " de " + this.fecha.getYear()
                + ", ");
        System.out.println(this.fecha.toLocalTime().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }

    public void formatoCorto() {
        System.out.print("Fecha actual en formato corto: ");
        System.out.println(this.fecha.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ", " + this.fecha.toLocalTime().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
