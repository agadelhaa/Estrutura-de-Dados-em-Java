import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemaCadastro sistema = new SistemaCadastro();

        sistema.cadastrarUsuario("Maria Bethânia", "12345678900", "mariab@teste.com", "999999999");
        sistema.cadastrarUsuario("Fernando", "98765432100", "fernandinho@teste.com", "888888888");
        

        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastrar novo usuário");
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite o email: ");
        String email = scanner.nextLine();

        System.out.print("Digite o celular: ");
        String celular = scanner.nextLine();

        sistema.cadastrarUsuario(nome, cpf, email, celular);
        System.out.println("Usuário cadastrado com sucesso!\n");


        System.out.println("Digite o CPF para busca: ");
        String cpfBusca = scanner.nextLine(); 

        Usuario usuario = sistema.buscarPorCPF(cpfBusca); 
        if (usuario != null) {
            System.out.println("Usuário encontrado: " + usuario);
        } else {
            System.out.println("Usuário não encontrado.");
        }

        scanner.close();
    }
}

// código para compilar e rodar
// javac Usuario.java SistemaCadastro.java Main.java
// java Main