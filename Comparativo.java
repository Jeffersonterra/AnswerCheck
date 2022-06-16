import java.util.Scanner;

public class Comparativo {
    public static void main(String[] args) {

        double resposta;
        Scanner sc = new Scanner(System.in);
        resposta = sc.nextDouble();

        int count;
        double competidor1, competidor2, competidor3, competidor4, competidor5;
        count = 0;

        competidor1 = sc.nextDouble();
        competidor2 = sc.nextDouble();
        competidor3 = sc.nextDouble();
        competidor4 = sc.nextDouble();
        competidor5 = sc.nextDouble();
        if (resposta == competidor1) {
            count++;
        }
        if (resposta == competidor2) {
            count++;
        }
        if (resposta == competidor3) {
            count++;
        }
        if (resposta == competidor4) {
            count++;
        }
        if (resposta == competidor5) {
            count++;
        }
        System.out.println(count);

        sc.close();
    }
}
