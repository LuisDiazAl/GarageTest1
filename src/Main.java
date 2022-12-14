import Mundial.*;
import Vehiculo.*;
import com.sun.xml.internal.ws.wsdl.writer.document.Part;

import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
    Moto moto1 = new Moto("honda",3000,2,250);
    Moto moto2 = new Moto("suzuki",7000,2,350);

    Coche coche1 = new Coche("toyota",20000,4,4);
    Coche coche2 = new Coche("renault",50000,4,4);

    Garage garage1 = new Garage(10,3);


    garage1.AgregarVehiculo(moto1);
    garage1.AgregarVehiculo(coche1);

    garage1.AgregarVehiculo(coche2);
    garage1.AgregarVehiculo(moto2);

    System.out.println(String.format("Esta full¿?: %b \nCapacidad Actual: %s\nPromedio de Km: %f\nPrecio Total de Ruedas: %f", garage1.estaFull(), garage1.getListaDeVehiculo().size(),garage1.promedioKm(),garage1.precioTotalRuedas()));


        System.out.println("----MUNDIAL-----");

        ArrayList<Equipo> teamgrupoA = new ArrayList<Equipo>();
        teamgrupoA.add(new Equipo("ARG"));
        teamgrupoA.add(new Equipo("BELG"));
        teamgrupoA.add(new Equipo("ESP"));
        teamgrupoA.add(new Equipo("USA"));

        ArrayList<Equipo> teamgrupaB = new ArrayList<Equipo>();
        teamgrupaB.add(new Equipo("PSG"));
        teamgrupaB.add(new Equipo("BAR"));
        teamgrupaB.add(new Equipo("MAD"));
        teamgrupaB.add(new Equipo("ATH"));

        Grupo primerGrupo = new Grupo();
        


        Grupo segundoGrupo = new Grupo();







    }
}
