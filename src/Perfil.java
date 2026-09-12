public class Perfil {
    private Long id_perfil;
    private String nome;
    private String descricao;

    //Construtor
    public Perfil(Long id_perfil, String nome, String descricao) {
        this.id_perfil = id_perfil;
        this.nome = nome;
        this.descricao = descricao;
    }

    // Getters e Setters
    public Long getId() {
        return id_perfil;
    }


    public void setId(Long id_perfil) {
        this.id_perfil = id_perfil;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getDescricao() {
        return descricao;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}

    
