import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        Integer maiorValor = 0, maiorPosicao = 0;
        final Integer quantidade = 5;
        Integer numeros[] = new Integer[quantidade];

        for(int i = 0; i < quantidade; i++){
            System.out.println("informa o "+(i+1)+"° numero do arraia de são joão");
            numeros[i] = prompt.nextInt();

            if(numeros[i] == 0){
                maiorValor = numeros[i];
                maiorPosicao = i+1;
            }else if(numeros[i] > maiorValor){
                maiorValor = numeros[i];
                maiorPosicao = i+1;
            }
        }
        System.out.println("valores recebidos:");
        for(int i = 0 ; i < quantidade ;i++){
            System.out.println((i+1)+"° posição = "+numeros[i]);
        }
        System.out.println("O maior numero é "+maiorValor+" na "+maiorPosicao+"° posição");
    }
}