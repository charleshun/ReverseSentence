import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class prgTest {
    @Test
    public void test1() {
      assertEquals("olleh", prg.reverse("hello"));
    }
      
      @Test
    public void test2() {
      assertEquals("dlrow", prg.reverse("world"));
    }
      
      @Test
    public void test3() {
      assertEquals("a", prg.reverse("a"));
    }
      
      @Test
    public void test4() {
          System.out.println("An empty string should return an empty string.");
      assertEquals("", prg.reverse(""));
    }
  }

