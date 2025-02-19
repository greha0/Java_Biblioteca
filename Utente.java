public class Utente {
    private String nome;
    private int numeroTessera;
    static private int cont = 0;

    public Utente(String nome){
        this.nome = nome;
        numeroTessera = cont;
    }

    public String getNome(){
        return nome;
    }

    public int getNumeroTessera(){
        return numeroTessera;
    }
}
