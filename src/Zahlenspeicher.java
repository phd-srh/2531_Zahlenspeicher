public class Zahlenspeicher {
    private int[] array;
    private int kapazität;
    private int vorhandeneElemente;

    public Zahlenspeicher(int kapazität) {
        this.kapazität = kapazität;
        this.array = new int[ kapazität ];
        this.vorhandeneElemente = 0;
    }

    public boolean hinzufügen(int zahl) {
        // Überprüfung der Kapazität
        if (this.vorhandeneElemente >= this.kapazität ) {
            // Andere Strategie, wenn voll, dann Fehler
            //System.out.println("Array ist voll, geht nix mehr");
            return false; // <- Hinweise, dass die Zahl nicht hinzugefügt werden konnte

            // Array ist voll, wir brauchen mehr Platz
            kapazität *= 2;
            int[] neuesArray = new int[ kapazität ];
            for (int i=0; i < this.array.length; i++) {
                neuesArray[i] = this.array[i];
            }
            this.array = neuesArray; // Identitätsübertrag
        }

        this.array[ this.vorhandeneElemente ] = zahl;
        this.vorhandeneElemente++;
        return true;
    }

    public int anzahlElemente() {
        return this.vorhandeneElemente;
    }

    public String toString() {
        String ausgabe = "[";
        for (int i=0; i < this.vorhandeneElemente; i++) {
            if (i > 0) ausgabe += ", ";
            ausgabe += this.array[i];
        }
        ausgabe += "]";
        return ausgabe;
    }
}
