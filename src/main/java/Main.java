import com.hotel.Reserva;
import java.util.Scanner;

public class Main {
    

    static Reserva[] reservas = new Reserva[10];
    static Scanner in = new Scanner(System.in);
    static int cont = 0;

    public static void main(String[] args) {
        int op=0;

        while (op != 5) {
            clearScreen();
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
            in.nextLine();
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

            if (op != 5) {
                System.out.println("\nPressione ENTER para continuar...");
                in.nextLine();
            }
        }

        in.close();
    }


    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void separacao(){
        for (int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void NovaReserva() {
       if (cont >= reservas.length) {
            System.out.println("Hotel lotado! Capacidade máxima atingida.");
            return;
       } 

        //in.nextLine();
        System.out.println("Nome do hóspede: ");
        String nome = in.nextLine();


        System.out.println("Tipo do quarto: ");
        String quarto = in.nextLine();


        int dias = 0;
        while (dias<1) {
            System.out.println("Número de dias: ");
            dias = in.nextInt();
            if (dias<1) {
                System.out.println("O número de dias tem que ser maior que 1.");
            }

        }

        int diaria =0;
        while (diaria<=0) {
            System.out.println("Valor da diária: ");
            diaria = in.nextInt();
            if (diaria<=0) {
                System.out.println("O valor da diária tem que ser maior que 1");
            }
        }

        reservas[cont] = new Reserva(nome, quarto, dias, diaria);
        cont++;
        System.out.println("Reserva cadastrada com sucesso!");
    }

    public static void ListarReservas() {
        if (cont == 0) {
           System.out.println("Nenhuma reserva cadastrada."); 
        }
        for (int i = 0; i < cont; i++) {
            System.out.println(reservas[i]);
        }
    }

    public static void BuscaReservaNome() {
        
        System.out.println("Digite o nome para busca: ");
        String busca = in.nextLine().toLowerCase();

        boolean encontrado = false;
        for (int i = 0; i < cont; i++) {
            if (reservas[i].getNome().toLowerCase().contains(busca)) {
                System.out.println(reservas[i]);
                encontrado = true;
            }
        }
        if (!encontrado) System.out.println("Nenhuma reserva encontrada.");
    }

    public static void OrdenaReservaNumDias() {
        for (int i = 0; i < cont - 1; i++) {
            for (int j = 0; j < cont - i - 1; j++) {
                if (reservas[j].getNumDias() < reservas[j + 1].getNumDias()) {
                    Reserva temp = reservas[j];
                    reservas[j] = reservas[j + 1];
                    reservas[j + 1] = temp;
                }
            }
        }
        System.out.println("Reservas ordenadas por número de dias!");
        ListarReservas();
    }



}
