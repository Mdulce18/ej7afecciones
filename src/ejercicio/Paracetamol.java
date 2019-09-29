package ejercicio;

public class Paracetamol implements Afeccion {

    public void afectarA(Persona persona) {
        if (persona.getTemperatura()>37){
            persona.setTemperatura(37);
        }
    }
}
