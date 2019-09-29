package ejercicio;

public class Persona {
    private double peso;
    private double vitalidad;
    private double temperatura;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getVitalidad() {
        return vitalidad;
    }

    public void setVitalidad(double vitalidad) {
        this.vitalidad = vitalidad;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public void verseAfectado(Afeccion afeccion){
        afeccion.afectarA (this);
    };

   public void afectarPeso (double valor){ //multiplico por el valor ej 10% = 0.1
       this.peso=getPeso()+getPeso()*valor;
   };

   public void afectarTemperatura (double valor){
       this.temperatura=getTemperatura()+valor;
   };

   public void afectarVitalidad (double valor){
       this.vitalidad=getVitalidad()+valor;
   };

}
