package JUnit;

import org.junit.Test;
import static org.junit.Assert.*;



public class JUnitExample 
{
   @Test
   public void testAdd()
   {
      int num = 5;
      String temp = null;
      String str = "Junit is working";

      
      assertEquals("Junit is working", str);
      
      assertFalse(num > 6);

    
      assertNotNull(str);
   }
}