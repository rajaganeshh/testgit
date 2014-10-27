package oata;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

 class test {
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Sonata DevOps");
         String message = "Robert";	
         MessageUtil messageUtil = new MessageUtil(message);
   
   @Test
   public void testPrintMessage() {	
      System.out.println("Inside testPrintMessage()");     
      assertEquals(message,messageUtil.printMessage());
   }
    }
}
