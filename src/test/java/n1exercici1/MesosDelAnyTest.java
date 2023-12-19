package n1exercici1;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MesosDelAnyTest {
    private static ArrayList<String> llistaMesos = new ArrayList<String>();

    @BeforeAll
    public static void MesosDelAny() {

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

    }

    @Test
    public void verificarNumMesos() {
        assertEquals(12, llistaMesos.size());
    }

    @Test
    public void verificarNotNull() {
        assertNotNull(llistaMesos);
    }

    @Test
    public void verificarEquals() {
        assertEquals("Agost", llistaMesos.get(7));
    }


}