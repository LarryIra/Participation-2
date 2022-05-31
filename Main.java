import java.util.*;
import java.sql.Timestamp;

public class Main {



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CampA ca1 = new CampA(101, 700);
        Campany cb1 = new CampB(111, 800);
        Campany cc1 = new CampC(121, 900);

        String chn;
        String cht;

        do {
            System.out.print("1 Company A\n2 Company B\n3 Company C\n\n Enter Your choice: ");
            chn=scan.nextLine();
            cht=scan.nextLine();
            switch (chn) {
                            case "1" -> {
                                System.out.println("This is CampA");
                                Campany company = new CampA();
                                System.out.println("Company's interest is: " + company.interestRate() + "\n" + "The minimum duration is 3years");
                                do{
                                    System.out.print("1 Display\n2 Deposit\n3 Withdraw\n4 History\n\n Enter Your choice: ");
                                    cht=scan.nextLine();
                                    switch (cht){
                                        case "1" -> {
                                            System.out.println("This is CompA\n");
                                           CampA.displayData();
                                        }
                                        case "2" -> {
                                            System.out.println("You are going to deposit\n");
                                            CampA.deposit();
                                        }
                                        case "3" -> {
                                            System.out.println("You are going to withdraw\n");
                                            //CampA.withdraw();
                                        }
                                        case "4" -> {
                                            System.out.println("You are going to display history\n");
                                            CampA.displayHistory();
                                        }
                                    }
                                }while(!cht.equals("0"));
                            }
                            case "2" -> {
                                System.out.println("This is CampB\n");
                                Campany company = new CampB();
                                System.out.println("Company's interest is: " + company.interestRate() + "\n" + "The minimum duration is 3years");

                                do{
                                    System.out.print("1 Display\n2 Deposit\n3 Withdraw\n4 History\n\n Enter Your choice: ");
                                    cht=scan.nextLine();
                                    switch (cht){
                                        case "1" -> {
                                            System.out.println("You are going to display\n");
                                            CampB.displayData();
                                        }
                                        case "2" -> {
                                            System.out.println("You are going to deposit\n");
                                            CampB.deposit();
                                        }
                                        case "3" -> {
                                            System.out.println("You are going to withdraw\n");
                                            //CampB.withdraw();
                                        }
                                        case "4" -> {
                                            System.out.println("You are going to display history\n");
                                            CampB.displayHistory();
                                        }
                                    }
                                }while(!cht.equals("0"));

                            }
                            case "3" -> {
                                System.out.println("This is CampC\n");
                                Campany company = new CampC();
                                System.out.println("Company's interest is: " + company.interestRate() + "\n" + "The minimum duration is 3years");

                                do{
                                    System.out.print("1 Display\n2 Deposit\n3 Withdraw\n4 History\n\n Enter Your choice: ");
                                    cht=scan.nextLine();
                                    switch (cht){
                                        case "1" -> {
                                            System.out.println("You are going to display\n");
                                            CampC.displayData();
                                        }
                                        case "2" -> {
                                            System.out.println("You are going to deposit\n");
                                            CampC.deposit();
                                        }
                                        case "3" -> {
                                            System.out.println("You are going to withdraw\n");
                                            //CampC.withdraw();
                                        }
                                        case "4" -> {
                                            System.out.println("You are going to display history\n");
                                            CampC.displayHistory();
                                        }
                                    }
                                }while(!cht.equals("0"));

                            }
                        }

    } while (!chn.equals("0"));

    }
    //static public void displayData() {
        //for (CampA campany : CampA.ctList) {
            //System.out.println(CampA);
       // }
    //}
}