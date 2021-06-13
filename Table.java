import java.util.*;
public class Table{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();
        int i=1;
2
        while(i<=10)
        {
            System.out.println(n+" * "+i+" = "+n*i);
            i++;
        }

    }
}