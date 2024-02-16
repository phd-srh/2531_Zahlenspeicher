public class Zahlenspeicher {
    private int[] array;
    private int kapazität;
    private int vorhandeneElemente;

    public Zahlenspeicher(int kapazität) {
        this.kapazität = kapazität;
        this.array = new int[ kapazität ];
        this.vorhandeneElemente = 0;
    }
}
