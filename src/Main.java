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

        ArrayList<Equipo> teamgrupoB = new ArrayList<Equipo>();
        teamgrupoB.add(new Equipo("PSG"));
        teamgrupoB.add(new Equipo("BAR"));
        teamgrupoB.add(new Equipo("MAD"));
        teamgrupoB.add(new Equipo("ATH"));

        ArrayList<Equipo> teamgrupoC = new ArrayList<Equipo>();
        teamgrupoC.add(new Equipo("ASE"));
        teamgrupoC.add(new Equipo("DFG"));
        teamgrupoC.add(new Equipo("QWE"));
        teamgrupoC.add(new Equipo("JKL"));

        ArrayList<Equipo> teamgrupoD = new ArrayList<Equipo>();
        teamgrupoD.add(new Equipo("CVB"));
        teamgrupoD.add(new Equipo("YUI"));
        teamgrupoD.add(new Equipo("rfv"));
        teamgrupoD.add(new Equipo("pag"));

        ArrayList<Equipo> teamgrupoE = new ArrayList<Equipo>();
        teamgrupoE.add(new Equipo("BVB"));
        teamgrupoE.add(new Equipo("JFK"));
        teamgrupoE.add(new Equipo("LUI"));
        teamgrupoE.add(new Equipo("EDI"));

        ArrayList<Equipo> teamgrupoF = new ArrayList<Equipo>();
        teamgrupoF.add(new Equipo("LOLO"));
        teamgrupoF.add(new Equipo("LARE"));
        teamgrupoF.add(new Equipo("MAU"));
        teamgrupoF.add(new Equipo("JJ"));

        ArrayList<Equipo> teamgrupoG = new ArrayList<Equipo>();
        teamgrupoG.add(new Equipo("BOCA"));
        teamgrupoG.add(new Equipo("RIVER"));
        teamgrupoG.add(new Equipo("CAP"));
        teamgrupoG.add(new Equipo("RACING"));

        ArrayList<Equipo> teamgrupoH = new ArrayList<Equipo>();
        teamgrupoH.add(new Equipo("DELL"));
        teamgrupoH.add(new Equipo("AMZ"));
        teamgrupoH.add(new Equipo("APPLE"));
        teamgrupoH.add(new Equipo("MELI"));


        Grupo grupoA = new Grupo();
        grupoA.generarPartidos();


        Grupo segundoGrupo = new Grupo();







    }
}
