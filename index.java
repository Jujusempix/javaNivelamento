import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);

        System.out.println("Informe um número:");
        Integer numero1 = prompt.nextInt();
        System.out.println("Informe um número:");
        Integer numero2 = prompt.nextInt();

        if(numero1 > numero2){
            System.out.println("numero 1 maior que numero 2");
        } else if(numero2 > numero1){
            System.out.println("numero 2 maior que numero 1");
        } else {
            System.out.println("tudo igual no bagui");
        }
    }
}