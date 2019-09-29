package ejercicio;

public class Varicela implements Afeccion {
        public void afectarA(Persona persona) {
            persona.afectarVitalidad(-5);
            persona.afectarPeso(-0.1);
        }
    }

