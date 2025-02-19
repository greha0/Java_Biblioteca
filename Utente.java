public class Utente {
    private String nome;
    private int numeroTessera;
    static private int cont;

    public Utente(String nome){
        this.nome = nome;
        cont++;
        numeroTessera = cont;
    }

    public String getNome(){
        return nome;
    }

    public int getNumeroTessera(){
        return numeroTessera;
    }

    public boolean equals(Utente utente){
        if(this.numeroTessera != utente.numeroTessera){
            return false;
        }
        if (this.nome.equals(utente.nome)){
            return true;
        }
        return false;
    }
}
