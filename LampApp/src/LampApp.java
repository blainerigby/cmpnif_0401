public class LampApp {
    public static void main(String[] args) throws Exception {
        Lamp lamp1 = new Lamp();
        System.out.println(lamp1.gteIsOn());
        lamp1.toggleLamp();
        Lamp lamp2 = new Lamp();
        lamp2.toggleLamp();
        lamp2.toggleLamp();


    }
}
