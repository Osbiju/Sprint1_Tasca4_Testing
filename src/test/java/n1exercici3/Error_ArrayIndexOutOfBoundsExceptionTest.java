package n1exercici3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class Error_ArrayIndexOutOfBoundsExceptionTest {
    @Test
    void provocarErrorTest() {
        int[] array = new int[5];

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            array[5] = 0;
        });



    }

}