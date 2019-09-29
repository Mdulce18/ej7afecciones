package Tests;

import ejercicio.*;
import junit.framework.TestCase;

public class PersonaTest extends TestCase {
    CentroSalud centroUno = new CentroSalud();
    Persona sara = new Persona();
    Persona pepe = new Persona();
    Malaria malaria = new Malaria();
    Varicela varicela = new Varicela();
    Estres estres = new Estres();
    Paracetamol paracetamol = new Paracetamol();
    public void setUp() {
        centroUno.agregarPacientes(sara);
        centroUno.agregarPacientes(pepe);
        sara.setTemperatura(36);
        sara.setPeso(50);
        sara.setVitalidad(100);
    }

    public void testafectarMalaria(){
        sara.verseAfectado(malaria);
        assertTrue(sara.getTemperatura()==39);
    }

    public void testafectarVaricela(){
        sara.verseAfectado(varicela);
        assertTrue(sara.getVitalidad()==95 && sara.getPeso()==(50-50*0.1));
    }

    public void testafectarParacetamol(){
        sara.verseAfectado(paracetamol);
        assertTrue(sara.getTemperatura()==36 );
    }



    public void testafectarStres(){
        sara.verseAfectado(estres);
        assertTrue(sara.getVitalidad()==80);
    }

    public void testCantidaPacientes (){
        assertTrue(centroUno.cantPacientes()==2);
    }

}