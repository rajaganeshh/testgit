import java.io.File;

import junit.framework.*;
import junit.extensions.*;

public class ThingTester extends TestCase
{
	public ThingTester (String name) 
	{
		super (name);
	}
	
	public static void main(String[] args) 
	{
		junit.textui.TestRunner.run(ThingTester.class);
	}

	public void testGetName() throws Exception 
	{
	    File myFile = new File("d:\testjunit.txt");
	    assertEquals("testjunit.txt", myFile.getName());
	}
}
