package evaluation_project.evaluacion_project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import evaluation_project.evaluacion_project.models.Festivo;

public interface IFestivoRepositorio extends JpaRepository<Festivo, Long> {
    // Agrega métodos de consulta específicos aquí, si es necesario.
}