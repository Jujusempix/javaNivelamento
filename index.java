import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        final Integer senhaCorreta = 12345 , quantidadeMaxima=3;
        Integer senhaDigitada = 0, quantidadeTentativa=0;

        do {
            System.out.println("Informe a senha");
            senhaDigitada = prompt.nextInt();
            if (!senhaDigitada.equals(senhaCorreta)){
                System.out.println("Senha Errada");
                quantidadeTentativa++;
            }
        }while(!senhaDigitada.equals(senhaCorreta) && quantidadeTentativa < quantidadeMaxima);

        if(quantidadeTentativa.equals(quantidadeMaxima)){
            System.out.println("BANIDO");
        }else{
            System.out.println("Senha Correta");
        }
    }
}