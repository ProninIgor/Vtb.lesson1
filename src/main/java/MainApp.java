import ru.vtb.learning.lesson1v2.*;

public class MainApp {
    public static void main(String[] args) throws Exception {
        Person person = new Person("Иван");
        Transport skateboard = new Skateboard();
        Transport motorcycle = new Motorcycle();
        Transport car = new Car();

        person.Ride(skateboard);
        person.Stop();
        person.Ride(motorcycle);
        person.Stop();
        person.Ride(car);
        person.Stop();
    }
}
