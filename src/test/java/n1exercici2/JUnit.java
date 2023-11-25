package n1exercici2;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class JUnit {
    @ParameterizedTest

    @ValueSource(ints = {11111111, 22222222, 33333333, 44444444, 55555555, 66666666, 77777777, 88888888, 99999999,10101010})

    void comprobacioTest(int dni) {
        boolean trobat = false;
        char[] lletras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        CalculoDni calculoDni = new CalculoDni(dni);

        for (int i = 0; i < lletras.length; i++) {
            if (lletras[i] == calculoDni.getLletra(calculoDni.getResidu())) {
                trobat = true;
            }
        }
        assertTrue(trobat);
    }
}