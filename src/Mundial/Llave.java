package Mundial;
import java.util.ArrayList;
import java.util.Date;

public class Llave extends EtapaMundial{
    @Override
    public ArrayList<Equipo> getEquiposQueAvanzan() {
        for (int i = 0; i < getListaDepartidos().size(); i++) {
            if (getListaDepartidos().get(i).getResultado().ganoLocal()) {
                this.equiposQueAvanzan.add(getListaDepartidos().get(i).getLocal());
            } else this.equiposQueAvanzan.add(getListaDepartidos().get(i).getVisitante());

        }
        return equiposQueAvanzan;
    }

    public void generarPartidos(ArrayList<Equipo> equipos){
        for (int i = 0; i < equipos.size(); i+=2) {
         getListaDepartidos().add(new Partido(new Date(),equipos.get(i), equipos.get(i+1)));
        }

    }

}
