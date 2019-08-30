public class TestePessoa {
    public static void main(String[] args) {
        Pessoa p = new Pessoa.PessoaBuilder("Igor")
                .nomedoMeio("Terriaga")
                .ultimoNome("Santos")
                .apelido("Jiraya")
                .nomeDoPai("Junior").build();

    }
}
