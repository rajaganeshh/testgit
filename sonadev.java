
package oata;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import junit.framework.JUnit4TestAdapter;

@RunWith(Suite.class)
@Suite.SuiteClasses({
   TestHelloWorld.class  // Add test classes here.
})

public class sonadev {
  
public static void main(String[] args) {
  junit.textui.TestRunner.run (suite());
System.out.println("Hello World");
System.out.println("Sonata DevOps");
}

 public static junit.framework.Test suite() 
    {
       return new JUnit4TestAdapter(sonadev.class);
    }

}
