import java.util.Scanner;
 abstract class UserProfile{
    String name;
    int age ;
    long number;
  UserProfile(String name,int age,long number){
    this.name=name;
    this.age=age;
    this.number=number;
    }
   public abstract void MyAccount();
}
 interface AppHome{
    void BookRide();
    void RidePayment();
    void FeedBack(); 
}
class Booking extends UserProfile implements AppHome{
      Scanner sc=new Scanner(System.in);
    public float kms;
    public int rate;
    public float dist;
    public int pay;
      Booking(String name,int age ,long number){
        super(name,age,number);
    }
        public void BookRide(){
       System.out.print(" ENTER SOURCE LOCATION : ");
        String src=sc.nextLine();
        System.out.print(" ENTER YOUR DESTINATION : ");
        String dest=sc.nextLine();  
        System.out.print(" ENTER THE DISTANCE IN KMS (APPROX) : ");
         kms=sc.nextFloat();
        dist=kms*10;
        System.out.println(" DEAR "+name+" YOUR REQUEST TO BOOK A RIDE FROM "+src+"TO "+dest+" HAS BOOKED SUCCESFULLY USING RAPIDO ");
        System.out.println(" \t \t \t ESTIMATION PRICE : "+dist+" rupees only /-");
        System.out.println(" THANK YOU  - TEAM RAPIDO ");
      }
      public void RidePayment(){
        int a=1;
        System.out.println(" CONFIRM YOUR PAYMENT TO COMPLETE THE RIDE ");
        System.out.println(" CHOOSE ONE PAYMENT METHOD \n 1.PHONEPE \n 2.G PAY \n 3.PAYTM \n 4.RAZORPAY ");
        int paymode=sc.nextInt();
        System.out.print(" PAY "+dist+" RUPPES ONLYYYYY:  ");
        pay=sc.nextInt();
        while(a>0){
       if( pay==(int)dist ){
            a=1;
            System.out.println("=================================================");
            System.out.println(" YOUR PAYMENT FOR THE DRIVEN RIDE HAS COMPLETED !");
            System.out.println(" THANK YOU FOR CHOOSING RAPIDO :: HAVE A NICE DAY ");
            System.out.println("==================================================");
            break;
        }else{
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println(" PAYMENT IS UNDER PROCESS OR TECHNICAL ISSUE  ");
            System.out.println(" PLEASE TRY AGAIN !!");
            System.out.print(" PAY "+dist+" AGAIN !!! : ");  
            pay =sc.nextInt();
            sc.next();
        }
    }
    }
    public void FeedBack(){
        System.out.println(" WELCOME TO THE FEEDBACK PAGE ");
        System.out.println("CHOOSE ONE ONE OF THE RATING FOR YOUR RIDE \n 1.Single Star\n 2.Double Star \n 3.Triple Star \n 4.Four Star \n 5.Five Star");
        rate=sc.nextInt();
        sc.nextLine();
        System.out.println("FEEDBACK  OF " + rate + " STAR RATING FOR THE "+pay+" RUPEES RIDE SUBMITTED SUCCESFULLY ");
    }
    public void MyAccount(){
        int userid=24890;
        System.out.println(" WELCOME TO YOUR RAPIDO PROFILE "+name);
        System.out.println(" BELOW ARE YOUR PROFILE DETAILS ");
        System.out.println(" FULL NAME = "+name);
        System.out.println(" USER AGE = "+age);
        System.out.println(" CUSTOMER ID : "+userid);
        System.out.println(" REGISTERED NUMBER = "+number);
        System.out.println(" YOUR RRATING IS "+rate);
        System.out.println(" YOUR TOTAL RIDE KMS : "+kms);
    }

      }

public class Rapido{
    public static void main(String [] args ){
       Scanner sc=new Scanner(System.in);
        System.out.println(" \t \t \t \t \t \t WELCOME TO RAPIDO ");
        System.out.println("\t \t \t  \t   WHICH MAKES YOUR RIDE EASIER AND INSURED  " );
        System.out.println(" PLEASE LOGIN INTO RAPIDO TO CONTINUE BOOKING ");
        System.out.print(" ENTER YOUR NAME : ");
        String name =sc.nextLine();
        System.out.print(" ENTER YOUR AGE : ");
        int age =sc.nextInt();
        System.out.print(" ENTER YOUR MOBILE NO : ");
        long number=sc.nextLong();
        sc.nextLine();
        System.out.println( " PLEASE VERIFY YOUR OTP TO CONTINUE ! ");
        System.out.print(" ENTER 4 DIGIT OTP SENTT TO REGISTERED MOBILE NUMBER _ _ _ _  ");
        boolean  validotp = true;
        Booking b=new Booking(name,age,number);  
        while(validotp){
        if(sc.hasNextInt()){
            int otp=sc.nextInt();
            System.out.println(" OTP VERIFIED SUCCESFULLY ! ");
            System.out.println(" \t \t \t \t \t \tLOGIN SUCCESS START BOOKING YOUR RIDES ");
            System.out.println(" \t \t \t \t \t \t WELCOME TO RAPIDO "+name);
            validotp=true;
            break;
        }else{
            System.out.print(" INVALID OTP ! TRY AGAIN ");
            System.out.println(" PLEASE LOGIN AGAIN ");
            sc.next();
        }
    }
        while(true){
       System.out.println(" 1.BOOK A RIDE \n 2.OPEN PROFILE \n 3. GIVE FEEDBACKK \n 4.CLOSE APPLICATION "); 
       int choice=sc.nextInt();      
       switch(choice){
                case 1:
                     b.BookRide();
                     b.RidePayment();
                     b.FeedBack();
                     break;
                case 2: 
                     b.MyAccount();
                     break;
                case 3:
                     b.FeedBack();
                      break;
                case 4:
                      System.out.println(" CLOSING THE APPLICATION .........");
                      System.out.println(" APPLICATION CLOSED !!");
                      System.exit(0);
                    }
                }
    
        }

    }