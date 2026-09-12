public class UnidadeDeSaude {
    private Long id_unisaude;
    private String nome;
    private String cep;
    private String rua;
    private String bairro;
    private String cidade;
    private String telefone;
    
    private String telefone2;
    private String sala;
    private String sala2;
    

    //Construtor
    public UnidadeDeSaude(Long id_unisaude, String nome, String cep, String rua, String bairro, String cidade,
            String telefone, String telefone2, String sala, String sala2) {
        this.id_unisaude = id_unisaude;
        this.nome = nome;
        this.cep = cep;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.telefone = telefone;
        this.telefone2 = telefone2;
        this.sala = sala;
        this.sala2 = sala2;
    }


    // Getters e Setters
    public Long getId_unisaude() {
        return id_unisaude;
    }

    public void setId_unisaude(Long id_unisaude) {
        this.id_unisaude = id_unisaude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(String telefone2) {
        this.telefone2 = telefone2;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getSala2() {
        return sala2;
    }

    public void setSala2(String sala2) {
        this.sala2 = sala2;
    }
    


}
