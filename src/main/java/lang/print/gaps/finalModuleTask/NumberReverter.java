package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
    	 int numeroAlReves = Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString());
    	 System.out.println(numeroAlReves);
    }
    
    public static void main(String[] args) {
    	NumberReverter numbRev = new NumberReverter();
    	int number = 984;
    	numbRev.revert(number);
    }
}
