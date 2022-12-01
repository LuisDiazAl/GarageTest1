package Mundial;

public class Resultado {
    private int golesLocal;
    private int golesVisitante;


    //Setters y Getters de golesLocal-golesVisitante
    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }

             //Boolean de quien gano
    public boolean ganoLocal() {

        if (golesLocal > golesVisitante) return ganoLocal();
        else if (golesVisitante > golesLocal) {
            return false;
        } else if (golesLocal == golesVisitante) {
           //Saber como mostrar el empate
        }
           return false;
    }

}
