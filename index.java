import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);


        System.out.println("Hello World");
        int horas = 5, minutos = 30, segundos = 35, tempo = 60;

        horas = (horas * tempo) * tempo;
        minutos = minutos * tempo;
        segundos = segundos + minutos + horas;

        System.out.println("Resultado: " + segundos);


        System.out.println("informer hora:");
        int horas = prompt.nextInt();
        System.out.println("informer minutos:");
        int minutos = prompt.nextInt();
        System.out.println("informer segundos:");
        int segundos = prompt.nextInt();

    }
}