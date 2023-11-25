package n1exercici1;

import org.testng.annotations.Test;

import java.util.ArrayList;
public class MesosDelAny {

    @Test
    public void  MesosDelAny(){
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

        //verificacio que te 12 mesos
        asserEquals(12, llistaMesos.size());
        asserNotNull(llistaMesos);
        asserEquals("Agost", llistaMesos.get(7));

    }

}
