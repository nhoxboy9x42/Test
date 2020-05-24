import java.util.*;
class firstDegreeEquation{
    private int a,b;
    //Constructor
    public firstDegreeEquation(){
        a=b=0;
    }
    public firstDegreeEquation(int x, int y){
        this.a=x;
        this.a=y;
    }
    //Set
    public void setA(int x){
        this.a= x;
    }
    public void setB(int y){
        this.b=y;
    }
    //Get
    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }
    //Nhập vào phương trình
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào a: ");
        this.a = sc.nextInt();
        System.out.print("Nhập vào b: ");        
        this.b = sc.nextInt();
        sc.close();
    }
    // Giaỉ phương trình bậc nhất
    public void solve(){
        double result;
        if(a!=0){
            result = (double)(-b)/a;
            System.out.println("Nghiệm của phương trình: "+result);
        }else if(b==0){
            System.out.println("Phương trình có vô số nghiệm");
        }else if(b!=0){
            System.out.println("Phương trình vô nghiệm");
        }
    }
}
public class Bai6_T2 {
    public static void main(String[] args) {
        firstDegreeEquation fed = new firstDegreeEquation();
        fed.input();
        fed.solve();
    }
}