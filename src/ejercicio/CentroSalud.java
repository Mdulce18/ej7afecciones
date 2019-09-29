package ejercicio;

import java.util.ArrayList;
import java.util.List;

public class CentroSalud {
private List <Persona> pacientes= new ArrayList<Persona>();

public Integer cantPacientes(){
    return pacientes.size();
}


    public void agregarPacientes(Persona persona) {
        pacientes.add(persona);
    }
}


















