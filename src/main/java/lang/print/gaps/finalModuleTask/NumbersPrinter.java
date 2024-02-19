package lang.print.gaps.finalModuleTask;


public class NumbersPrinter {
    public void printIsPositive(int number) {
    	
    	System.out.println(number>0);
    	
    	
    }
    
    public static void main(String[] args) {
    	NumbersPrinter numPrint =  new NumbersPrinter();
    	int number =-3;    	
    	numPrint.printIsPositive(number);    	    	
    }
    
}
