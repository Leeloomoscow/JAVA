import java.lang.reflect.MalformedParametersException;

public class Main {
    public static void main(String[] args) {

        Body body = new Body();

        SmailHead smailHead = new SmailHead();
        MediumHead mediumHead = new MediumHead();
        BigHead bigHead = new BigHead();
        Leg leg = new Leg();

        Robot <SmailHead> robot = new Robot <SmailHead>(body, smailHead); //Создание конкретного робота с маленькой головой, параметр smailhead передается в Robot и записывается в <T>
        Robot <BigHead> robot1 = new Robot<BigHead>(body, bigHead);

        Robot robot2 = new Robot(body,mediumHead);

    }

}
