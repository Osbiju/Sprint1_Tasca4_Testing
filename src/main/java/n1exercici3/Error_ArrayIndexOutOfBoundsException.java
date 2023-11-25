package n1exercici3;

import org.testng.annotations.Test;

import java.lang.reflect.Array;

import static org.testng.Assert.assertThrows;
@Test
public class Error_ArrayIndexOutOfBoundsException {
    int[] array = new int[5];


    void provocarErrorTest() {
        array[6] = 0;
    }
}
