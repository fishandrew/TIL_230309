import java.util.Scanner;

public class project2_2 {
 
    public static void sum(int left, int right) {
        System.out.println("합 " + (left + right));
    }
    public static void avg(int left, int right) {
    	System.out.println("평균 " + (left+right)/2);
    }
 
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int sc1 = sc.nextInt(); 
    	Scanner sc0 = new Scanner(System.in);
    	int sc2 = sc0.nextInt();
    	
    	sc.close();
    	sc0.close();
    	
        sum(sc1, sc2);
        avg(sc1,sc2);
    }
 
}