package pCarro;

/**
 *
 * @author Levi
 */
public class Carro {
   private final double consumo;
   private double combustivel = 0;
   
   public Carro(double consumo){
       this.consumo = consumo;
       
   }
   
   public double andar(double kmPer){
       double gasto = kmPer / this.consumo ;
       this.combustivel -= kmPer;
       System.out.println(gasto);
       return this.combustivel;
   }
   public double gasolina(){
       return this.combustivel;
   }
   public double abastecer(double abas){
       return this.combustivel += abas;
   }
}
