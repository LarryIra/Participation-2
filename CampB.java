import java.sql.Timestamp;
import java.util.*;


public class CampB extends Campany {

    static Scanner scan = new Scanner(System.in);
    static Scanner scan2 = new Scanner(System.in);

    static List<CampA> ctList = new ArrayList<>();
    static List<History> histList = new ArrayList<>();

    int ctId;
    int ctBalance;
    //constructor
    CampB(int ctId, int ctBalance){
        this.ctId=ctId;
        this.ctBalance=ctBalance;
    }
    public int getCtId(){
        return ctId;
    }
    public int getCtBalance(){
        return ctBalance;
    }
    public String toString(){
        return ctId+"\t"+ctBalance;
    }
    public CampB() {
    }
    public float interestRate() {
        return 0.99f;
    }
    static public void displayData() {
        for (Campany campany : ctList) {
            System.out.println(campany);
        }
    }

    public static void deposit() {
        int depAmount, oldAmount, newAmount, a, cd;
        boolean b2 = false;
        //CampA ct;
        ArrayList<CampB> ctAList = new ArrayList<>();
        ArrayList<CampB> histAList = new ArrayList<>();
        ListIterator<CampB> li = ctAList.listIterator();
        ListIterator<CampB.History> pi = histList.listIterator();
        for (CampA ct : ctList) {
            System.out.print("Amount to deposit: ");
            depAmount = scan2.nextInt();
            a = ct.getCtBalance() + depAmount;
            oldAmount = ct.getCtBalance();
            Campany campany = (new CampA(ct.getCtId(), a));
            //histList.add(new History(pi.next().getMyCampany(), depAmount, new Timestamp(System.currentTimeMillis())));

            b2 = true;
        }
        if (b2) {
            System.out.println("Deposit is Successful");
        } else {
            System.out.println("Deposit Failed");
        }

    }

//    public void withdraw() {
//        Scanner scan = new Scanner(System.in);
//        int searchId, depAmount, oldAmount, newAmount, a;
//        boolean b2 = false;
//        System.out.print("Account to make withdraw for: ");
//        searchId = scan.nextInt();
//        ListIterator<Campany> li = ctList.listIterator();
//        while (li.hasNext()) {
//            Campany ct = li.next();
//            if (ct.ctId == searchId) {
//                System.out.print("Amount to withdraw: ");
//                depAmount = scan.nextInt();
//                a = ct.getCtBalance() - depAmount;
//                oldAmount = ct.getCtBalance();
//                li.set(new Campany(searchId, ct.getCtBalance() - depAmount));
//                ct = new Campany(searchId, depAmount);
//                histList.add(new History(ct, a, new Timestamp(System.currentTimeMillis())));
//
//                b2 = true;
//            }
//
//        }
//        if (b2) {
//            System.out.println("Amount withdrawn Successful");
//        } else {
//            System.out.println("Customer not Found");
//        }
//
//    }

    public static void displayHistory() {
        Iterator iter = histList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    class History {
        Campany myCampany;
        int cumulPay;
        Timestamp mTime;

        //constructor
        History(Campany myCampany, int cumulPay, Timestamp mTime) {
            this.myCampany = myCampany;
            this.cumulPay = cumulPay;
            this.mTime = mTime;
        }

        public Campany getMyCampany() {
            return this.myCampany;
        }

        public int cumulPay() {
            return this.cumulPay;
        }

        public Timestamp mTime() {
            return mTime;
        }

        public String toString() {
            return myCampany + "\t" + cumulPay + "\t" + mTime;
        }
    }
}
