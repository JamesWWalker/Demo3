import org.junit.jupiter.api.*;

import demo.*;

public class Tests {

  @Test
  public void Test14() {
    System.out.println("This test should be run");
    TestMe testee = new TestMe();
    Assertions.assertEquals(testee.return14(), 14);
  }

  // This test should fail, causing the build to fail  
  @Test
  public void Test13() {
    TestMe testee = new TestMe();
    Assertions.assertEquals(testee.return13(), 13);
  }

}
