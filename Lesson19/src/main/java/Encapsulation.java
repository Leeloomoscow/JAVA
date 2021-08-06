public class Encapsulation {
    private int a, b;

    public int showResult (){
        return a + b;
    }

    public int getA() { // метод getter и setter
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getMeA(){
        return a;
    }
}
