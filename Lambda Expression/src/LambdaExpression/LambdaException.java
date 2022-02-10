package LambdaExpression;

public class LambdaException {
	
  public static void main(String[] args){
	  
	    IFuncInt funcInt = (num1, num2) -> {
	      int result = num1 +  num2;
	      throw new Exception();      
	    };
	    try {
	      System.out.println("" + funcInt.func(6, 7));
	    } catch (Exception e) {

      e.printStackTrace();
    }
  }

}
