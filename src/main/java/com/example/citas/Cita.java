package com.example.citas;

public class Cita {
    private String id;
    private String paciente;
    private String doctor;
    private String fecha;
    private String hora;
    private boolean disponible;


    //contructor

    public Cita(String id, String paciente, String doctor, String fecha, String hora, boolean disponible){
        this.id = id;
        this.paciente = paciente;
        this.doctor =  doctor;
        this.fecha = fecha;
        this.hora = hora;
        this.disponible = disponible;

        
    }

    //getter

    public String getId(){
        return id;
    }

    public String getPaciente(){
        return paciente;
    }
    public String getDoctor(){
        return doctor;
    }
    public String getFecha(){
        return fecha;
    }
    public String getHora(){
        return hora;
    }
    public boolean getDisponible(){
        return disponible;
    }



}
