import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int[][] arr=new int[3][3];
        input(arr);
        show(arr);
    }
    static void input(int[][] arr)
    {
        Scanner in=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print("enter number:");
                arr[i][j]=in.nextInt();
            }
        }
    }
    static void show(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+",");
            }
        }
    }
}2d array
