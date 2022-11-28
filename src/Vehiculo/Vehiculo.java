package Vehiculo;

public class Vehiculo {
    //Atributos de la clase Vehiculo
    private String marca;
    private double km;
    private int cantDeRuedas;

    private String modelo;

    //Setters y Getters de marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Setters y Getters de Km
    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    //Setters y getters cantDeRuedas
    public int getCantDeRuedas() {
        return cantDeRuedas;
    }

    public void setCantDeRuedas(int cantDeRuedas) {
        this.cantDeRuedas = cantDeRuedas;
    }

    //Setters y Getters Modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
