package com.example.citas;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@RestController

public class CitaController {
    private List<Cita> citas = new ArrayList<>();
    


    public CitaController(){
        //Inicializar lista

        citas.add(new Cita("1", "Cristian Pinilla", "Cristobal Perez", "2024-09-01", "10:00", false));
        citas.add(new Cita("2", "Marcela Rios", "Claudio Poblete", "2024-09-01", "11:00", true));
        citas.add(new Cita("1", "Ana Maria Arce", "Cristobal Perez", "2024-09-01", "12:00", true));
        citas.add(new Cita("1", "Francisca Vargas", "Cristobal Perez", "2024-09-01", "13:00", true));


    }
    

    public List<Cita> obtenerDisponible() {
        
        return citas.stream()
                    .filter(cita -> cita.getDisponible())
                    .collect(Collectors.toList());
    }  
   

    @GetMapping("/disponibles")
    public List<Cita> getDisponible(){
        return obtenerDisponible();
    }

    
    @GetMapping("/citas")
    public List<Cita> getId() {
        return citas;
    }

    
}
