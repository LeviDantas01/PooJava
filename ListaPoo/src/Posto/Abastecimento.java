package Posto;

import java.util.Scanner;

/**
 *
 * @author Levi
 */
public class Abastecimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual combustivel: ");
        String combustivel = sc.next();
        System.out.println("Informe uma a quantidade que deseja abastecer: ");
        double abastecer = sc.nextDouble();
        BombaCombustivel c1 = new BombaCombustivel(combustivel, abastecer);
        System.out.println("Abastecido " + c1.abastecePorValor()+ "L de " + combustivel);
        double restaNabomba = c1.getQuantidadeCombusitvel() - abastecer;
        System.out.println("Resta na bomba " + restaNabomba);
        System.out.println("----------------------------------------------------------");
        
        System.out.println("Qual combustivel: ");
        combustivel = sc.next();
        System.out.println("Quanto vai pagar: ");
        abastecer = sc.nextDouble();
        BombaCombustivel c2 = new BombaCombustivel(combustivel, abastecer);
        System.out.println("Abastecido R$" + c2.abastecePorLitro()+ " de "+ combustivel);
        restaNabomba = c2.getQuantidadeCombusitvel() - abastecer;
        System.out.println(restaNabomba);
        System.out.println("Alerando combusitvel");
        System.out.println("Qual combustivel vc dejeseja trocar: ");
        String alteraComb = sc.next();
        c2.alteraCombustivel(alteraComb);
        System.out.println("Combusitvel alterado para " + alteraComb);
        System.out.println("----------------------------------------------------------");
        
        System.out.println("Qual o novo valor: ");
        double novoValor = sc.nextDouble();
        BombaCombustivel alteraValor = new BombaCombustivel(novoValor);
        System.out.println("Valor do combustivel alterado para R$" + alteraValor.alteraValor());
        
        System.out.println("----------------------------------------------------------");
        System.out.println("Vai reabasecer a bomba com quantos litros: ");
        double absteceBomba = sc.nextDouble();
        BombaCombustivel abasteceBomba = new BombaCombustivel();
        System.out.println(abasteceBomba.alteraQuantidadeCombustivel(absteceBomba));
        
    }
}
