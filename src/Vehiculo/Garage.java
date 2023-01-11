package Vehiculo;

import java.util.ArrayList;

public class Garage {
    private double precio;
    private int capMaxima;
    private ArrayList<Vehiculo> listaDeVehiculo;
    private Boolean estaFull;


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
    public Garage(double precio, int capMaxima){
       this.setPrecio(precio);
       this.setCapMaxima(capMaxima);
       this.listaDeVehiculo = new ArrayList<Vehiculo>();
    }

    //Boolean y if para verificar que cuando ocupe capMaxima no se ingresen más vehiculos
    public boolean estaFull() {
        return this.listaDeVehiculo.size()>=capMaxima;
    }
    public void agregarVehiculo(Vehiculo vehiculo){
        if (estaFull()) return;
        this.listaDeVehiculo.add(vehiculo);

    }

        //Calcular el promedio de Km
    public double promedioKm() {
        double sumaKm=0 ;
        for (int i=0; i<this.listaDeVehiculo.size(); i++) {
            sumaKm=sumaKm + this.listaDeVehiculo.get(i).getKm();

        }
        return sumaKm/ listaDeVehiculo.size();
    }

        //Calcular el precio del cambio de rueda

        public double precioTotalRuedas() {

             double sumaTotalRuedas = 0;

            for (int i = 0; i < listaDeVehiculo.size(); i++) {
                sumaTotalRuedas= sumaTotalRuedas + this.listaDeVehiculo.get(i).getCantDeRuedas();
            }
             return sumaTotalRuedas * precio;

        }


        public Boolean getEstaFull() {
            return estaFull;
    }

        public void setEstaFull(Boolean estaFull) {

                    this.estaFull = estaFull;
                }
            }


