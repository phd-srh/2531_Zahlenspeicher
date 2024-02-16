public class Main {
    public static void main(String[] args) {
        Zahlenspeicher speicher = new Zahlenspeicher(1000);

        speicher.hinzufügen( 13 );
        speicher.hinzufügen( 29 );
        speicher.hinzufügen( 7 );

        System.out.println( speicher );
        // Ausgabe: [ 13, 29, 7 ]

        speicher.löscheLetzteZahl();
        System.out.println( speicher );
        // Ausgabe: [ 13, 29 ]

        if ( speicher.suchen(13) ) {
            System.out.println("Zahl gefunden");
        }

        System.out.println( speicher.anzahlElemente() );
    }
}
