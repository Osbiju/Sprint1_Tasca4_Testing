package n1exercici1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MesosDelAnyTest {

    @Test
    void  MesosDelAny(){
        ArrayList<String> llistaMesos = new ArrayList<String>();

        llistaMesos.add("Gener");
        llistaMesos.add("Ferbrer");
        llistaMesos.add("Març");
        llistaMesos.add("Abril");
        llistaMesos.add("Maig");
        llistaMesos.add("Juny");
        llistaMesos.add("Juliol");
        llistaMesos.add("Agost");
        llistaMesos.add("Setembre");
        llistaMesos.add("Octubre");
        llistaMesos.add("Novembre");
        llistaMesos.add("Desembre");

        //verificacions
        assertEquals(12, llistaMesos.size());
        assertNotNull(llistaMesos);
        assertEquals("Agost", llistaMesos.get(7));

    }

}