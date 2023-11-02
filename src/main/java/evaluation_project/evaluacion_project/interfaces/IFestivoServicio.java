package evaluation_project.evaluacion_project.interfaces;

import java.util.Date;
import evaluation_project.evaluacion_project.models.dtos.FestivoDto;

import java.util.List;

public interface IFestivoServicio {
    List<FestivoDto> obtenerFestivos(int año);
    boolean esFestivo(Date fecha);
    boolean esFechaValida(String strFecha);
}