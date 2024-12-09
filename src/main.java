import java.util.Scanner;

public class main {
    public static void main(String[] args){


        Scanner sc= new Scanner(System.in);
        int escolha;
        Robo r1 = new Robo(0,0,2,20,40);

        do{

            r1.criandoSala();
            r1.mostrarPosicaoAtual();

            System.out.println("Joguinho Robo");
            System.out.println("1- Andar para frente");
            System.out.println("2- Andar para trás");
            System.out.println("3- Andar para direita");
            System.out.println("4- Andar para esquerda");
            System.out.println("5- Sair");

            escolha= sc.nextInt();
            sc.nextLine();

            switch(escolha){

                case 1 -> r1.andarFrente();

                case 2-> r1.andarTras();

                case 3-> r1.andarDireita();

                case 4-> r1.andarEsquerda();

                case 5-> System.out.println("Saindo ...");

                default -> System.out.println("Opção inválida, tente novamente.");
            }

        }while(escolha!=5);
        sc.close();
    }

}
