public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("25647864", "cavolone", 1, true);
        Libro libro1 = new Libro("25647264", "cavolo", 1, true);
        Utente utente = new Utente("Greta");
        Utente utente1 = new Utente("Maria");
        if(utente.equals(utente1)){
            System.out.println("sono uguali");
        }
    }
}
