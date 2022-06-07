package qlnv;

public class Employee {
	private int STT;
	private String Manv,Tennv,Chucvu,Date,Gt,SDT,Email;
	private int Luong;
	
	public Employee() {}
//	public Employee(String Tennv,String Manv,String Chucvu,String Date,String Gt,String SDT,String Email,int Luong) {
//		this.Tennv=Tennv;
//		this.Manv=Manv;
//		this.Chucvu=Chucvu;
//		this.Gt=Gt;
//		this.Date=Date;
//		this.SDT=SDT;
//		this.Email=Email;
//		this.Luong=Luong;
//	}
	public Employee(int STT,String Tennv,String Manv,String Chucvu,String Date,String Gt,String SDT,String Email,int Luong) {
		this.STT=STT;
		this.Tennv=Tennv;
		this.Manv=Manv;
		this.Chucvu=Chucvu;
		this.Gt=Gt;
		this.Date=Date;
		this.SDT=SDT;
		this.Email=Email;
		this.Luong=Luong;
	}
	public int getSTT() {
		return STT;
	}
	public void setSTT(int STT) {
		this.STT=STT;
	}
	public String getTennv() {
		return Tennv;
	}
	public void setTennv(String Tennv) {
		this.Tennv=Tennv;
	}
	public String getManv() {
		return Manv;
	}
	public void setManv(String Manv) {
		this.Manv=Manv;
	}
	public String getChucvu() {
		return Chucvu;
	}
	public void setChucvu(String Chucvu) {
		this.Chucvu=Chucvu;
	}
	public String getGt() {
		return Gt;
	}
	public void setGt(String Gt) {
		this.Gt=Gt;
	}
	public String getDate() {
		return Date;
	}  
	public void setDate(String Date) {
		this.Date=Date;
	}
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String SDT) {
		this.SDT=SDT;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email=Email;
	}
	public int getLuong() {
		return Luong;
	}
	public void setLuong(int Luong) {
		this.Luong=Luong;
	}
	
	
	
	
}
