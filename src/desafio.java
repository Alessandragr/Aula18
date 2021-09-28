public class desafio {
    public static void main(String[] args) {
        titulo();

        int resultadoSoma1 = soma(33, 20);
        saida_int("Soma 1", resultadoSoma1);
        int resultadoSoma2 = soma(20, 33);
        saida_int("Soma 2", resultadoSoma2);
        int resultadoSoma3 = soma(33, 40);
        saida_int("Soma 3", resultadoSoma3);
        int resultadoSoma4 = soma(40, 53);
        saida_int("Soma 4", resultadoSoma4);

        double resultadoMedia = media(resultadoSoma1, resultadoSoma2, resultadoSoma3, resultadoSoma4);
        saida_double("Media", resultadoMedia);
    }

    static void titulo() {
        System.out.println("Cálculo de média");
    }

    static int soma(int a, int b) {
        int calculo = a + b;
        return calculo;
    }

    static double media(int a, int b, int c, int d) {
        double calculo = (a + b + c + d) / 4.0;
        return calculo;
    }

    static void saida_int(String operacao, int resultado) {
        System.out.printf("O resultado da %s foi %d\n", operacao, resultado);
    }

    static void saida_double(String operacao, double resultado) {
        System.out.printf("O resultado da %s foi %.2f\n", operacao, resultado);
    }

}
