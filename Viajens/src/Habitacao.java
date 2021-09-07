import java.util.*;

public class Habitacao {

  private int op_habitacao;
  public int locality;
  Scanner inputScan = new Scanner(System.in);

  public void menu_destino() {

    do {

      System.out.println("Digite o numero indicado para escolher a cidade ");
      System.out.println("--------------------------------------------------------");
      System.out.println("[1] - Hotel");
      System.out.println("[2] - Casa");
      System.out.println("[3] - Apartamento");
      System.out.println("[4] - Kitnet");
      System.out.println("--------------------------------------------------------");

      op_habitacao = inputScan.nextInt();

      switch (op_habitacao) {
        case 1:
          locality = 1;
          break;

        case 2:
          locality = 2;
          break;

        case 3:
          locality = 3;
          break;

        case 4:
          locality = 4;
          break;
      }
    }

    while (op_habitacao != 0);
  }
}