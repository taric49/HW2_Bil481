import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    when(mq.size()).thenReturn(0);
    c = new Compute(mq);
    int result = c.countNumberOfOccurrences("");
    assertTrue(result == -1);
  }

  @Test
  public void test1() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(2);
    when(mq.contains("A")).thenReturn(true);
    when(mq.getAt(0)).thenReturn("A");
    when(mq.getAt(1)).thenReturn("B");
    int result = c.countNumberOfOccurrences("A");
    assertTrue(result == 1);
  }

  @Test
  public void test2() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(mq.size()).thenReturn(1);
    when(mq.contains("A")).thenReturn(false);
    int result = c.countNumberOfOccurrences("B");
    assertTrue(result == 0);
  }
}