import java.util.Scanner;

public class ProjetoProvaRevisao {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int votosTaffe = 0;
        int votosRodrigo = 0;
        int votosLucas = 0;
        int votosAlessandro = 0;
        int votosInvalidos = 0;

        // Informar quantos usuarios vao votar
        System.out.println("Informe quantos eleitores");
        int quantidadeEleitor = scanner.nextInt();

        //Criando uma forma de guardar os votos
        int[] votosRealizados = new  int[quantidadeEleitor]

        for (int i = 0; i < quantidadeEleitor; i++) {

            int voto = 0;

            do {
                System.out.println("Eleitor numero " + i);
                System.out.println("Os candidatos da eleição são os seguintes:");
                System.out.println("99 - Taffe");
                System.out.println("88 - Rodrigo");
                System.out.println("77 - Lucas");
                System.out.println("66 - Alessandro");
                System.out.println("Qual o seu voto ? ");
                voto = scanner.nextInt();
            } while (voto != 99 && voto != 88 && voto != 77 && voto != 66);

            //Guarda o voto
            votosRealizados[i] = voto;

            // Contabiliza o total dos votos
            if (voto == 99) {
                votosTaffe++;
            } else if (voto == 88) {
                votosRodrigo++;
            } else if (voto == 77) {
                votosLucas++;
            } else {
                votosAlessandro++;
            }

        }

        System.out.println("Exibindo os votos");
        System.out.println("Taffe Teve : " + votosTaffe + " Votos! ");
        System.out.println("Rodrigo Teve : " + votosRodrigo + " Votos! ");
        System.out.println("Lucas Teve : " + votosLucas + " Votos! ");
        System.out.println("Alessandro Teve : " + votosAlessandro + " Votos! ");

        if (votosTaffe > votosRodrigo && votosTaffe > votosLucas && votosTaffe > votosAlessandro){
        System.out.println("O grande ganhador é o Taffe");
    } else if (votosRodrigo > votosTaffe && votosRodrigo > votosLucas && votosRodrigo > votosAlessandro ){
        System.out.println("O grande ganhador é o Rodrigo");
        }else if (votosLucas > votosRodrigo && votosLucas > votosTaffe && votosRodrigo > votosAlessandro ){
            System.out.println("O grande ganhador é o Lucas");
        }else {
            System.out.println("O grande ganhador é o Alessandro");
        }
    }
}
