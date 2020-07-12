package pattern.observer;

public class WeatherStation {
    private WeatherDisplay displayA;
    private WeatherDisplay displayB;
    private WeatherDisplay displayC;
    private WeatherData weatherData;

    public WeatherStation() {
        this.displayA = new WeatherDisplay("A 방송국");
        this.displayB = new WeatherDisplay("B 방송국");
        this.displayC = new WeatherDisplay("C 방송국");

        this.weatherData = new WeatherData(); // 기상청
        this.weatherData.registerObserver(displayA);
        this.weatherData.registerObserver(displayB);
        // C는 등록 안함
    }

    public WeatherData getWeatherData() {
        return weatherData;
    }

    public void removeB() {
        weatherData.removeObserver(displayB);
    }

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        station.getWeatherData().setMeasurements(80, 65, 30.4f); // A, B 방송국에 알림
        System.out.println("---------------------------------------");
        station.removeB(); // B 방속국 삭제
        station.getWeatherData().setMeasurements(90, 55, 32.4f); // A 방송국에 알림
    }
}