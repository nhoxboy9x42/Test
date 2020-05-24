import java.util.*;
class employee{
    private String maso, hoten;
    static float salary;
    static int numberOfEmployee;
     float coeSalary;
    public employee(){
        this.maso=null;
        this.hoten=null;
        salary=0;
        numberOfEmployee=0;
        coeSalary=0;
    }
    public employee(String maso, String hoten, float salary1, int numberOfEmployee1, float coeSalary1){
        this.maso=maso;
        this.hoten=hoten;
        salary=salary1;
        numberOfEmployee=numberOfEmployee1;
        coeSalary=coeSalary1;
    }
    public employee(employee emp){
        this.maso=emp.maso;
        this.hoten=emp.hoten;
        this.salary=emp.salary;
        this.numberOfEmployee=emp.numberOfEmployee;
        this.coeSalary=emp.coeSalary;
    }
    public void setMaSo(String maso){
        this.maso=maso;
    }
    public String getMaSo(){
        return this.maso;
    }
    public void setHoTen(String hoten){
        this.hoten=hoten;
    }
    public String getHoTen(){
        return this.hoten;
    }
    public void setSalary(float sl){
        salary = sl;
    }
    public float getSalary(){
        return salary;
    }
    public void setCoeSalary(float coesalary){
        coeSalary = coesalary;
    }
    public float getCoeSalary(){
        return coeSalary;
    }
    public void setNumOfEmployee(int num){
        numberOfEmployee = num;
    }
    public int getNumOfEmployee(){
        return numberOfEmployee;
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập vào mã số nhân viên: ");
        this.maso = sc.nextLine();
        System.out.print("\nNhập và họ tên: ");
        this.hoten = sc.nextLine();
        System.out.print("\nNhập vào lương cơ bản: ");
        salary = sc.nextFloat();
        System.out.print("\nNhập vào hệ số lương: ");
        coeSalary = sc.nextFloat();
        System.out.print("\nNhập vào số lượng nhân viên: ");
        numberOfEmployee = sc.nextInt();
        
    }
    public void output(){
        System.out.print("\nMã số nhân viên: "+this.maso);
        System.out.print("\nHọ tên nhân viên: "+this.hoten);
        System.out.print("\nLương cơ bản: "+salary);
        System.out.print("\nHệ số lương: "+coeSalary);
    }
    public double payRoll(){
        double payRoll=0;
        payRoll = salary*coeSalary;
        return payRoll; 
    }
    static void numOfEmployee(){
        System.out.print("Số lượng nhân viên: "+numberOfEmployee);
    }
}
public class Bai4_T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float coeSalaryMax;
        String newName;
        //Tạo đối tượng sinh viên bằng cách 1
        employee emp = new employee();
        emp.input();
        emp.output();
        System.out.print("\nLương nhận được: "+emp.payRoll());
        
        System.out.print("\nNhập vào tên mới cho nhân viên: ");
        newName = sc.nextLine();
        emp.setHoTen(newName);
        System.out.println("\n___Nhân viên được sau khi được đổi tên___ ");
        emp.output();
        coeSalaryMax = emp.getCoeSalary();
        employee emptemp = new employee(emp);
        System.out.print("\nTest: "+coeSalaryMax);
        //Tạo đối tượng sinh viên bằng cách 2
        employee emp1 = new employee("B", "Tu", (float)150000.0, (int)5,(float)1.2);
        //Tạo dối tượng sinh viên bằng cách 3
        emp1.output();
        employee emp2 = new employee(emp); //Giống với nhân viên 1 

        if(coeSalaryMax <= emp1.getCoeSalary()){
          coeSalaryMax = emp1.getCoeSalary();
          emptemp = emp1;
        }else if(coeSalaryMax <= emp2.getCoeSalary()){
            coeSalaryMax = emp2.getCoeSalary();
            emptemp = emp2;
        }
        System.out.println("\n___Nhân viên có hệ số lương cao nhất___");
        emptemp.output();
        sc.close();
        System.out.print("\nSố lượng nhân viên: "+emp.getNumOfEmployee());
    }
    
}