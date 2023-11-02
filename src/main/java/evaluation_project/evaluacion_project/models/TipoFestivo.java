package evaluation_project.evaluacion_project.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;

@Entity
@Table(name = "TipoFestivo")
public class TipoFestivo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "secuencia_pais")
    @GenericGenerator(name = "secuencia_pais", strategy = "increment")
    @Column(name = "id")
    private int id;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "modo_calculo")
    private String modo;


    public TipoFestivo() {
        
    }

    public TipoFestivo(int id, String tipo, String modo) {
        this.id = id;
        this.tipo = tipo;
        this.modo = modo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModo() {
        return modo;    
    }

    public void setModo(String modo) {
        this.modo = modo;
    }
}
