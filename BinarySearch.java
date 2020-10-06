import java.util.*;
public class Search{
  private static final int size = 20;
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int number  = scan.nextInt();
    int[] array = new int[size];
    makeArray(array,20);
    int position = search(array,number,0,array.length -1,0);
    System.out.println(position < 0 ? "false" : position);
    scan.close();
  }

  public static int search(int[] array, int number, int start, int end, int mid){
    while(start <= end){
      mid = (start + end) / 2;
      if(array[mid] == number)
        return mid;
      else if(array[mid] < number)
        start = mid + 1;
      else
        end = mid - 1;
    }
    return -1;
  }

  private static void makeArray(int[] array, int size){
    Random rand = new Random();
    array[0] = rand.nextInt(10);
    for(int i = 1; i < size; i++)
      do
        array[i] = rand.nextInt(500);
      while (array[i] < array[i-1]);
  }

}
