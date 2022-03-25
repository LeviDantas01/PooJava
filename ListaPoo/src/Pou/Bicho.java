package Pou;

import java.util.Scanner;

/**
 *
 * @author Levi
 */
public class Bicho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        System.out.println("De um nome para seu Tamagushi: ");
        nome = sc.next();
        Tamagushi bicho = new Tamagushi(nome);
        bicho.alerarNome(nome);
        System.out.println("Vamos alimentar seu bicho informe uma quantidade de comida: ");
        int comida = sc.nextInt();
        bicho.comida(comida);
        System.out.println("Brique com seu bicho");
        int brincar = sc.nextInt();
        bicho.brincar(brincar);
        System.out.println("O nome do seu tamagusshi é: " + bicho.getNome());
        System.out.println(bicho.getNome() + " tem: " + bicho.getIdade()+" anos");
        System.out.println(bicho.getNome() + " Está com: " + bicho.getFome() + "% de fome");
        System.out.println(bicho.getNome() + "Está com: " + bicho.getTedio() + "% de tedio");
        System.out.println(bicho.humor());
    }
}
