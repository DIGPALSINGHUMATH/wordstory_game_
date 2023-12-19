import java.util.Scanner;

public class word {
    public static void jobless(String Myname){
        // char na = nuretur ;
        System.out.println("hi "+Myname+".  What is this place so hot . who is this young girl .so prety. I guess she is approx 18 to 19 year old  ");
        
    }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your charecter name");
    String Myname = sc.nextLine();
    System.out.println("Hi i am "+ Myname+". I am reborn in another world");
    System.out.println("In my preverse life i work on tech company. on that world i has single.");
    System.out.println("now which world are you interst to join \n 1)jobless not see(magice world)");
    int n = sc.nextInt();
    if (n == 1) {
        jobless(Myname);
    }
   }
}
