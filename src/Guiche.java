public class Guiche {
    private Integer id_guiche;
    private String numero;
    private String tipo;
    private String status;

    //Construtor
    public Guiche(Integer id_guiche, String numero, String tipo, String status) {
        this.id_guiche = id_guiche;
        this.numero = numero;
        this.tipo = tipo;
        this.status = status;
    }

    // Getters e Setters
    public Integer getId_guiche() {
        return id_guiche;
    }


    public void setId_guiche(Integer id_guiche) {
        this.id_guiche = id_guiche;
    }


    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }

    
}
