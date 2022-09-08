


public class Main {

	public static void main(String[] args) {
		Department phongbanNV = new Department();
		phongbanNV.DepartmentID = 1;
		phongbanNV.DepartmentName = "Nhan Vien";
		
		Department phongbanMK = new Department();
		phongbanMK.DepartmentID = 2;
		phongbanMK.DepartmentName = "Maketing";
		
		Department phongbanSale = new Department();
		phongbanSale.DepartmentID = 3;
		phongbanSale.DepartmentName = " Sale ";
		
		System.out.println("id của phòng ban : "+ phongbanMK.DepartmentID);
		System.out.println("Tên của phòng ban : "+ phongbanMK.DepartmentName);
		System.out.println("id của phòng ban : "+ phongbanSale.DepartmentID);
		System.out.println("Tên của phòng ban : "+ phongbanSale.DepartmentName);
	    
	   Position ViTri = new Position();
	   ViTri.PositionID = 1;
	   ViTri.PositionName = " Dev ";
	   
	   Position Vitri1 = new Position();
	   Vitri1.PositionID = 2;
	   Vitri1.PositionName = " Test ";
	   
	   Position Vitri2 = new Position();
	   Vitri2.PositionID = 3;
	   Vitri2.PositionName = " Scrum Master ";
	   
	   
	   
	   String Vtri = "Id  Vi tri:" +  ViTri.PositionID;
	   String Vtri1 = "Id  vi tri :"  + Vitri1.PositionID;
	   String Vtri2 = "Ten vi tri :" + ViTri.PositionName;
	   String Vtri3 = "Ten vi tri :" + Vitri1.PositionName;
	   
	   System.out.println(Vtri);
	   System.out.println(Vtri1);
	   System.out.println(Vtri2);
	   System.out.println(Vtri3);
	   
	   String[]  emailArray = {"ssongson27032001@gamil.com", "Sonssphuong2kk1@gmail.com"};
	   
	   Account Taikhoan1 = new Account();
	   Taikhoan1.AccountID = 1;
	   Taikhoan1.Email =  emailArray;
	   Taikhoan1.Department = phongbanNV;
	   Taikhoan1.FullName = "Nguyen Hong Son";
	   Taikhoan1.positon =  ViTri;
	   Taikhoan1.Username = "sonhong";
	 
	   
	   Account Taikhoan2 = new Account();
	   Taikhoan2.AccountID = 2;
	   Taikhoan2.Email =  emailArray;
	   Taikhoan2.Department = phongbanMK;
	   Taikhoan2.FullName = "Nguyen Xuan Loc";
	   Taikhoan2.positon =  Vitri1;
	   Taikhoan2.Username = "xuanloc";
	  
	   
	
	  
	   System.out.println(Taikhoan1.positon.PositionName);
	   System.out.println("Tên TK : " + Taikhoan2.FullName);
	}
	
}
