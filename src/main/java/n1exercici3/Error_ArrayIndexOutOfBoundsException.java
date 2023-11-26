package n1exercici3;

public class Error_ArrayIndexOutOfBoundsException {

    void provocarErrorTest() {
        int[] array = new int[5];
        array[5] = 0;//provoco error
    }
}
