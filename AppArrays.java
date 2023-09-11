import java.util.Arrays;

public class AppArrays {
    public static void main(String[] args) {
        
        double vetor[] = {30, 60, 90};

        System.out.println(Arrays.toString(vetor));
        System.out.println("Elemento da posição 0: " + vetor[0]);
        System.out.println("Elemento da posição 1: " + vetor[1]);
        System.out.println("Elemento da posição 2: " + vetor[2]);

        vetor[0] = 3;
        System.out.println("Elemento da posição 0: " + vetor[0]);

        int vet[] = new int[5];
        for (int i = 0; i < vet.length; i++) {
            vet[i] = 100 * (i + 1);
        }

        System.out.println(Arrays.toString(vet));

        int vetor2[] = new int[4];
        vetor2[0] = 11;
        vetor2[1] = 22;
        vetor2[2] = 33;
        vetor2[3] = 44;
        System.out.println(Arrays.toString(vetor2));

        int matriz[][] = {{3, 6, 9}, {6, 12, 18}};
        System.out.println(Arrays.toString(matriz[0]));
        System.out.println(Arrays.toString(matriz[1]));

        matriz[0][1] = -6;
        System.out.println(Arrays.toString(matriz[0]));
        matriz[0] = new int[]{-3, 66, -9};
        System.out.println(Arrays.toString(matriz[0]));

        double matrix[][] = new double[2][3];
        for (int i = 0; i < matrix.length; i ++) {
            for ( int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i * matrix[i].length + j;
            }
        }

        for (int i = 0; i < matrix.length; i ++) {
            for ( int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.err.println();
        }


    }
}
