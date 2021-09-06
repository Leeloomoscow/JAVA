public class Main {
    public static void main(String[] args) {

        PerimeterSquare perimeterSquare = new PerimeterSquare();
        try {
            perimeterSquare.getPerimetr("g");
        } catch (PerimeterException e) {
            e.printStackTrace();
        }
    }
}
