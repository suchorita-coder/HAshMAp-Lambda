package LambdaExpression;

public class LamdaThird {
	  public static void main(String[] args) {
		  
	    IMyFunc myFactorialFunc = (num) -> {
	      int fact = 1;
	      for(int i = 1; i <= num; i++){
	        fact = i * fact;
	      }
	      return fact;
	    };
	    System.out.println("Factorial of 7 is " + myFactorialFunc.getValue(7));
	  }
	}