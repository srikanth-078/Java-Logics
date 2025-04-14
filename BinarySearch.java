import java.util.Arrays;
public class BinarySearch{
  public static void main(String[] args){
    int arr[] = {1,3,5,7,8,12,16,20};
    //Binary search method searching 8 element on this array.
    int res = Arrays.binarySearch(arr, 8);
    //array must be sorted.
    System.out.println("8 Element founded at the index of: " +res);
    //Output:- 4

    //But But
    //when the miss match occures it gives a incompatible output.      /let's see!
    //search 9 element in the arr array.(not available).
    int incomOutput = Arrays.binarySearch(arr, 9);
    System.out.println("9 element founded at the index of: "+incomOutput);
    /*Output:- -6 😟
      becouse here a formula is applied when not founded case.  -(inserption point)-1=Output.
      Array    1  3  5  7  8  12  16  20
      Index    0  1  2  3  4  5    6   7
      Binary Seach Operation:- if searched element is greater than currect element move  to Right.
                               if searched element is less than currect element move to left.
                in above array binary search operation half the array and checks these cases okay.!
                when it half the array 7/2 = 3(takes absolute value).
                searched element is: 9
                3 is currect inserption.
                9 > 3 true move right
                index 3 and 7 calculated (7+(7-3))/2 = 5
                5 is currecr inserption 
                9 > 5 false
                9 < 5 true but not moves becouse it not matches so,
                now currect index(inserption) is 5
                place on that formula -(5)-1 = -6 is the output.
      */


    //in wronge case don't print like that negitive value.
    // Do this
    int ress = Arrays.binarySearch(arr, 9);
    //check the ress
    if(ress < 0)
      System.out.println("The Element 9 is not found.");
    else
      System.out.println("The Element 9 is founded at the index of " + ress);




    /* bonus Tip
    we will also search an array at specific range
    Syntax :-
                  Arrays.binarySearch(arr, FromIndex, ToIndex, Key);            */
  }
}
