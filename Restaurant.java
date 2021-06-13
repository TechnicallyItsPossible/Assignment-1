
import java.util.*;
public class Restaurant{

    public void DisplayMenu(){

        System.out.println("::Menu Display::");
        System.out.println(" 1.	Snack \n 2.	Lunch \n 3.	Dinner \n 4.	Soft drink/Tea coffee");
        System.out.print("Enter your choice: \n\n");

    }

    public void DisplayFood(){

        System.out.println("Snacks \t Items \t\t qty \t price");
        System.out.println("1. \t Idli \t\t 1 \t 40");
        System.out.println("2. \t Dosa \t\t 1 \t 50");
        System.out.println("3. \t Uttapam \t 1 \t 30");
        System.out.println("4. \t Poha/Upma \t 1 \t 20");

    }

    public static void main(String[] args) {

        Restaurant rs=new Restaurant();

        Scanner sc=new Scanner(System.in);
        int a;
        do{

            System.out.println("Do you wish to order food:\n 1. Y 2. N");
            a=sc.nextInt();

            if(a==2)
            {
                break;
            }
            else
            {
                rs.DisplayMenu();
                rs.DisplayFood();
                System.out.println("Enter Item Choice: ");
                int b=sc.nextInt();
                System.out.println("Enter Quantity ");
                int c=sc.nextInt();
                switch(b)
                {
                    case 1: System.out.println("Your bill for snack is :Rs."+40*c);
                            break;
                    case 2: System.out.println("Your bill for snack is :Rs."+50*c);
                            break;
                    case 3: System.out.println("Your bill for snack is :Rs."+30*c);
                            break;
                    case 4: System.out.println("Your bill for snack is :Rs."+20*c);
                            break;
                    default: System.out.println("Wrong Choice:");
                }
            }

        }while(a==1);
    }
}