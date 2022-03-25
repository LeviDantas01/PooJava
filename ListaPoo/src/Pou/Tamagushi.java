package Pou;

/**
 *
 * @author Levi
 */
public final class Tamagushi {
    private String nome;
    private int fome = 30;
    private int tedio = 30;
    private int idade = 0;
    
    public Tamagushi(String deNome){
        this.setNome(deNome);
        this.getIdade();
        this.getTedio();
        this.getFome();
                
    }
    
    public String alerarNome(String novoNome){
        return nome;
    }
    public int fome(){
        return this.getFome();
    }
    public int tedio(){
        return this.getTedio();
    }
    public void brincar(int tempoBrincar){
        if(tempoBrincar >= 10){
            this.setTedio(tempoBrincar);
        }
        else if(tempoBrincar >= 40){
            this.setTedio(tempoBrincar);
        }
        else{
            this.setTedio(tempoBrincar);
        }
    }
    public void comida(int alimentar){
        if(alimentar > 10){
           this.setFome(alimentar);
           
        }
        else if(alimentar > 40){
            this.setFome(alimentar);
        }
        else{
            this.setFome(alimentar);
        }
    }
    public String humor(){
        if((this.getFome()+this.getTedio()) / 2 <= 40  ){
            return this.getNome() + "Seu tamagushi está com humor normal";
        }
        else if((this.getFome()+this.getTedio()) / 2  < 60){
            return this.getNome() + "Seu tamagushi está bem humrado";
        }
        else if((this.getFome()+this.getTedio()) / 2  > 60){
            return this.getNome() + "Seu tamagushi está super feliz";
        }
        else{
            return this.getNome() + "Seu tamagushi está super entediado";
        }
    }
    public int idade(int novaIdade){
        return novaIdade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getTedio() {
        return tedio;
    }

    public void setTedio(int tedio) {
        this.tedio = tedio;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
