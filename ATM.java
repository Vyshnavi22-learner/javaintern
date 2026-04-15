import java.util.*;

public class ATM{
    static Scanner sc=new Scanner(System.in);
    static double b=5000;
    static ArrayList<String> h=new ArrayList<>();

    public static void main(String[] a){
        System.out.print("id:");
        String id=sc.next();
        System.out.print("pin:");
        String p=sc.next();

        if(id.equals("user123")&&p.equals("5555")){
            m();
        }else{
            System.out.println("invalid");
        }
    }

    static void m(){
        while(true){
            System.out.println("1.history 2.withdraw 3.deposit 4.transfer 5.exit");
            int ch=sc.nextInt();

            if(ch==1){
                if(h.size()==0){
                    System.out.println("no history");
                }else{
                    for(String s:h){
                        System.out.println(s);
                    }
                }
            }
            else if(ch==2){
                System.out.print("amt:");
                double x=sc.nextDouble();

                if(x<=b){
                    b=b-x;
                    h.add("with:"+x+" bal:"+b);
                    System.out.println("done bal:"+b);
                }else{
                    System.out.println("low bal");
                }
            }
            else if(ch==3){
                System.out.print("amt:");
                double x=sc.nextDouble();

                b=b+x;
                h.add("dep:"+x+" bal:"+b);
                System.out.println("done bal:"+b);
            }
            else if(ch==4){
                System.out.print("to:");
                String t=sc.next();
                System.out.print("amt:");
                double x=sc.nextDouble();

                if(x<=b){
                    b=b-x;
                    h.add("tr:"+x+" to "+t+" bal:"+b);
                    System.out.println("sent bal:"+b);
                }else{
                    System.out.println("low bal");
                }
            }
            else if(ch==5){
                System.out.println("exit");
                break;
            }
            else{
                System.out.println("invalid choice");
            }
        }
    }
}
