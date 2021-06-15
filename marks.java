import java.util.*;
class marks
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n=sc.nextInt();
        int sub[][]=new int[n][4];
        String names[]=new String[n];
        for(int i=0;i<n;i++)
        {
            names[i]=sc.next();
            for(int j=0;j<4;j++)
            {
                sub[i][j]=sc.nextInt();
            }
        }

        System.out.println("THe details are:");
        for(int i=0;i<n;i++)
        {
            System.out.print((i+1)+".\t");
            System.out.print(names[i]+"\t");
            int sum=0;
            for(int j=0;j<4;j++)
            {
                System.out.print(sub[i][j]+"\t");
                sum=sum+sub[i][j];;
            }

            System.out.print(" Total =" +sum);
            System.out.println();
        }
        sc.close();
    }
}