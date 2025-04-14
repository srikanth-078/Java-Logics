public class FillArrrayWithStream {
    
    public static void main(String[] args){
        //Create an int array with numbers from 1 (inclusive) to 8 (exclusive): [11, 12]
        //using streams
        int a[] = java.util.stream.IntStream.range(1,8).toArray();
        //Printing with for each loop
        for(int i: a)
        System.out.println(i);
        //Output:- 1,2,3,4,5,6,7

        //Another one with from and to are inclusive
        //using rangeClosed method
        int b[] = java.util.stream.IntStream.rangeClosed(1,8).toArray();
        for(int i: b)
        System.out.println(i);
        //Output:- 1,2,3,4,5,6,7,8
    }
}
