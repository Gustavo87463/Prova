import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("1 - Adicionar contato: ");
        System.out.println("2 - Buscar contato por codigo: ");
        System.out.println("3 - Remover contato por codigo: ");
        System.out.println("4 - Editar contato");
        System.out.println("5 - Sair");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
            System.out.println("Digite o codigo: ");
            int codigo = entrada.nextInt();
            System.out.println("Digite seu nome: ");
            String nome = entrada.next();
            System.out.println("DIgite seu telefone: ");
            int telefone = entrada.nextInt();
            System.out.println("Digite seu email: ");
            String email = entrada.next(); 
                break;
        
            default:
                break;
        }
        
        


        entrada.close();        
    }
    
    
}
