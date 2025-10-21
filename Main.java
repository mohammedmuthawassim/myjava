import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        int[] arr=new int[5];
        arr = input(5);
        show(arr);
    }
    static int[] input(int size)
    {
        Scanner in=new Scanner(System.in);
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
          System.out.print("enter number:");
            arr[i]=in.nextInt();
        }
        return arr;
    }
    static void show(int[] arr)
    {
       for(int i=0;i<arr.length;i++)
       {
        System.out.print(arr[i]);
       }
    }
}
