public class Pessoa {
    private int id;
    private String nome;

    public Pessoa(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna os dados básicos da pessoa (id e nome).
     * As subclasses sobrescrevem este método para acrescentar seus próprios dados.
     *
     * @return texto com id e nome
     */
    public String mostraDados(){
        return "ID: " + id + " | Nome: " + nome;
    }
}
