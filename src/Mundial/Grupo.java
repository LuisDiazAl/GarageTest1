package Mundial;

import java.util.ArrayList;
import java.util.Date;

public class Grupo extends EtapaMundial{
    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {
        return super.getEquiposQueAvanzan();
    }

    public void generarPartidos(ArrayList<Equipo> equipos) {
        for (int i = 0; i < equipos.size() + 1; i++) {

            for (int j = i+1; j < equipos.size(); j++) {

                getListaDepartidos().add(new Partido(new Date(), equipos.get(i), equipos.get(j)));
            }

        }


    }
}
