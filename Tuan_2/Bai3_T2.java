import java.util.*;
class COODINATE{
    private int x,y;
    public COODINATE(){
        x=y=0;
    }
    public COODINATE(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void setX(int x){
        this.x=x;
    }
    public int getX(){
        return this.x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getY(){
        return this.y;
    }
    public void output(){
        System.out.println("___Tọa độ của điểm vừa nhập___");
        System.out.print("X: "+this.x+"\nY: "+this.y+"\n");
    }
    public void sumXY(COODINATE cd){
        int sumX,sumY;
        sumX=this.x+cd.x;
        sumY=this.y+cd.y;
        System.out.print("X: "+sumX+"\nY: "+sumY);
    }
    public void symmetryXY(){
        int symX,symY;
        symX=this.x-(this.x*2);
        symY=this.y-(this.y*2);
        System.out.println("\n___Tọa độ đối xứng___\n"+"X: "+symX+"\nY: "+symY);
    }
}
public class Bai3_T2 {
    public static void main(String[] args) {
        int x,y,x1,y1;
        Scanner sc = new Scanner(System.in);
        System.out.println("___Nhập vào tọa độ điểm thứ 1___");
        System.out.print("Nhập vào tọa độ X: ");
        x=sc.nextInt();
        System.out.print("Nhập vào tọa độ Y: ");
        y=sc.nextInt();
        System.out.println("___Nhập vào tọa độ điểm thứ 2___");
        System.out.print("Nhập vào tọa độ X: ");
        x1=sc.nextInt();
        System.out.print("Nhập vào tọa độ Y: ");
        y1=sc.nextInt();
        COODINATE cd = new COODINATE(x,y);
        COODINATE cd1 = new COODINATE(x1,y1);
        cd.output();
        cd1.output();
        System.out.println("___Tổng tọa độ của hai điểm là___");
        cd.sumXY(cd1);
        cd.symmetryXY();
        sc.close();
        

    }
}