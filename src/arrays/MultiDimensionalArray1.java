package arrays;

public class MultiDimensionalArray1 {
    public static void main(String[] args) {
        int[] [] marksArray = {
            {74,89,92},
            {62,76,89},
            {90,78,89}
        };
        for(int i=0;i<marksArray.length;i++){
            for(int j=0;j<marksArray[i].length;j++){
                System.out.print(marksArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
