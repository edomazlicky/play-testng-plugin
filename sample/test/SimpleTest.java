import org.testng.annotations.*;
 
public class SimpleTest {
 
 @Test
 public void aFastTest() {
   System.out.println("Fast test");
 }
 
 @Test
 public void aFailingTest() {
    if(true) throw new RuntimeException("FAIL");
    System.out.println("failing test");
 }
 
}
