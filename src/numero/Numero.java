package numero;

public class Numero {
    int lv;
    String ch;

    public Numero(int lv, String ch) {
        this.lv = lv;
        this.ch = ch;
    }

    public void imprimirNumero() {
        for (int i = 0; i < lv; i++) {

            for (int j = 0; j < lv; j++) {
                if (j == 0 || j == lv - 1 || i == 0 || i == lv - 1) {
                    System.out.print(ch);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
