package Mundial;

import java.util.ArrayList;

public class EtapaMundial {
    private String descripcionEtapa;
    private ArrayList<Partido> listaDepartidos;

    public ArrayList<Equipo> equiposQueAvanzan;

        //Metodo Constructor EtapaMundial

    public  EtapaMundial(){
        this.listaDepartidos = new ArrayList<Partido>();
        this.equiposQueAvanzan = new ArrayList<Equipo>();
    }


         //Getter y Setter descripcionEtapa
    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }

      //Arraylist de Partido
    public ArrayList<Partido> getListaDepartidos() {
        return listaDepartidos;
    }


    public ArrayList<Equipo> getEquiposQueAvanzan() {
        return equiposQueAvanzan;
    }

    public void setEquiposQueAvanzan(ArrayList<Equipo> equiposQueAvanzan) {
        this.equiposQueAvanzan = equiposQueAvanzan;
    }
}
