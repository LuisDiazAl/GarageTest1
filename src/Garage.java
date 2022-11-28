import Vehiculo.Vehiculo;

import java.util.ArrayList;

public class Garage {
    private double precio;
    private int capMaxima;
    private ArrayList<Vehiculo> listaDeVehiculo;
    private Vehiculo transporte;
    private double precioCambioRueda;

    private Vehiculo estaFull;


    //Setters y Getters de Arraylist
    public ArrayList<Vehiculo> getListaDeVehiculo() {

        return listaDeVehiculo;
    }

    public void setListaDeVehiculo(ArrayList<Vehiculo> listaDeVechilo) {
        this.listaDeVehiculo = listaDeVehiculo;
    }

    //Metodos Add y Remove

    public void RetirarVehiculo(Vehiculo listaDeVehiculo){
        this.listaDeVehiculo.remove(listaDeVehiculo);
    }


    //Setters y Getters de precio
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }


    //Metodo constructor de garage
    Garage(double precio,int capMaxima){
       this.setPrecio(precio);
       this.setCapMaxima(capMaxima);
       this.listaDeVehiculo = new ArrayList<Vehiculo>();
    }


    public double cambioRueda(){
        double ruedasTotal = this.transporte.getCantDeRuedas();
        double precioTotal;
        return precioTotal= ruedasTotal*precioCambioRueda;
    }

    //Boolean y if para verificar que cuando ocupe capMaxima no se ingresen más vehiculos
    public boolean estaFull() {
        return this.listaDeVehiculo.size()>=capMaxima;
    }
    public void AgregarVehiculo(Vehiculo vehiculo){
        if (estaFull()) return;
        this.listaDeVehiculo.add(vehiculo);

    }

    //Calcular el promedio de Km
    void promedioKm() {
        for (getListaDeVehiculo().get(i); i < listaDeVehiculo; i++) {
          
        }

        //Calcular el precio del cambio de rueda
    }




}


