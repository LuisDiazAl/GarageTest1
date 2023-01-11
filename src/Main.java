import Mundial.*;
import Vehiculo.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Moto moto1 = new Moto("honda",3000,2,250);
    Moto moto2 = new Moto("suzuki",7000,2,350);

    Coche coche1 = new Coche("toyota",20000,4,4);
    Coche coche2 = new Coche("renault",50000,4,4);

    Garage garage1 = new Garage(10,3);


    garage1.agregarVehiculo(moto1);
    garage1.agregarVehiculo(coche1);

    garage1.agregarVehiculo(coche2);
    garage1.agregarVehiculo(moto2);

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

        //Objetivo principal: Crear partidos de forma aleatoria con goles aleatorios.

        //Objetivo secundario: Optimizar lineas de codigo num 78 - 84, con random, pero hace falta crear una condicion que me seleccione unicamente dos partidos que avancen, en caso de que existan 3, solo seleccione 2.

        // Objetivo 3: uso de random funcionable para crear partidos de forma aleatoria, random funcione en hacer gol, por ahora solo recibe int.

        Grupo grupoA = new Grupo();
        grupoA.generarPartidos(teamgrupoA);
        grupoA.getListaDepartidos().get(0).hacerGoles(2,1);
        grupoA.getListaDepartidos().get(1).hacerGoles(0,1);
        grupoA.getListaDepartidos().get(2).hacerGoles(5,1);
        grupoA.getListaDepartidos().get(3).hacerGoles(2,1);
        grupoA.getListaDepartidos().get(4).hacerGoles(3,1);
        grupoA.getListaDepartidos().get(5).hacerGoles(0,1);

        Grupo grupoB = new Grupo();
        grupoB.generarPartidos(teamgrupoB);
        grupoB.getListaDepartidos().get(0).hacerGoles(2,1);
        grupoB.getListaDepartidos().get(1).hacerGoles(0,1);
        grupoB.getListaDepartidos().get(2).hacerGoles(5,1);
        grupoB.getListaDepartidos().get(3).hacerGoles(2,1);
        grupoB.getListaDepartidos().get(4).hacerGoles(3,1);
        grupoB.getListaDepartidos().get(5).hacerGoles(0,1);


        Grupo grupoC = new Grupo();
        grupoC.generarPartidos(teamgrupoC);
        grupoC.getListaDepartidos().get(0).hacerGoles(2,1);
        grupoC.getListaDepartidos().get(1).hacerGoles(0,1);
        grupoC.getListaDepartidos().get(2).hacerGoles(5,1);
        grupoC.getListaDepartidos().get(3).hacerGoles(2,1);
        grupoC.getListaDepartidos().get(4).hacerGoles(3,1);
        grupoC.getListaDepartidos().get(5).hacerGoles(0,1);

        Grupo grupoD = new Grupo();
        grupoD.generarPartidos(teamgrupoD);
        grupoD.getListaDepartidos().get(0).hacerGoles(2,1);
        grupoD.getListaDepartidos().get(1).hacerGoles(0,1);
        grupoD.getListaDepartidos().get(2).hacerGoles(5,1);
        grupoD.getListaDepartidos().get(3).hacerGoles(2,1);
        grupoD.getListaDepartidos().get(4).hacerGoles(3,1);
        grupoD.getListaDepartidos().get(5).hacerGoles(0,1);

        Grupo grupoE = new Grupo();
        grupoE.generarPartidos(teamgrupoE);
        grupoE.getListaDepartidos().get(0).hacerGoles(2,1);
        grupoE.getListaDepartidos().get(1).hacerGoles(0,1);
        grupoE.getListaDepartidos().get(2).hacerGoles(5,1);
        grupoE.getListaDepartidos().get(3).hacerGoles(2,1);
        grupoE.getListaDepartidos().get(4).hacerGoles(3,1);
        grupoE.getListaDepartidos().get(5).hacerGoles(0,1);

        Grupo grupoF = new Grupo();
        grupoF.generarPartidos(teamgrupoF);
        grupoF.getListaDepartidos().get(0).hacerGoles(2,1);
        grupoF.getListaDepartidos().get(1).hacerGoles(0,1);
        grupoF.getListaDepartidos().get(2).hacerGoles(5,1);
        grupoF.getListaDepartidos().get(3).hacerGoles(2,1);
        grupoF.getListaDepartidos().get(4).hacerGoles(3,1);
        grupoF.getListaDepartidos().get(5).hacerGoles(0,1);

        Grupo grupoG = new Grupo();
        grupoG.generarPartidos(teamgrupoG);
        grupoG.getListaDepartidos().get(0).hacerGoles(2,1);
        grupoG.getListaDepartidos().get(1).hacerGoles(0,1);
        grupoG.getListaDepartidos().get(2).hacerGoles(5,1);
        grupoG.getListaDepartidos().get(3).hacerGoles(2,1);
        grupoG.getListaDepartidos().get(4).hacerGoles(3,1);
        grupoG.getListaDepartidos().get(5).hacerGoles(0,1);

        Grupo grupoH = new Grupo();
        grupoH.generarPartidos(teamgrupoH);
        grupoH.getListaDepartidos().get(0).hacerGoles(2,1);
        grupoH.getListaDepartidos().get(1).hacerGoles(0,1);
        grupoH.getListaDepartidos().get(2).hacerGoles(5,1);
        grupoH.getListaDepartidos().get(3).hacerGoles(2,1);
        grupoH.getListaDepartidos().get(4).hacerGoles(3,1);
        grupoH.getListaDepartidos().get(5).hacerGoles(0,1);

       ArrayList<Equipo> clasificadosOctavos = new ArrayList<Equipo>();
        clasificadosOctavos.addAll(grupoA.getEquiposQueAvanzan());
        clasificadosOctavos.addAll(grupoB.getEquiposQueAvanzan());
        clasificadosOctavos.addAll(grupoC.getEquiposQueAvanzan());
        clasificadosOctavos.addAll(grupoD.getEquiposQueAvanzan());
        clasificadosOctavos.addAll(grupoF.getEquiposQueAvanzan());
        clasificadosOctavos.addAll(grupoG.getEquiposQueAvanzan());
        clasificadosOctavos.addAll(grupoH.getEquiposQueAvanzan());

        Llave octavos = new Llave();
        octavos.generarPartidos(clasificadosOctavos);
        octavos.getListaDepartidos().get(0).hacerGoles(2,1);
        octavos.getListaDepartidos().get(1).hacerGoles(0,1);
        octavos.getListaDepartidos().get(2).hacerGoles(5,1);
        octavos.getListaDepartidos().get(3).hacerGoles(2,1);
        octavos.getListaDepartidos().get(4).hacerGoles(3,1);
        octavos.getListaDepartidos().get(5).hacerGoles(0,1);

        ArrayList<Equipo> clasificadosCuartos = octavos.getEquiposQueAvanzan();

        Llave cuartos = new Llave();
        cuartos.generarPartidos(clasificadosCuartos);
        cuartos.getListaDepartidos().get(0).hacerGoles(2,1);
        cuartos.getListaDepartidos().get(1).hacerGoles(0,1);
        cuartos.getListaDepartidos().get(2).hacerGoles(5,1);
        cuartos.getListaDepartidos().get(3).hacerGoles(2,1);

        ArrayList<Equipo> clasificadosSemis = cuartos.getEquiposQueAvanzan();

        Llave semis = new Llave();
        semis.generarPartidos(clasificadosSemis);
        semis.getListaDepartidos().get(0).hacerGoles(2,1);
        semis.getListaDepartidos().get(1).hacerGoles(0,1);

        ArrayList<Equipo> finalistas = semis.getEquiposQueAvanzan();

        Llave finalMundial = new Llave();
        finalMundial.generarPartidos(finalistas);
        finalMundial.getListaDepartidos().get(0).hacerGoles(2,1);

        ArrayList<Equipo> ganador = finalMundial.getEquiposQueAvanzan();

        System.out.println(String.format("Ganador: %S",ganador.get(0).getNombre()));

    }
}
