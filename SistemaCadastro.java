import java.util.HashMap;
import java.util.Map;

public class SistemaCadastro {
    private Map<String, Usuario> usuarios;

    public SistemaCadastro() {
        this.usuarios = new HashMap<>();
    }

    public void cadastrarUsuario(String nome, String cpf, String email, String celular) {
        Usuario usuario = new Usuario(nome, cpf, email, celular);
        usuarios.put(cpf, usuario);
    }

    public Usuario buscarPorCPF(String cpf) {
        return usuarios.get(cpf);
    }
}

