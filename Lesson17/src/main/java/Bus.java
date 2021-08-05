public class Bus {

    public String model, color;
    public Engine engine;
    public Transmission transmission;
    public final String SERIAL_NUMBER = "D23HA6";
    public final String SERIAL_NUMBER_2 = "D23HA6";

    public void go(){
        System.out.println("Go");

    }
public void showKm(String km2){
        km2 = km2 + 2;
    System.out.println(km2);
}
}
