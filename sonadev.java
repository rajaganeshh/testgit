
package oata;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class testsonadev {

   private sonadev h;
	
   @Before
   public void setUp() throws Exception 
   {
      h = new sonadev();
   }

   @Test
   public void testHelloEmpty() 
   {
      assertEquals(h.getName(),"");
      assertEquals(h.getMessage(),"Hello!");
   }
	
   @Test
   public void testHelloWorld() 
   {
      h.setName("World");
      assertEquals(h.getName(),"World");
      assertEquals(h.getMessage(),"Hello World!");
   }
}

/*public class sonadev {
  
public static void main(String[] args) {
  junit.textui.TestRunner.run (suite());
System.out.println("Hello World");
System.out.println("Sonata DevOps");
}

 public static junit.framework.Test suite() 
    {
       return new JUnit4TestAdapter(sonadev.class);
    }

}*/
