public class PolicialCivil implements Pessoa {

    private String cpf;
    private String nome;
    private String patente;

    public PolicialCivil(String cpf, String nome, String patente) {
        this.cpf = cpf;
        this.nome = nome;
        this.patente = patente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirPolicialCivil(this);
    }
}
