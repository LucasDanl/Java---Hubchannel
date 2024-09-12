
public class Calculator {

    public float adicao(float numero1, float numero2) {
        return numero1 + numero2;
    }

    public float substracao(float numero1, float numero2) {
        return numero1 - numero2;
    }

    public float mult(float numero1, float numero2) {
        return numero1 * numero2;
    }

    public float divisao(float numero1, float numero2) {
        if (numero2 != 0) {
            return numero1 / numero2;
        } else {
            System.out.println("Divisão por zero não permitida");
            return 0;
        }
    }
}
