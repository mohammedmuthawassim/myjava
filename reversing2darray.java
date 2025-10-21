import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int[][] arr=new int[3][3];
        input(arr);
        System.out.println("your data before reversing");
        show(arr);
        reverse(arr);
        System.out.println("your data before reversing");
        show(arr);
        
    }
    static void input(int[][] arr)
    {
        Scanner in=new Scanner(System.in);
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print("enter any number:");
                arr[i][j]=in.nextInt();
            
            }
        }
    }
    static void show(int[][] arr)
    {
        for(int i=0;i<arr.length;i++){
          System.out.println(Arrays.toString(arr[i]));  
        }
        
    }
    static void reverse(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int first=0;
            int last=arr[i].length-1;
            while(first<last)
            {
                int temp=arr[i][first];
                arr[i][first]=arr[i][last];
                arr[i][last]=temp;
                last--;
                first++;
            }
        }
    
    }
}
