import java.util.*;

public class Exam{
    static Scanner sc=new Scanner(System.in);
    static String u="stud1";
    static String pw="pass123";
    static String n="stud";

    public static void main(String[] a){
        System.out.println("login");
        System.out.print("id:");
        String id=sc.next();
        System.out.print("pass:");
        String p=sc.next();

        if(id.equals(u)&&p.equals(pw)){
            System.out.println("welcome "+n);
            m();
        }else{
            System.out.println("fail");
        }
    }

    static void m(){
        while(true){
            System.out.println("1.update 2.exam 3.exit");
            int ch=sc.nextInt();

            if(ch==1){
                System.out.print("name:");
                n=sc.next();
                System.out.print("pass:");
                pw=sc.next();
                System.out.println("done");
            }
            else if(ch==2){
                ex();
            }
            else{
                System.out.println("logout");
                break;
            }
        }
    }

    static void ex(){
        String[] q={"java short?","main return?","int default?"};
        String[] o={"A.coffee B.juice","A.int B.void","A.0 B.1"};
        char[] a={'A','B','A'};
        char[] ua=new char[3];

        long s=System.currentTimeMillis();
        long e=s+30000;

        System.out.println("start 30 sec");

        for(int i=0;i<3;i++){
            if(System.currentTimeMillis()>e){
                System.out.println("time up");
                break;
            }

            System.out.println("q"+(i+1)+":"+q[i]);
            System.out.println(o[i]);
            System.out.print("ans:");
            ua[i]=sc.next().toUpperCase().charAt(0);
        }

        int sc=0;
        for(int i=0;i<3;i++){
            if(ua[i]==a[i]) sc++;
        }

        System.out.println("score:"+sc+"/3");
    }
}
