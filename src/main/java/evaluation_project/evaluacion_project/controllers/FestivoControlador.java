package evaluation_project.evaluacion_project.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import evaluation_project.evaluacion_project.models.dtos.FestivoDto;
import evaluation_project.evaluacion_project.services.FestivoServicio;

@RestController
@RequestMapping("/festivos")
public class FestivoControlador {

    @Autowired
    private FestivoServicio festivoServicio;

    @GetMapping("/obtener-festivos/{año}")
    public List<FestivoDto> obtenerFestivos(@PathVariable int año) {
        return festivoServicio.obtenerFestivos(año);
    }


    @GetMapping("/es-festivo")
    public boolean esFestivo(@RequestParam(name = "fecha") String fecha) {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaDate = dateFormat.parse(fecha);
            return festivoServicio.esFestivo(fechaDate);
        } catch (ParseException e) {
            return false;
        }
    }

    @GetMapping("/es-fecha-valida")
    public boolean esFechaValida(@RequestParam(name = "fecha") String fecha) {
        return festivoServicio.esFechaValida(fecha);
    }
}
