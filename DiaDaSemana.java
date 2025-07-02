import java.util.Scanner;

public class DiaDaSemana {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um numero de 1 a 7: ");
        int number = scanner.nextInt();

        // switch (number) {
        //     // case 1, 7 -> System.out.println("Final de semana");
        //     case 1 -> System.out.println("Domingo");
        //     case 2 -> System.out.println("Segunda-feira");
        //     case 3 -> System.out.println("Terça-feira");
        //     case 4 -> System.out.println("Quarta-feira");
        //     case 5 -> System.out.println("Quinta-feira");
        //     case 6 -> System.out.println("Sexta-feira");
        //     case 7 -> System.out.println("Sábado");
        //     default -> System.out.println("Opção inválida");
        // }

        // scanner.close();

        var message = switch (number) {
            case 1,7 ->{
                var day = number == 1 ? "Domingo" : "Sábado";
                yield "Final de semana: " + day;
            }
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            default -> "Opção inválida";
        };

        System.err.println(message);
    }
}
