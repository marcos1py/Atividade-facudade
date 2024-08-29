public class App {
    public static void main(String[] args) throws Exception {

        // 10 aleatorio
        int[] vetor = { 10, 2, 1, 4, 8, 3, 6, 5, 7, 9 };

        int menorNumero = 1;
        int MaiorNumero = 1;

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menorNumero) {
                menorNumero = vetor[i];
            }
            if (vetor[i] > MaiorNumero) {
                MaiorNumero = vetor[i];
            }

        }
        System.out.println("O menor número é: " + menorNumero);
        System.out.println("O maior número é: " + MaiorNumero);
        int[][] matrizMae = { { 2, 2, 2 }, { 1, 1, 1 }, { 3, 21, 10 } };

        int valorTotal = 0;
        for (int i = 0; i < matrizMae.length; i++) {
            valorTotal = 0;
            for (int j = 0; j < matrizMae[i].length; j++) {
                valorTotal += matrizMae[i][j];

            }
            System.out.println("linha " + i + ", valor total: " + valorTotal);
        }

    }

}
