import java.util.Scanner;
public class atminterface {
    public static void main(String[] args){
        String userid="xyz";
        int userpin=3214,select;
        long bal=400000;
        long withdraw=0;
        long deposit=0;
        long transfer=0;
        long amt=0;
        boolean flag=true;
        Scanner in=new Scanner(System.in);
        System.out.println("                         ATM SYSTEM                             \n\n ");
        System.out.print("ENTER USER ID:");
        String id=in.nextLine();
        System.out.print("ENTER PIN:");
        int pin=in.nextInt();

        if(userid.equals(id) && userpin==pin)
        {
           while(flag){
            System.out.println("SELECT TRANSACTION");
            System.out.println(" 1.Transactions History\n 2.Withdraw\n 3.Deposit\n 4.Transfer\n 5.Quit");
            select = in.nextInt();
            switch(select){
                case 1:
                    System.out.println("TRANSACTION DETAILS");
                    System.out.println("WITHDRAW AMOUNT:"+withdraw);
                    System.out.println("DEPOSIT AMOUNT:"+deposit);
                    System.out.println("CURRENT BALANCE:"+bal);
                    break;
                case 2:
                    System.out.print("ENTER AMOUNT TO WITHDRAW:");
                    amt=in.nextLong();
                    if(amt>bal){
                        System.out.println("INSUFFICIENT BALANCE");
                    }
                    else{
                        withdraw = withdraw+amt;
                        bal=bal-amt;
                        System.out.println("AMOUNT WITHDRAW IS SUCCESSFULL");
                    }
                    break;
                case 3:
                    System.out.print("ENTER AMOUNT TO DEPOSIT:");
                    amt = in.nextLong();
                    bal = bal + amt;
                    deposit = deposit + amt;
                    System.out.println("AMOUNT DEPOSITED SUCCESSFULLY");
                    break;
                case 4:
                    System.out.print("ENTER AMOUNT TO TRANSFER:");
                    amt = in.nextLong();
                    if(amt>bal){
                        System.out.println("AMOUNT CAN'T BE TRANSFERRED");
                    }
                    else{
                        bal = bal - amt;
                        transfer = transfer + amt;
                        System.out.println("AMOUNT TRANSFERRED SUCCESSFULLY");
                    }
                    break;
                case 5:
                    System.out.println("               EXIT\n               THANK YOU");
                    flag=false;
                    break;
            } 
        }  
        }
        else
        {
                System.out.println(" INCORRECT CREDENTIALS ");
        }
    }
 
}
