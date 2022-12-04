package Mundial;

import java.util.ArrayList;

public class EtapaMundial {
    private String descripcionEtapa;
    private ArrayList<Partido> partidos;


        //Metodo Constructor EtapaMundial
    
      EtapaMundial(){
        this.partidos = new ArrayList<Partido>();
    }


         //Getter y Setter descripcionEtapa
    public String getDescripcionEtapa() {
        return descripcionEtapa;
    }

    public void setDescripcionEtapa(String descripcionEtapa) {
        this.descripcionEtapa = descripcionEtapa;
    }

      //Arraylist de Partido
    public ArrayList<Partido> getPartidos() {
        return partidos;
    }




    //Falta getEquiposQueAvanzan(): List<Equipo>

}
