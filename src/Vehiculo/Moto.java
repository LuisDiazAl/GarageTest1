package Vehiculo;

public class Moto extends Vehiculo {
    private int cilindraje;

    //Creamos Setters y Getters cilindraje
    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    //Metodo constructor de Moto
    public Moto(String marca, double km, int cantDeRuedas, int cilindraje){
        this.setCilindraje(cilindraje);
        this.setMarca(marca);
        this.setCantDeRuedas(cantDeRuedas);
        this.setKm(km);

    }


}
