public class Paciente {
    
    private Integer id_paciente;
    private String nome;
    private String dt_nascimento;
    private String cpf;
    private String idade;
    private String motivo;
    
    //Construtor
    public Paciente(Integer id_paciente, String nome, String dt_nascimento, String cpf, String idade, String motivo) {
        this.id_paciente = id_paciente;
        this.nome = nome;
        this.dt_nascimento = dt_nascimento;
        this.cpf = cpf;
        this.idade = idade;
        this.motivo = motivo;
    }

    // Getters e Setters
    public Integer getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Integer id_paciente) {
        this.id_paciente = id_paciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDt_nascimento() {
        return dt_nascimento;
    }

    public void setDt_nascimento(String dt_nascimento) {
        this.dt_nascimento = dt_nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    
}
