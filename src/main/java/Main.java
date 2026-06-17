import com.hotel.Reserva;
import java.util.Scanner;

public class Main {
    

    static Reserva[] reservas = new Reserva[10];
    static Scanner in = new Scanner(System.in);
    static int cont = 0;

    public static void main(String[] args) {
        int op=0;

        while (op != 5) {

            separacao();
            System.out.println("Opções disponíveis abaixo\n");
            System.out.println(" 1 - Criar uma nova reserva");
            System.out.println(" 2 - Listar reservas");
            System.out.println(" 3 - Buscar reserva pelo nome");
            System.out.println(" 4 - Ordernar reservas por número de dias");
            System.out.println(" 5 - Sair");
            separacao();
            System.out.print("Escolha a opção que deseja: ");
            op = in.nextInt();
            separacao();
        
            
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
                case 5:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        in.close();
    }


    public static void separacao(){
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void NovaReserva() {
        
    }

    public static void ListarReservas() {
        
    }

    public static void BuscaReservaNome() {
        
    }

    public static void OrdenaReservaNumDias() {
        
    }

}
