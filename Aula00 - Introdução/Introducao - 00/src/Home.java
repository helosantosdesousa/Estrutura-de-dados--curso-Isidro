public class Home {
    public static void main(String[] args) {
        Television t1 = new Television(false);
        t1.turnOn();
        t1.setBrand("Samsung");
        t1.setChannel("4");
        t1.setChannel("5");
        t1.setVolume(15);
        t1.turnOff();
        
    }
}
