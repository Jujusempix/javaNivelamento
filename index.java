import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        Integer maiorValor, maiorPosicao;

        System.out.println("Informe primeiro número:");
        Integer n1 = prompt.nextInt();
        maiorValor = n1;
        maiorPosicao = 1;

        System.out.println("Informe segundo número:");
        Integer n2 = prompt.nextInt();
        if (n2 > maiorValor){
            maiorValor = n2;
            maiorPosicao = 2;
        }

        System.out.println("Informe terceiro número:");
        Integer n3 = prompt.nextInt();
        if (n3 > maiorValor){
            maiorValor = n3;
            maiorPosicao = 3;
        }

        System.out.println("Informe quarto número:");
        Integer n4 = prompt.nextInt();
        if (n4 > maiorValor){
            maiorValor = n4;
            maiorPosicao = 4;
        }

        System.out.println("Informe quinto número:");
        Integer n5 = prompt.nextInt();
        if (n5 > maiorValor){
            maiorValor = n5;
            maiorPosicao = 5;
        }

        System.out.println("o mais pica é "+maiorValor+" na posição "+maiorPosicao);
    }
}