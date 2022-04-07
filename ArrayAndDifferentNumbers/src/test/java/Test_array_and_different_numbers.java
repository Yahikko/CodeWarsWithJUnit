import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Test_array_and_different_numbers {

  private static final double EPS = 1e-9;
  private static Array_and_different_numbers workClass;

  @Before
  public void createClass() {
    workClass = new Array_and_different_numbers();
  }

  @Test
  public void TestFindDifferentNumbers() {
    Assert.assertEquals(2, workClass.findDifferentNumbers
        (new Integer[]{1, 1, 2, 4}, new Integer[]{1, 1}), EPS);
    Assert.assertEquals(3, workClass.findDifferentNumbers
        (new Integer[]{7, 4, 5, 1, 9}, new Integer[]{1, 2, 3, 4, 5, 6}), EPS);
    Assert.assertEquals(1, workClass.findDifferentNumbers
        (new Integer[]{0, 6, -5}, new Integer[]{0, 1, -5}), EPS);
  }
}