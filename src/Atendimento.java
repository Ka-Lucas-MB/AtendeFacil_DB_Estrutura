public class Atendimento {
    private Integer id_atendimento;
    private String horarioInicio;
    private String horarioFim;
    private String senha;
    private String classificacao;
    private String statusAtendimento;
    private Paciente paciente; //Mapeamento da FK
    private Usuario usuario; //Mapeamento da FK
    private Guiche guiche; //Mapeamento da FK


    //Construtor
    public Atendimento(Integer id_atendimento, String horarioInicio, String horarioFim, String senha,
            String classificacao, String statusAtendimento, Paciente paciente, Usuario usuario, Guiche guiche) {
        this.id_atendimento = id_atendimento;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.senha = senha;
        this.classificacao = classificacao;
        this.statusAtendimento = statusAtendimento;
        this.paciente = paciente;
        this.usuario = usuario;
        this.guiche = guiche;

    }
    
    // Getters e Setters
    public Integer getId_atendimento() {
        return id_atendimento;
    }

    public void setId_atendimento(Integer id_atendimento) {
        this.id_atendimento = id_atendimento;
    }

    public String getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(String horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public String getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(String horarioFim) {
        this.horarioFim = horarioFim;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getStatusAtendimento() {
        return statusAtendimento;
    }

    public void setStatusAtendimento(String statusAtendimento) {
        this.statusAtendimento = statusAtendimento;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Guiche getGuiche() {
        return guiche;
    }

    public void setGuiche(Guiche guiche) {
        this.guiche = guiche;
    }

    
}
