public class Calc {

    private final int i;
    private final int j;

    public Calc(int i, int j) {
        this.i = i;
        this.j = j;
    }

    public Integer sumar() {
        return this.i + this.j;
    }

    public Integer restar() {
        return this.i - this.j;
    }

    public Integer multi() {
        return this.i * this.j;
    }

    public Integer divi() {
        return this.i / this.j;
    }

}
