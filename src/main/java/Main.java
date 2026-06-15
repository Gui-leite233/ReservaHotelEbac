import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op;

        System.out.println("Escolha a opção que deseja: ");
        op = in.nextInt();

        //place holders
        switch (op) {
            case 1:
                NovaReserva();
                break;
            case 2:
                ListarReservas();
                break;
            case 3:
                BuscaReservaNome();
                break;
            case 4:
                OrdenaReservaNumDias();
                break;
            default:
                break;
        }

        in.close();
    }
}
