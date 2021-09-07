import java.util.*;

public class Destinos {

  private int op_destino;
  public int city;
  Scanner inputScan = new Scanner(System.in);

  public void menu_destino() {

    do {

      System.out.println("Digite o numero indicado para escolher a cidade ");
      System.out.println("--------------------------------------------------------");
      System.out.println("[1] - Rio de Janeiro");
      System.out.println("[2] - Sao Paulo");
      System.out.println("[3] - Foz do Iguacu");
      System.out.println("[4] - Salvador");
      System.out.println("[5] - Florianopolis");
      System.out.println("--------------------------------------------------------");

      op_destino = inputScan.nextInt();

      switch (op_destino) {
        case 1:
          city = 1;
          break;

        case 2:
          city = 2;
          break;

        case 3:
          city = 3;
          break;

        case 4:
          city = 4;
          break;

        case 5:
          city = 5;
          break;
      }
    }

    while (op_destino != 0);
  }
}