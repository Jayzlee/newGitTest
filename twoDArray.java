class twoDArray
{
    public static void Show(int[][] array) {
        for (int i = 0; i <  array.length; i++) {
            for (int j = 0; j < array[i].length; j++)
            {
                System.out.println(array[i][j]+ " ");
            }

        }
    }
    public static void Add(int[][] array1, int[][] array2, int[][] array3)
    {
        for (int i = 0; i <  array1.length; i++) {
            for (int j = 0; j < array1[i].length; j++)
            {
                array3[i][j] = array1[i][j] + array2[i][j];
            }

        }
    }
}


public class Main {
    public static void main(String[] args) {
        int arr1[][] = new int [2][2];
        int arr2[][] = new int [2][2];
        int arr3[][] = new int [2][2];
        //initialize the array
        for(int i = 0; i< arr1.length; i++)
        {
            for(int j = 0; j < arr1[i].length; j++)
                arr1[i][j] = j;
        }
        for(int i = 0; i< arr2.length; i++)
        {
            for(int j = 0; j < arr2[i].length; j++)
                arr2[i][j] = j;
        }
        System.out.println("The elements in the arr1 are: ");
        twoDArray.Show(arr1);
        System.out.println("The elements in the arr2 are: ");
        twoDArray.Show(arr2);
        //Add first two array to third array
        twoDArray.Add(arr1,arr2,arr3);
        System.out.println("The Sum matrix result are: ");
        twoDArray.Show(arr3);


    }

}