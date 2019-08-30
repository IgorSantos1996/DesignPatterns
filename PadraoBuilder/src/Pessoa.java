public class Pessoa {
    private String nome;
    private String ultimoNome;
    private String nomedoMeio;
    private String apelido;
    private String nomeDoPai;

    private Pessoa(String nome, String ultimoNome, String nomedoMeio, String apelido, String nomeDoPai) {
        this.nome = nome;
        this.ultimoNome = ultimoNome;
        this.nomedoMeio = nomedoMeio;
        this.apelido = apelido;
        this.nomeDoPai = nomeDoPai;
    }

    public Pessoa(){
    }
    public static class PessoaBuilder{
        private String nome;
        private String ultimoNome;
        private String nomedoMeio;
        private String apelido;
        private String nomeDoPai;
        public PessoaBuilder(String nome){
            nome = nome;
        }
        public PessoaBuilder nome(String nome){
            this.nome = nome;
            return this;
        }
        public PessoaBuilder ultimoNome(String ultimoNome){
            this.ultimoNome = ultimoNome;
            return this;
        }
        public PessoaBuilder nomedoMeio(String nomedoMeio){
            nomedoMeio = nomedoMeio;
            return this;
        }
        public PessoaBuilder apelido(String apelido){
            apelido = apelido;
            return this;
        }
        public PessoaBuilder nomeDoPai(String nomeDoPai){
            this.nomeDoPai = nomeDoPai;
            return this;
        }
        public Pessoa build(){
            return new Pessoa(nome, ultimoNome, nomedoMeio, apelido, nomeDoPai);
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getNomedoMeio() {
        return nomedoMeio;
    }

    public void setNomedoMeio(String nomedoMeio) {
        this.nomedoMeio = nomedoMeio;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getNomeDoPai() {
        return nomeDoPai;
    }

    public void setNomeDoPai(String nomeDoPai) {
        this.nomeDoPai = nomeDoPai;
    }
}
