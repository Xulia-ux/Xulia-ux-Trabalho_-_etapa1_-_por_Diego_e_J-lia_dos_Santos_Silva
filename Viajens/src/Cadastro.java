import java.util.*;

public class Cadastro {

    Scanner pega = new Scanner(System.in);
    // nome preferencial
    public String nome;
    private String cpf;
    public String email;
    private String senha;

    void inicio() {

        System.out.println("\n\t--CADASTRO--");
        System.out.print("\nInsira seu nome: ");
        nome = pega.nextLine();
        System.out.println("\n");
        System.out.print("Insira seu CPF: ");
        cpf = pega.nextLine();
        System.out.println("\n");
        System.out.print("Insira seu e-mail: ");
        email = pega.nextLine();
        System.out.println("\n");
        System.out.print("Insira seu senha: ");
        senha = pega.nextLine();

        System.out.println("\n");
    }

}