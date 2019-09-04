package app;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String nome, comando;
        Random rand = new Random();
        System.out.println("Seja bem-vindo ao jogo! Insira seu nome: ");
        nome = in.nextLine();
        System.out.println("Seja muito bem-vindo(a) " + nome);
        System.out.println("Você deseja avançar para qual direção? (w, a, s, d)");
        comando = in.nextLine();
        if(comando.equals("w")){
            System.out.println("Você está indo para a frente");
            System.out.println("Um inimigo surgiu, o que deseja fazer? ([a]tacar ou [c]orrer)");
            comando = in.nextLine();
            if(comando.equals("a")){
                if(rand.nextInt(100) < 75){
                    System.out.println("Você acertou em cheio! Congratulations!");
                }else{
                    System.out.println("Você errou o ataque! Game Over!");
                }
            }else{
                System.out.println("Você correu! Game over!");
            }
        }else if(comando.equals("s")){
            System.out.println("Você volta e adentra uma caverna escura");
            System.out.println("Você vê um altar feito em pedra escura com sangue ao redor, o que deseja fazer? ([e]xaminar o altar ou [c]orrer)");
            comando = in.nextLine();
            if(comando.equals("e")){
                System.out.println("Enquanto examinava, um demônio te ataca pelas costas. Game Over!");
            }else if(rand.nextInt(100) < 50){
                System.out.println("Um demônio te persegue enquanto você corre, sem sucesso você sufoca em suas garras. Game Over!");
            }else{
                System.out.println("Um demônio te persegue enquanto você corre, com sucesso você foge. Congratulations!");
            }
        }else if(comando.equals("a")){
            System.out.println("Virando a esquerda você vê um cachorrinho, o que deseja fazer? [c]arinho ou [i]gnorar");
            comando = in.nextLine();
            if(comando.equals("c")){
                System.out.println("You can pet the dog. Congratulations");
            }else{
                System.out.println("O cachorro nao gosta de ser ignorado, se tranforma num lobo dígno de Bloodborne e num único golpe te dizima. Game muito Over!");
            }
        }else if(comando.equals("d")){
            System.out.println("Indo para a direita você vê uma freira simpática, o que deseja fazer? [a]tacar ou [c]onversar");
            comando = in.nextLine();
            if(comando.equals("a")){
                System.out.println("A freira inocente é brutalmente morta, você agora é um assassino. Game Over!");
            }else{
                System.out.println("A freira simpática te oferece um amuleto de proteção. Congratulations!");
            }
        }
        in.close();
        }
}