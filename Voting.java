import java.util.*;
public class Voting{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age to check whether eligible for voting or not");
        int age=sc.nextInt();

        if(age>=18)
        {
            System.out.println("Eligible:");
        }
        else
        {
            System.out.println("Not Eligible:");
        }

    }
}