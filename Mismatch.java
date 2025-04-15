import java.util.Arrays;

public class Mismatch{
  public static void main(String[] args){
    int arr[] = {1,2,3,4,5,6,7};
    int arr2[] = {1,2,3,40,5,6,7};
    //cheking where is mismatch above the two arrays.
    System.out.println(Arrays.mismatch(arr, arr2));
    /*Output:- 3
      It checks by Index values. 
      mismatch occured at the index of 3. */
  }
}
