import java.util.*;

class ContainsDuplicate
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            int val=arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                if(val == arr[j])
                {
                   count = count+1;
                }
              
            }
        }
        if(count>0)
        {
            System.out.print("True");
        }    
        else
        {   
             System.out.print("False");
        } 
    }
}