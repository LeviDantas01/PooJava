package Posto;
/**
 *
 * @author Levi
 */
public final class BombaCombustivel {
    private String tipoCombustivel;
    private double valorLitro;
    private double quantidadeCombusitvel = 1000;
    private double qntidadeAbastecer;

    public BombaCombustivel(String tipoCombustivel, double qntidadeAbastecer) {
        this.tipoCombustivel = tipoCombustivel;
        this.qntidadeAbastecer = qntidadeAbastecer;
        this.valorLitro = 6.10;
    }

    public BombaCombustivel(double valorLitro) {
        this.valorLitro = valorLitro;
    }
    public BombaCombustivel(){
       
    }
    
    public double abastecePorValor(){
        return this.getQntidadeAbastecer() / this.valorLitro;
    }
    public double abastecePorLitro(){
        return this.getQntidadeAbastecer() * this.valorLitro ;
    }
    public double alteraValor(){
        return valorLitro;
    }
    public String alteraCombustivel(String novoCombustivel){
        return this.tipoCombustivel;
    }
    public double alteraQuantidadeCombustivel(double novaQuantidade){
        this.quantidadeCombusitvel += novaQuantidade;
        return this.quantidadeCombusitvel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public double getQuantidadeCombusitvel() {
        return quantidadeCombusitvel;
    }

    public void setQuantidadeCombusitvel(double quantidadeCombusitvel) {
        this.quantidadeCombusitvel = quantidadeCombusitvel;
    }

    public double getQntidadeAbastecer() {
        return qntidadeAbastecer;
    }

    public void setQntidadeAbastecer(double qntidadeAbastecer) {
        this.qntidadeAbastecer = qntidadeAbastecer;
    }
    
}
