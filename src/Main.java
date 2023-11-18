import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite qual foi o numero de vitorias do seu heroi");
        int vitoria = scanner.nextInt();
        System.out.println("Digite qual foi o numero de derrotas do seu heroi");
        int derrota = scanner.nextInt();
        int saldo = resultado(vitoria, derrota);

        String nivel;
        if(saldo < 10) {
            nivel = "Ferro";
        } else if (saldo > 11 && saldo < 20) {
            nivel = "Bronze";
        } else if (saldo > 21 && saldo < 50) {
            nivel = "Prata";
        } else if (saldo > 51 && saldo < 80) {
            nivel = "Ouro";
        } else if (saldo > 81 && saldo < 90) {
            nivel = "Diamante";
        } else if (saldo > 91 && saldo < 100) {
            nivel = "Lendário";
        } else {
            nivel = "Imortal";
        }

        System.out.println("O Herói tem o saldo de vitórias de " + saldo + " está no nível de " + nivel + ".");
    }
    public static int resultado(int vitoria,int derrota) {
        return vitoria - derrota;
    }
}