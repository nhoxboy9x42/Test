import java.util.*;
class HOCSINH1{
		private String maso;
		private String hoten;
		private float dtb;
		void setMaSo(String ms){
			this.maso = ms;
		}
		String getMaSo(){
			return this.maso;
		}
		void setHoTen(String ht){
			this.hoten = ht;
		}
		String getHoTen(){
			return this.hoten;
		}
		void setDTB(float dtb){
			this.dtb=dtb;
		}
		float getDTB(){
			return this.dtb;
		}
		void input(){
			Scanner sc = new Scanner(System.in);
			System.out.print("Nhap vao ma so: ");
			this.maso = sc.nextLine();
			System.out.print("Nhap vao ho ten: ");
			this.hoten = sc.nextLine();
			System.out.print("Nhap vao diem trung binh: ");
			this.dtb = sc.nextFloat();
		}
		void output(){
			System.out.println("Ma so sinh vien: "+this.maso);
			System.out.println("Ho ten sinh vien: "+this.hoten);
			System.out.println("Diem trung binh sinh vien: "+this.dtb);
		}
		/*void rank(){
			if(this.dtb >= 9){
				System.out.println("Xep loai xuat sac");	
			}else if(this.dtb >=8){
				System.out.println("Xep loai gioi");
			}else if(this.dtb >=7){
				System.out.println("Xep loai kha");
			}else if(this.dtb >=5){
				System.out.println("Xep loai trung binh");
			}else{
				System.out.println("Xep loai yeu");
			}
		}*/
	}
/*===================================================
	Tạo một danh sách học sinh
*/
class DSHOCSINH{
	private HOCSINH1 hs[];
	private int soluong;
	public void nhapds(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so luong sinh vien: ");
		soluong = sc.nextInt();
		hs = new HOCSINH1[soluong];
		for(int i =0;i<soluong;i++){
			System.out.println("___Nhap vao sinh vien thu "+(i+1)+"___");
			hs[i]= new HOCSINH1();
			hs[i].input();
		}
	}
	public void xuatds(){
		for(int i = 0;i<soluong;i++){
			hs[i].output();
		}
	}
	public void sortAvg(){
		System.out.println("___Danh sách học sinh được sắp xếp theo điểm trung bình___");
		for (int i = 0; i < hs.length-1; i++) {
			for (int j = i+1; j < hs.length; j++) {
				if(hs[i].getDTB() < hs[j].getDTB()){
					HOCSINH1 temp = new HOCSINH1();
					temp = hs[i];
					hs[i]=hs[j];
					hs[j] = temp;
				}
			}
		}
		xuatds();
	}
}
//====================================================

public class Bai1_T2{
	public static void main (String[] args) {
		DSHOCSINH ds = new DSHOCSINH();
		ds.nhapds();
		System.out.println("_____Danh sach hoc sinh vua nhap_____");
		ds.xuatds();
		ds.sortAvg();
		
	}
}