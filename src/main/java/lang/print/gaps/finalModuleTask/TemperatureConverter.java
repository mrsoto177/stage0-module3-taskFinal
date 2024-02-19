package lang.print.gaps.finalModuleTask;

public class TemperatureConverter {
    public void toFahrenheit(int temperatureCelsius){    	
    	int farenheit = 32;
    	System.out.println(1.8*temperatureCelsius+farenheit);
    }
    
    public static void main(String[] args) {
    	TemperatureConverter tempConv = new TemperatureConverter();
    	int temperatureCelsius = 20;
    	tempConv.toFahrenheit(temperatureCelsius);
    }
}
