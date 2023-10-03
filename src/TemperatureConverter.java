public class TemperatureConverter {
    public float celsius;
    public float fahrenheit;

    public void toCelsius(int F) {
        fahrenheit = F;
        celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println(fahrenheit + "°F is: " + celsius + "°C");
    }

    public void toFahrenheit(int C) {
        celsius = C;
        fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(celsius + "°C is: "+ fahrenheit + "°F");
    }

}
