import java.util.Scanner;

public class calculadora {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        cabecalho();
        menu();

        int entrada = valida_entrada(entrada_int("\nDigite a opção desejada: "), 1, 4);

        double n1 = entrada_double("Informe o primeiro valor: ");
        double n2 = entrada_double("Informe o segundo valor: ");

        double resultado = 0.0;
        String tipoOperacao = "";

        switch (entrada) {
            case 1:
                resultado = soma(n1, n2);
                tipoOperacao = "SOMA";
                break;
            case 2:
                resultado = subtracao(n1, n2);
                tipoOperacao = "SUBTRAÇÃO";
                break;
            case 3:
                resultado = multiplicacao(n1, n2);
                tipoOperacao = "MULTIPLICACAO";
                break;
            case 4:
                resultado = divisao(n1, n2);
                tipoOperacao = "DIVISÃO";
                break;
        }

        retorno_resultado(tipoOperacao, resultado);
    }

    static void cabecalho() {
        System.out.println("========== CALCULADORA ==========");
    }

    static void menu() {
        System.out.println("Escolha uma das opções: ");
        System.out.println("1 - Para somar");
        System.out.println("2 - Para subtrair");
        System.out.println("3 - Para multiplicar");
        System.out.println("4 - Para dividir");
    }

    static int entrada_int(String mensagem) {
        System.out.print(mensagem);
        int entrada = Integer.parseInt(sc.nextLine());
        return entrada;
    }

    static double entrada_double(String mensagem) {
        System.out.print(mensagem);
        double entrada = Double.parseDouble(sc.nextLine());
        return entrada;
    }

    static int valida_entrada(int entrada, int inicio, int limite) {
        while (entrada < inicio || entrada > limite) {
            entrada = entrada_int("\nValor inválido. Digite novamente: ");
        }
        return entrada;
    }

    static double soma(double a, double b) {
        double resultado = a + b;
        return resultado;
    }

    static double subtracao(double a, double b) {
        double resultado = a - b;
        return resultado;
    }

    static double multiplicacao(double a, double b) {
        double resultado = a * b;
        return resultado;
    }

    static double divisao(double a, double b) {
        double resultado = a / b;
        return resultado;
    }

    static void retorno_resultado(String operacao, double calculo) {
        System.out.printf("O resultado da %s é %.2f", operacao, calculo);
    }

}
