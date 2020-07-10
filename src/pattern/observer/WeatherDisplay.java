package pattern.observer;

public class WeatherDisplay implements Observer {
    private String broadcast;
    private float temperature;
    private float humidity;

    public WeatherDisplay(String broadcast) {
        this.broadcast = broadcast;
    }

    public void display() {
        System.out.println("[" + broadcast + "] Current weather: " + this.temperature + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.display();
    }
}
