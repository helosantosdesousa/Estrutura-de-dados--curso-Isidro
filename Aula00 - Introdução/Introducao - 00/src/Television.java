public class Television {
    String brand;
    int volume;
    String channel;
    boolean status;

    public Television(boolean status) {
        this.status = status;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    public void turnOn(){
        this.status = true;
    }
    public void turnOff(){
        this.status = false;
    }
}
