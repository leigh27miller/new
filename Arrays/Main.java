import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Array elements must be the same 
        int[] intArr = new int[3]; //this creates a new array in memory. this is the best syntax 
        int[] intArr2= {1,2,3}; //this also creates a new array
        int intArr3[]; //this defines an array
        int []intArr4; //this defines an array too...but it's bad

        //2-D array uses double brackets(these are all 2D arrays below)
        //pay attention to the double brackets. this is how you make them 2D 

        int[][] intArr2D = {{1}, {2,3}, {4,5,6}}; //the best syntax
        intArr2d = new int[3][5]; //array with three spaces and each space has another array with 5 spaces 
        int intArr2D2[][];
        int[] intArr2D3[]; //Worst syntax for 2D arrays

        //use for loops to traverse arrays

        for (int i = 0; i < intArr2.length; i++){ /*this says as long as i is less 
            than the array, print out that number*/

            //System.out.print(intArr2[i]);
        }

        for (int i : intArr2){
            //System.out.print(i);
        }

        //nested for loop
        
        for (int i = 0; i < intArr2D.length; i++) {
            for (int j = 0; j < intArr2D[i].length; j++){
                //System.out.print(intArr2D[i][j]);
            }
        }

        System.out.println(Arrays.toString(intArr));
    }
}