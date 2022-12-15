package Mundial;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Partido> partidosJugados;
    private int puntos;
    public int sumarPuntaje;

     //Setter y Getter de nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    Equipo(){

    }

    public void sumarPuntaje(){
        this.setPuntos(3);
        sumarPuntaje=puntos+sumarPuntaje;
        this.setPuntos(sumarPuntaje);
    }

    public Equipo(String nombre) {
        this.setNombre(nombre);
    }


    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
