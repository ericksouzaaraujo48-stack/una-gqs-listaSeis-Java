public class CalculoFatorial {

    // Método que calcula o fatorial
    public static int calcular(int numero) {
        int resultado = 1; // Começa em 1 porque estamos multiplicando

        // Um loop que vai de 1 até o número que você escolheu
        for (int i = 1; i <= numero; i++) {
            resultado = resultado * i; // Multiplica o resultado pelo número atual
        }

        return resultado;
    }

    public static void main(String[] args) {
        int numeroEscolhido = 5;
        
        int valorFinal = calcular(numeroEscolhido);
        
        System.out.println("O fatorial de " + numeroEscolhido + " é: " + valorFinal);
    }
}