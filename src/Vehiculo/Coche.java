package Vehiculo;

public class Coche extends Vehiculo {
    private int cantDePuertas;

    //Creamos Setters y Getters
    public int getCantDePuertas() {
        return cantDePuertas;
    }

    public void setCantDePuertas(int cantDePuertas) {
        this.cantDePuertas = cantDePuertas;
    }

    //Metodo constructor de la clase Coche
    public Coche(String marca, double km, int cantDeRuedas, int cantDePuertas){
        this.setCantDePuertas(cantDePuertas);
        this.setMarca(marca);
        this.setCantDeRuedas(cantDeRuedas);
        this.setKm(km);

    }

}
