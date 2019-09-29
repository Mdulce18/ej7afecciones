package ejercicio;

public class Estres implements Afeccion {
        public void afectarA(Persona persona) {
            persona.afectarVitalidad(persona.getVitalidad()*-0.2);
        }
    }
