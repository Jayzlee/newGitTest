class oneDArray
{

    //Sum of the oneDArray
    public static double Sum(int[] i)
    {
        double sum = 0;
        for(int j = 0;j < i.length; j++){
            sum = sum + i[j];
        }
        return sum;
    }
    //find the min element and its index
    public static void Min(int[] i)
    {
        int min = i[0];
        int index = 0;
        for(int j = 0; j < i.length; j++)
        {
            if(i[j]< min)
            {
                min = i[j];
                index = j;
            }
        }
        System.out.println("The minimum number in the array is: " + min);
        System.out.println("The minimum number's index in the array is: " + index);
    }
    //find the max element and its index
    public static void Max(int[] i)
    {
        int max = i[0];
        int index = 0;
        for(int j = 0; j < i.length; j++)
        {
            if(i[j]> max)
            {
                max = i[j];
                index = j;
            }
        }
        System.out.println("The maximum number in the array is: " + max);
        System.out.println("The maximum number's index in the array is: " + index);
    }
}


public class Main {
    public static void main(String[] args) {
        int arr[] = new int [5];
        //initialize the array
        for(int i = 0; i< arr.length; i++)
        {
            arr[i] = i;
        }
        System.out.println("The sum of the array is: " + oneDArray.Sum(arr));
        oneDArray.Min(arr);
        oneDArray.Max(arr);
        
    }

}