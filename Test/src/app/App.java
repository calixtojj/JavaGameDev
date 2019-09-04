package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String nome,idade,peso,cidade,estado,pais;
        System.out.println("Digite seu nome: ");
        nome = in.nextLine();
        System.out.println("Digite sua idade: ");
        idade = in.nextLine();
        System.out.println("Digite seu peso: ");
        peso = in.nextLine();
        System.out.println("Digite sua cidade: ");
        cidade = in.nextLine();
        System.out.println("Digite seu país: ");
        pais = in.nextLine();
        //Resultado final
        System.out.println("Aqui está o resultado final");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Peso: "+peso);
        System.out.println("Cidade: "+cidade);
        System.out.println("País: "+pais);
        }
}