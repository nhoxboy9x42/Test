import java.util.Scanner;
class fraction{
    private int numerator, denominator;
    public fraction(){
        numerator = 0;denominator=1;
    }
    public fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator=denominator;
    }
    public fraction(fraction ft){
        this.numerator = ft.numerator;
        this.denominator = ft.denominator;
    }
    void setNumerator(int numerator){
        this.numerator = numerator;
    }
    int getNumerator(){
        return this.numerator;
    }
    void setDenominator(int denominator){
        this.denominator = denominator;
    }
    int getDenominator(){
        return this.denominator;
    }
    //Nhập vào một phân số
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập vào tử số : ");
        this.numerator = sc.nextInt();
        System.out.print("Nhập vào mẫu số : ");
        do{
            this.denominator = sc.nextInt();
            if(this.denominator==0){
                System.out.print("Mẫu số không được bằng 0, mời bạn nhập lại: ");
            }
        }while(this.denominator==0);
        sc.close();
    }
    void output(){
        System.out.print(this.numerator+"\n-\n"+this.denominator);
    }
    // Tìm ước chung lớn nhất
    public int findUCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }
    //Rút gọn phân số
    void abriFractions(){
        int i = findUCLN(this.getNumerator(), this.getDenominator());
        this.setNumerator(this.getNumerator()/i);
        this.setDenominator(this.getDenominator()/i);
        output();
    }
    //Cộng 2 phân số
    void sumFraction(fraction ps){
        int nume2,den2;
        nume2 = this.numerator*ps.denominator+this.denominator*ps.numerator;
        den2 = this.denominator*ps.denominator;
        for (int i = 2; i < 10; i++) {
            if(nume2%i==0 && den2%i==0){
                nume2 /=i;
                den2 /=i;
            } 
        }
        System.out.println("\n___Cộng 2 phân số___");
        if(den2 == 1){
            System.out.println(nume2);
        }else if(nume2==den2){
            System.out.println("1");
        }
        else if(nume2 ==0){
            System.out.println("0");
        }else{
            System.out.println(nume2+"\n-\n"+den2);
        }
    }
    //Trừ 2 phân số
    void subFraction(fraction ps){
        int nume2,den2;
        nume2 = this.numerator*ps.denominator-this.denominator*ps.numerator;
        den2 = this.denominator*ps.denominator;
        for (int i = 2; i < 10; i++) {
            if(nume2%i==0 && den2%i==0){
                nume2 /=i;
                den2 /=i;
            } 
        }
        System.out.println("\n___Trừ 2 phân số___");
        
        if(den2 == 1){
            System.out.println(nume2);
        }else if(nume2==den2){
            System.out.println("1");
        }
        else if(nume2 ==0){
            System.out.println("0");
        }else{
            System.out.println(nume2+"\n-\n"+den2);
        }
    }
    //Nhân 2 phân số
    void multiFraction(fraction ps){
        int nume2,den2;
        nume2 = this.numerator*ps.numerator;
        den2 = this.denominator*ps.denominator;
        for (int i = 2; i < 10; i++) {
            if(nume2%i==0 && den2%i==0){
                nume2 /=i;
                den2 /=i;
            } 
        }
        System.out.println("\n___Nhân 2 phân số___");
        
        if(den2 == 1){
            System.out.println(nume2);
        }else if(nume2==den2){
            System.out.println("1");
        }
        else if(nume2 ==0){
            System.out.println("0");
        }else{
            System.out.println(nume2+"\n-\n"+den2);
        }
    }
    //Chia 2 phân số
    void divisionFraction(fraction ps){
        int nume2,den2;
        nume2 = this.numerator*ps.denominator;
        den2 = this.denominator*ps.numerator;
        for (int i = 2; i < 10; i++) {
            if(nume2%i==0 && den2%i==0){
                nume2 /=i;
                den2 /=i;
            } 
        }
        System.out.println("\n___Chia 2 phân số___");
        if(den2 == 1){
            System.out.println(nume2);
        }else if(nume2==den2){
            System.out.println("1");
        }
        else if(nume2 ==0){
            System.out.println("0");
        }else{
            System.out.println(nume2+"\n-\n"+den2);
        }
    }

}
public class Bai2_T2{
    public static void main(String[] args) {
        fraction ft = new fraction();
        fraction ft1 = new fraction();
        //Nhập vào phân số thứ nhất
        ft.input();
        //Nhập vào phân số thứ hai
        ft1.input();
        //Rút gọn phân số thứ nhất
        System.out.println("___Phân sô thứ nhất sau khi rút gọn___");
        ft.abriFractions();
        //Rút gọn phân số thứ hai
        System.out.println("\n___Phân sô thứ hai sau khi rút gọn___");
        ft1.abriFractions();
        //Trừ hai phân số
        ft.subFraction(ft1);
        //Cộng hai phân số
        ft.sumFraction(ft1);
        //Nhân hai phân số
        ft.multiFraction(ft1);
        //Chia hai phân số
        ft.divisionFraction(ft1);
    }
}
