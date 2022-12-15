package Mundial;

import java.util.ArrayList;
import java.util.Date;

public class Grupo extends EtapaMundial{

    public void generarPartidos(ArrayList<Equipo> equipos) {
        for (int i = 0; i < equipos.size(); i++) {

            for (int j = i+1; j < equipos.size(); j++) {
                getListaDepartidos().add(new Partido(new Date(), equipos.get(i), equipos.get(j)));
            }

        }


    }
    public ArrayList<Equipo> getEquiposQueAvanzan() {

        for (int i = 0; i < getListaDepartidos().size(); i++) {
            if( getListaDepartidos().get(i).getResultado().ganoLocal() ){
                getListaDepartidos().get(i).getLocal().sumarPuntaje();
            } else getListaDepartidos().get(i).getVisitante().sumarPuntaje();

            if (getListaDepartidos().get(i).getLocal().getPuntos()>=6){
                this.equiposQueAvanzan.add(getListaDepartidos().get(i).getLocal());
            } else if (getListaDepartidos().get(i).getVisitante().getPuntos()>=6){
                this.equiposQueAvanzan.add(getListaDepartidos().get(i).getVisitante());
            }
        }
        return equiposQueAvanzan;
    }
    public Grupo(){
        this.setDescripcionEtapa("Fase de Grupos");
    }

}
