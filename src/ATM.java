import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        String userName,password;
        Scanner scanner=new Scanner(System.in);

        int rigt=3;
          int select;
          int balance=2000;

        while(rigt>0){
            System.out.print("enter username");
            userName= scanner.nextLine();
            System.out.println("enter password");
            password=scanner.nextLine();
            if (userName.equals("bahtiyar")&&password.equals("123")){
                System.out.println("WELCOME");
                System.out.println("1-withdraw money.\n"+
                        "2-to deposit money\n"+
                        "3-balance\n"+
                        "4-log out");
                System.out.println("make your select");
                select=scanner.nextInt();


                switch (select){

                    case 1:
                        System.out.println("enter the amount of money");
                        int price=scanner.nextInt();
                        balance-=price;
                        System.out.println("money in your account"+balance);
                        break;
                    case 2:
                        System.out.println("enter the amount of money");
                        int moneyPlus=scanner.nextInt();
                        balance+=moneyPlus;
                        System.out.println("money in your account"+balance);
                        break;
                    case 3:
                        System.out.println("balance="+balance);

                        break;
                    case 4:
                        System.out.println("have a good day");
                        break;


                }






            }else {
                rigt--;
                System.out.println("You entered incorrect or incomplete information, please try again.");
                System.out.println("your remaining right="+rigt);
                if (rigt==0){
                    System.out.println("your account has been blocked");
                }else {
                    System.out.println("try again");
                }

            }

             }
    }
}
