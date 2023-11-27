package n1exercici3;

public class Error_ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {


        provocarErrorTest();

    }

    static void provocarErrorTest() {
        int[] array = new int[5];
        array[5] = 0;//provoco error
    }
}
