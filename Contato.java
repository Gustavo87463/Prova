public class Contato {

    private float codigo;
    private String nome;
    private int telefone;
    private String email;

    int vetor[];


    public float getCodigo() {
        return codigo;
    }
    public void setCodigo(float codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
    public Contato(){

    }

    public Contato(float codigo, String nome, int telefone, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    } 

    public void AdicionarContato(float codigo, String nome, int telefone, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        return;      
} 
    

    
}
