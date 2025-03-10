import java.time.LocalDate;
import java.time.LocalTime;

/**
 * Clase que representa a un objeto anemico dado a que carece de comportamiento y solo contiene getters y setters.
 */

public class TiempoAnemico {
    private LocalDate fecha;
    private LocalTime hora;

    public TiempoAnemico() {
        this.fecha = LocalDate.now();
        this.hora = LocalTime.now();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }
}