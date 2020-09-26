
public class Paivays {

    private int paiva;
    private int kuukausi;
    private int vuosi;

    public Paivays(int paiva, int kuukausi, int vuosi) {
        this.paiva = paiva;
        this.kuukausi = kuukausi;
        this.vuosi = vuosi;
    }

    public int getPaiva() {
        return this.paiva;
    }

    public int getKuukausi() {
        return this.kuukausi;
    }

    public int getVuosi() {
        return this.vuosi;
    }

    public boolean equals(Object verrattava) {
        
        if (this == verrattava) {
            return true;
        }

        
        if (!(verrattava instanceof Paivays)) {
            return false;
        }

        
        Paivays verrattavaPaivays = (Paivays) verrattava;

        
        if (this.paiva == verrattavaPaivays.paiva
                && this.kuukausi == verrattavaPaivays.kuukausi
                && this.vuosi == verrattavaPaivays.vuosi) {
            return true;
        }

        
        return false;
    }

    @Override
    public String toString() {
        return this.paiva + "." + this.kuukausi + "." + this.vuosi;
    }
}
