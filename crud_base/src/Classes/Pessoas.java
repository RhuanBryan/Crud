package Classes;
/**
 *
 * @author r.gomes
 */
public class Pessoas {
    private String nome;
    private int idade;
    private String cpf;
    
    public Pessoas(){
        
    }
    
    public Pessoas(String nome, int idade, String cpf){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }
    
    public String MostrarDados(){
        return "Nome: " + getNome() + ", Idade: " + getIdade() + ", CPF: " + getCpf();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
