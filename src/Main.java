import Vehiculo.Coche;
import Vehiculo.Moto;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Moto moto1 = new Moto("honda",3000,2,250);
    Moto moto2 = new Moto("suzuki",7000,2,350);

    Coche coche1 = new Coche("toyota",20000,4,4);
    Coche coche2 = new Coche("renault",50000,4,4);

    Garage garage1 = new Garage(20,3);


    garage1.AgregarVehiculo(moto1);
    garage1.AgregarVehiculo(coche1);

    garage1.AgregarVehiculo(moto2);
    garage1.AgregarVehiculo(coche2);

        System.out.println(String.format("Esta full¿?: %b \nCapacidad Actual: %s", garage1.estaFull(), garage1.getListaDeVehiculo().size()));

        //Falta mostrar la Operacion del coste de las ruedas



    }
}
