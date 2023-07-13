public class Calculadora {

    private int a, b;

    public Calculadora(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int soma() {
        return this.a + this.b;
    }

    public int subtrai() {
        return this.a - this.b;
    }

    public int multiplica() {
        return this.a * this.b;
    }

    public int divide() {
        return this.a / this.b;
    }

}
