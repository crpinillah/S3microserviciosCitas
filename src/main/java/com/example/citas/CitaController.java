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
        citas.add(new Cita("10", "Ana Maria Arce", "Cristobal Perez", "2024-09-01", "12:00", true));
        citas.add(new Cita("11", "Francisca Vargas", "Cristobal Perez", "2024-09-01", "13:00", true));
        citas.add(new Cita("12", "Andrés Molina", "Lorena García", "2024-09-01", "14:00", false));
        citas.add(new Cita("3", "María Gómez", "Cristobal Perez", "2024-09-02", "09:30", true));
        citas.add(new Cita("4", "Pedro Castillo", "Ana Torres", "2024-09-02", "10:00", false));
        citas.add(new Cita("5", "Lucía Fernández", "Lorena García", "2024-09-03", "11:15", true));
        citas.add(new Cita("6", "Miguel Ramírez", "Ana Torres", "2024-09-03", "12:00", true));
        citas.add(new Cita("7", "Carla Reyes", "Cristobal Perez", "2024-09-04", "08:45", false));
        citas.add(new Cita("8", "José Morales", "Lorena García", "2024-09-04", "14:30", true));
        citas.add(new Cita("9", "Sandra Villanueva", "Ana Torres", "2024-09-05", "15:00", false));



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
