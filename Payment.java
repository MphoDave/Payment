import java.util.Scanner;

public class Payment {
    public static void CaptureDetails() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your First Name");
        String FirstName = sc.nextLine();

        System.out.println("Enter your Last Name");
        String LastName = sc.nextLine();

        System.out.println("Enter your Department");
        String Department = sc.nextLine();

    }

    public static int Hours(int Hrs, int Min,int Hrs2, int Min2,int Hrs3, int Min3, int Hrs4, int Min4, int Hrs5, int Min5) {

        int TotalHrs = 0;
        int TotalMin = 0;
        int ExtraHrs = 0;

        TotalHrs = Hrs + Hrs2 + Hrs3 + Hrs4 + Hrs5;
        TotalMin = Min + Min2 + Min3 + Min4 + Min5;
        ExtraHrs = TotalMin/60;
        TotalHrs += ExtraHrs;

        return TotalHrs;   
        
    }

    public static int Minutes(int Min, int Min2, int Min3, int Min4, int Min5) {

        int TotalMin = 0;
        int ExtraMin = 0;

        TotalMin = Min + Min2 + Min3 + Min4 + Min5;
        ExtraMin = TotalMin% 60;

        return ExtraMin;
   
    }

    public static int Calculate(int Hrs, int Min,int Hrs2, int Min2,int Hrs3, int Min3, int Hrs4, int Min4, int Hrs5, int Min5) {

        int Answer = 0;
        int TotalHrs = 0;
        int TotalMin = 0;
        int ExtraHrs = 0;

        TotalHrs = Hrs + Hrs2 + Hrs3 + Hrs4 + Hrs5;
        TotalMin = Min + Min2 + Min3 + Min4 + Min5;
        ExtraHrs = TotalMin/60;
        TotalHrs += ExtraHrs;  


        Scanner sc = new Scanner(System.in);

         System.out.println("Choose your Department: 1. IT 2. Admin 3. HR");
         int Department = sc.nextInt();

         switch(Department) {

            case 1:

            if (TotalHrs > 40){

                Answer = (40 * 200) + ( Hours(Hrs, Min, Hrs2, Min2, Hrs3, Min3, Hrs4, Min4, Hrs5, Min5) - 40) * 250; 

            } else {

                Answer = Hours(Hrs, Min, Hrs2, Min2, Hrs3, Min3, Hrs4, Min4, Hrs5, Min5) * 200;
            }  

            break;

            case 2:

            if (TotalHrs > 40){

                Answer = (40 * 600) + ( Hours(Hrs, Min, Hrs2, Min2, Hrs3, Min3, Hrs4, Min4, Hrs5, Min5) - 40) * 650; 

            } else {

                Answer = Hours(Hrs, Min, Hrs2, Min2, Hrs3, Min3, Hrs4, Min4, Hrs5, Min5) * 600;
            } 

            break;

            case 3:

            if (TotalHrs > 40){

                Answer = (40 * 400) + ( Hours(Hrs, Min, Hrs2, Min2, Hrs3, Min3, Hrs4, Min4, Hrs5, Min5) - 40) * 450; 

            } else {

                Answer = Hours(Hrs, Min, Hrs2, Min2, Hrs3, Min3, Hrs4, Min4, Hrs5, Min5) * 400;
            } 

            break;

            default:

            System.out.println("Invalid Selection please Enter the correct number");

            break;


            


            


         }

         return Answer;

         

    }

    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
      
        System.out.println("Enter Hours And Minutes For Monday");
        int Hrs = sc.nextInt();
        int Min = sc.nextInt();

        System.out.println("Enter Hours And Minutes For Tuesday");
        int Hrs2 = sc.nextInt();
        int Min2 = sc.nextInt();
        
        System.out.println("Enter Hours And Minutes For Wednesday");
        int Hrs3 = sc.nextInt();
        int Min3 = sc.nextInt();
        
        System.out.println("Enter Hours And Minutes For Thursday");
        int Hrs4 = sc.nextInt();
        int Min4 = sc.nextInt();
        
        System.out.println("Enter Hours And Minutes For Friday");
        int Hrs5 = sc.nextInt();
        int Min5 = sc.nextInt();

        System.out.println("Total Hours Is " + Hours(Hrs, Min, Hrs2, Min2, Hrs3, Min3, Hrs4, Min4, Hrs5, Min5)+" Hours and "+ Minutes(Min, Min2, Min3, Min4, Min5)+" Minutes ");

        System.out.println("Total Payment is R" + Calculate(Hrs, Min, Hrs2, Min2, Hrs3, Min3, Hrs4, Min4, Hrs5, Min5));


        

          
            
        
        
    }


}