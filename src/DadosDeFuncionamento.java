public class DadosDeFuncionamento {
    private Integer id_dadosfunc;
    private String dados_processados;
    private Atendimento atendimento; //Mapeamento da FK
    
    //Construtor
    public DadosDeFuncionamento(Integer id_dadosfunc, String dados_processados, Atendimento atendimento) {
        this.id_dadosfunc = id_dadosfunc;
        this.dados_processados = dados_processados;
        this.atendimento = atendimento;
    }

    // Getters e Setters
    public Integer getId_dadosfunc() {
        return id_dadosfunc;
    }

    public void setId_dadosfunc(Integer id_dadosfunc) {
        this.id_dadosfunc = id_dadosfunc;
    }

    public String getDados_processados() {
        return dados_processados;
    }

    public void setDados_processados(String dados_processados) {
        this.dados_processados = dados_processados;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }

    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    
}
