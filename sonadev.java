import org.junit.Test;
import static org.junit.Assert.assertEquals;


package oata;


//class sonadev {
  
/*public static void main(String[] args) {
//System.out.println("Hello World");
System.out.println("Sonata DevOps");
}*/

public class sonadev {
	
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil.printMessage());
   }
}
}
