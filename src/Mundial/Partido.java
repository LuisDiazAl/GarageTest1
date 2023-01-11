package Mundial;
import java.util.Date;

public class Partido {

    private Date fecha;
    private Equipo local;
    private Equipo visitante;
    private Resultado resultado;

           //Setter y Getters de Fecha-Local-Visitante-Resultado

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public Resultado getResultado() {
        return resultado;
    }

    public void setResultado(Resultado resultado) {
        this.resultado = resultado;
    }

               //Metodo constructor de Partido

    public Partido(Date fecha, Equipo local, Equipo visitante) {
        this.setFecha(fecha);
        this.setLocal(local);
        this.setVisitante(visitante);
        this.setResultado(new Resultado());
    }

    public void hacerGoles(int golesLocal,int golesVisitante){
      getResultado().setGolesLocal(golesLocal);
      getResultado().setGolesVisitante(golesVisitante);
    }

    Partido(){

    }

}
