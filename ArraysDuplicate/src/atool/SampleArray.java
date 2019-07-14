package atool;



import static org.junit.Assert.assertArrayEquals;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class SampleArray {

  private Integer[] removeDuplicates(Integer[] input) {
    if (input == null || input.length <= 0) {
      return input;
    }

    Set<Integer> aSet = new HashSet<>(input.length);

    // set will reject all duplicates
    for (int i : input) {
      aSet.add(i);
    }

    return aSet.toArray(new Integer[aSet.size()]);
  }

  @Test
  public void testArrayWithDuplicates() {
    Integer[] given = new Integer[] { 1, 2, 3, 3 };
    Integer[] actual = removeDuplicates(given);
    Integer[] expected = new Integer[] { 1, 2, 3 };
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testArrayWithoutDuplicates() {
    Integer[] given = new Integer[] { 1, 2, 3 };
    Integer[] actual = removeDuplicates(given);
    Integer[] expected = new Integer[] { 1, 2, 3 };
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testWithEmptyArray() {
    Integer[] given = new Integer[] {};
    Integer[] actual = removeDuplicates(given);
    Integer[] expected = new Integer[] {};
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testWithNull() {
    Integer[] given = null;
    Integer[] actual = removeDuplicates(given);
    Integer[] expected = null;
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testArrayWithAllDuplicates() {
    Integer[] given = new Integer[] { 3, 3, 3 };
    Integer[] actual = removeDuplicates(given);
    Integer[] expected = new Integer[] { 3 };
    assertArrayEquals(expected, actual);
  }

  @Test
  public void testArrayWithMultipleDuplicates() {
    Integer[] given = new Integer[] { 1, 2, 3, 3, 4, 4, 5, 5, 5 };
    Integer[] actual = removeDuplicates(given);
    Integer[] expected = new Integer[] { 1, 2, 3, 4, 5 };
    assertArrayEquals(expected, actual);
  }

}

