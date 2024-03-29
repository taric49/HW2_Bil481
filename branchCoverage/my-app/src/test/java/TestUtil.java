import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() {
    c = new Util();
  }

  @Test
  public void test0() {
    assertFalse(c.compute(1));
  }

  @Test
  public void test1() {
    assertFalse(c.compute(1, 2));
  }

  @Test
  public void test2() {
    assertTrue(c.compute(2, 4, 6));
  }

  @Test
  public void test3() {
    assertFalse(c.compute(11, 5, 7));
  }

  @Test(expected = RuntimeException.class)
  public void test4() {
    assertFalse(c.compute(0, 4, 6));
  }
}