import java.util.List;
import java.util.Scanner;

public class Array_and_different_numbers {

  public Integer findDifferentNumbers(Integer[] array1,
      Integer[] array2) {
    int count = 0;
    if (array2.length > array1.length) {
      List<Integer> list = List.of(array1);
      for (int i = 0; i < array2.length; i++) {
        if (!list.contains(array2[i])) {
          count++;
        }
      }
    } else {
      List<Integer> list = List.of(array2);
      for (int i = 0; i < array1.length; i++) {
        if (!list.contains(array1[i])) {
          count++;
        }
      }
    }
    System.out.println("Count of different numbers in the array"
        + count);
    return count;
  }

  public Integer[] readValues() {
    int size = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Specify the size of the array: ");
    size = input.nextInt();
    Integer[] array = new Integer[size];
    System.out.println("List the elements of the array: ");
    for (int i = 0; i < size; i++) {
      array[i] = input.nextInt();
    }
    return array;
  }

  public static void main(String[] args) {
    Array_and_different_numbers myClass =
        new Array_and_different_numbers();
    Integer[] arrayA = myClass.readValues();
    Integer[] arrayB = myClass.readValues();
    myClass.findDifferentNumbers(arrayA, arrayB);
  }
}