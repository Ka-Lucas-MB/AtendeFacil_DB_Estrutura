public class Usuario {
    
private Long id_usuario;
private String especialidade;
private String nome;
private String cpf;
private String registro;
private String senha;
private Perfil perfil; //Mapeamento da FK
private UnidadeDeSaude unidade;//Mapeamento da FK

//Construtor
public Usuario(Long id_usuario, String especialidade, String nome, String cpf, String registro, String senha,
        Perfil perfil, UnidadeDeSaude unidade) {
    this.id_usuario = id_usuario;
    this.especialidade = especialidade;
    this.nome = nome;
    this.cpf = cpf;
    this.registro = registro;
    this.senha = senha;
    this.perfil = perfil;
    this.unidade = unidade;
}

// Getters e Setters
public Long getId_usuario() {
    return id_usuario;
}


public void setId_usuario(Long id_usuario) {
    this.id_usuario = id_usuario;
}


public String getEspecialidade() {
    return especialidade;
}


public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
}


public String getNome() {
    return nome;
}


public void setNome(String nome) {
    this.nome = nome;
}


public String getCpf() {
    return cpf;
}


public void setCpf(String cpf) {
    this.cpf = cpf;
}


public String getRegistro() {
    return registro;
}


public void setRegistro(String registro) {
    this.registro = registro;
}


public String getSenha() {
    return senha;
}


public void setSenha(String senha) {
    this.senha = senha;
}


public Perfil getPerfil() {
    return perfil;
}


public void setPerfil(Perfil perfil) {
    this.perfil = perfil;
}


public UnidadeDeSaude getUnidade() {
    return unidade;
}


public void setUnidade(UnidadeDeSaude unidade) {
    this.unidade = unidade;
} 



}




