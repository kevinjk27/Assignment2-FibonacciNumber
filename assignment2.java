import java.util.Scanner;
public class assignment2 {
	    public static void main(String[] args) {
	    
	    	//determining what is the number to be printed by asking user input
	    	Scanner input = new Scanner(System.in);	    	
	    	System.out.print("Enter an integer: ");  
	    	int count = input.nextInt();
	    	
	    	//logic to ensure the user is not inputting number less than 0
	    	if (count > 0) {
    			int a = 0;
    			int b = 1;
    			int sum;
	    		for (int i = 0; i < count; ++i) {
	    			sum=a+b;
	    			a=b;
	    			b=sum;
	    		}   
	    		System.out.println("The fibonacci value for " + count +" is "+ a);
	    	}
	    	
	    	//when the user inputs number less than 0, it will display this message
	    	else{
	    		System.out.println("Please input an integer bigger than 0");
	    		}
	    }
	}
