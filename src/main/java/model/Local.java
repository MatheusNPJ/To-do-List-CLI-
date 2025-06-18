package model;

// Classe abstrata
public abstract class Local extends Dia {
    
    protected String local;

    public Local(int dia, String local) {
        super(dia);
        this.local = local;
    }

    // 🔸 Método concreto (tem implementação)
    public void exibirLocal() {
        System.out.println(local);
    }

    // 🔸 Get e Set (são métodos concretos SIM)
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public abstract void tipoLocal();

  
}