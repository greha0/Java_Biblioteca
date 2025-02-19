public class Libro {
    private String codiceLibro;
    private String titolo;
    private int tipo; // 1 - Romanzo
                      // 2 - Saggio
                      // 3 - Giallo
    private boolean stato; // true - disponibile
                           // false - in prestito
    private Utente [] codaRichieste;

    public Libro (String codiceLibro, String titolo, int tipo, boolean stato){
        this.codiceLibro = codiceLibro;
        this.titolo = titolo;
        this.tipo = tipo;
        this.stato = stato;
        codaRichieste = new Utente[100];
    }

    // Metodi getter
    public String getCodiceLibro(){
        return codiceLibro;
    }

    public String titolo(){
        return titolo();
    }

    public int getTipo(){
        return tipo;
    }

    public boolean getStato(){
        return stato;
    }

    // Metodi setter
    public void setCodiceLibro(String codiceLibro){
        this.codiceLibro = codiceLibro;
    }

    public void setTitolo(String titolo){
        this.titolo = titolo;
    }

    public void setTipo(int tipo){
        this.tipo = tipo;
    }

    public void setStato(boolean stato){
        this.stato = stato;
    }

    public void addRichiesta(Utente utente){
        for (int i = 0; i < codaRichieste.length; i++){
            if (codaRichieste[i] == null){
                codaRichieste[i] = utente;
                return;
            }
        }
    }

    public void removeRichiesta(Utente utente){
        for (int i = 0; i < codaRichieste.length; i++){
            if (codaRichieste[i].equals(utente)){
                codaRichieste[i] = null;
                return;
            }
        }
    }

}
