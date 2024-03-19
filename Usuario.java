public class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private String celular;

    public Usuario(String nome, String cpf, String email, String celular) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.celular = celular;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", CPF: " + cpf + ", Email: " + email + ", Celular: " + celular;
    }
}
