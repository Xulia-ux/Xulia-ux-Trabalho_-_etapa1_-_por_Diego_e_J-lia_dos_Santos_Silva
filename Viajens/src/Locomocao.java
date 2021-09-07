import java.util.*;

public class Locomocao {

  private int op_locomocao;
  public int transportation;
  Scanner inputScan = new Scanner(System.in);

  public void menu_locomocao() {

    do {

      System.out.println("Insira o numero indicado para escolher meio de locomocao");
      System.out.println("--------------------------------------------------------");
      System.out.println("[1] - Aviao");
      System.out.println("[2] - Onibus");
      System.out.println("[3] - Trem");
      System.out.println("[4] - Barco");
      System.out.println("--------------------------------------------------------");

      op_locomocao = inputScan.nextInt();

      switch (op_locomocao) {
        case 1:
          transportation = 1;
          break;

        case 2:
          transportation = 2;
          break;

        case 3:
          transportation = 3;
          break;

        case 4:
          transportation = 4;
          break;
      }
    }

    while (op_locomocao != 0);
  }

}