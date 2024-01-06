package n1exercici2;

public class CalculoDni {
    //atribut
    private int numeroDni;
    private int residu;
    final char lletra;

    //construct
    public CalculoDni(int numeroDni){
        residu = numeroDni % 23;
        lletra = getLletra(residu);
        System.out.println("La teva lletra del DNI es: " + lletra); //el sout podria estar en el main
    }
    //getter
    public int getNumeroDni() {
        return this.numeroDni;
    }
    public int getResidu() {
        return this.residu;
    }

    public char getLletra(int residu) {
        char[] lletras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return lletras[residu];
    }

    public boolean comprobarLletraDni() {
        char[] lletras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

        return lletras[this.residu] == this.lletra;
    }


}

