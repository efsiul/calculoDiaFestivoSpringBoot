package evaluation_project.evaluacion_project.models.dtos;
import java.util.Date;

public class FestivoDto {
    private String nombre;
    private Date fecha;

    public FestivoDto() {
        // Constructor vacío necesario para serialización/deserialización
    }

    public FestivoDto(String nombre, Date fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
