package testngtest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("this is f method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is before method");
  }

}
