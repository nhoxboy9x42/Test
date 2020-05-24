import java.util.*;
class triangle {
    private int ma;
    private int mb;
    private int mc;

    // Constructor
    public triangle() {
        ma = mb = mc = 0;
    }

    public triangle(int a, int b, int c) {
        if (a < 0) {
            System.out.println("Nhập sai!, Cạnh a <0");
            ma = 0;
            return;
        }
        if (b < 0) {
            System.out.println("Nhập sai!, Cạnh b <0");
            mb = 0;
            return;
        }
        if (c < 0) {
            System.out.println("Nhập sai!, Cạnh c <0");
            mc = 0;
            return;
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Đây không phải là một tam giác");
            ma = mb = mc = 0;
            return;
        }
        ma = a;
        mb = b;
        mc = c;
    }

    // Get methods
    public int getCanhA() {
        return ma;
    }

    public int getCanhB() {
        return mb;
    }

    public int getCanhC() {
        return mc;
    }

    // set methods
    public void setCanhA(int a) {
        ma = a;
    }

    public void setCanhB(int b) {
        mb = b;
    }

    public void setCanhC(int c) {
        mc = c;
    }

    public boolean laTamGiac() {
        return (ma + mb > mc && ma + mc > mb && mb + mc > ma);
    }

    public boolean laTamGiac(int a, int b, int c) {
        return (a + b > c && a + c > b && b + c > a);
    }
    //Tính chu vi tam giác
    public int getPerimeter() {
        return ma + mb + mc;
    }
    //Tính diện tích tam giác
    /**
     * S=sqrt(p(p-a)(p-b)(p-c))
     * p=1/2(a+b+c) 1/2 chu vi tam giác
     * @return
     */
    public double getArea() {
        double p = (double) (ma + mb + mc) / 2;
        return Math.sqrt(p * (p - ma) * (p - mb) * (p - mc));  
    }
    public void typeTriangle(){
        if(ma*ma+mb*mb==mc*mc||ma*ma+mc*mc==mb*mb||mb*mb+mc*mc==ma*ma){
            System.out.println("Đây là tam giác vuông");
            return;
        }else if(ma==mb && ma==mc && mb==mc){
            System.out.println("Đây là tam giác đều");
            return;
        }else if(ma==mb||mb==mc||ma==mc){
            System.out.println("Đây là tam giác cân");
        }
    }
}

public class Bai5_T2 {
    public static void main(String[] args) {
        System.out.println("______Nhập vào cạnh của tam giác______");
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập vào cạnh a: ");
        int ma = input.nextInt();
        System.out.print("Nhập vào cạnh b: ");
        int mb = input.nextInt();
        System.out.print("Nhập vào cạnh c: ");
        int mc = input.nextInt();
        triangle tamgiac = new triangle(ma, mb, mc);
        if (tamgiac.laTamGiac()) {
            tamgiac.typeTriangle();
            System.out.println("Chu vi: " + tamgiac.getPerimeter());
            System.out.println("Dien tich: " + tamgiac.getArea());
        }
    }
}