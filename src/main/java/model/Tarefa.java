package model;

public class Tarefa extends Local{

    //Atributos da classe filha
    protected String titulo;
    protected String descricao;
    protected boolean status;

    //Construtor da classe tarefa herdando a super
    public Tarefa(int dia, String local, String titulo, String descricao, boolean status) {
        super(dia, local);
        this.titulo =  titulo;
        this.descricao = descricao;
        this.status = false;
    }

    //Set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //Get
    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean getStatus() {
        return status;
    }

    public void MarcarComoConcluida()
    {
        status = true;
    }

        // Implementação do método abstrato
    @Override
    public void tipoLocal() {
        System.out.println("Local: " + getLocal());
    }

    @Override
    public String toString(){
        return "\n\nDia: " + getDia() + 
           "\nTítulo: " + getTitulo() + 
           "\nDescrição: " + getDescricao() + 
           "\nStatus: " + getStatus() + 
           "\nLocal: " + getLocal();
    }
}
