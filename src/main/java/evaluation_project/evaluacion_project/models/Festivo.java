package evaluation_project.evaluacion_project.models;

import org.hibernate.annotations.GenericGenerator;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.util.Date;




@Entity
@Table(name = "festivos")
public class Festivo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "id_festivo")
    @GenericGenerator(name = "id_festivo", strategy = "increment")
    @Column(name = "id")
    private Long id;

    @Column(name = "dia")
    private Integer dia;

    @Column(name = "mes")
    private Integer mes;

    @Column(name = "nombre", length = 100)
    private String nombre;

    @ManyToOne // Relación con la entidad que representa los tipos de festivo
    @JoinColumn(name = "id_tipo", referencedColumnName = "id")
    private TipoFestivo tipo;

    @Column(name = "dias_pascua")
    private Integer diasPascua;

    @Column(name = "fecha")
    private Date fecha;

    public Festivo() {
        
    }

    public Festivo(int dia, int mes, String nombre, TipoFestivo tipo, Integer diasPascua, Date fecha) {
        this.dia = dia;
        this.mes = mes;
        this.nombre = nombre;
        this.tipo = tipo;
        this.diasPascua = diasPascua;
        this.fecha = fecha;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }
    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoFestivo getTipo() {
        return tipo;
    }

    public void setTipo(TipoFestivo tipo) {
        this.tipo = tipo;
    }

    public Integer getDiasPascua() {
        return diasPascua;
    }

    public void setDiasPascua(Integer diasPascua) {
        this.diasPascua = diasPascua;
    }   

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}