import java.io.*;
//Exception을 상속받아 고유 명칭으로 예외 클래스를 생성한다.
class MyRndException_21 extends Exception {
}
class MyModException_22 extends Exception {
}

class Get_n_2 {
	int getnum() {
		int n;
		//예외 객체를 생성해 throw하면 try{} catch{}로 투척한 예외를 포획한다.
		try {
			n = (int)(Math.random() * 10);
			System.out.println(n);
			if(n == 0) 
				throw new MyRndException_21();
		} catch (MyRndException_21 e) {
			System.out.println("MyRndException_21");
			return -1;
		}
		return n;
	}
}
class Get_m_2 {
	Get_n_2 gn;
	
	Get_m_2(Get_n_2 gn) {
		this.gn = gn;
	}
	int getmod() {
		int x,y,m;
		
		try {
			//예로 x,y가 0이하거나 m이 0이면 예외 객체를 생성해 투척한다.
			if (( x = gn.getnum()) < 0 || (y = gn.getnum()) < 0 || (m =( x%y)) == 0)
				throw new MyModException_22();
		//catch로 예외를 포획해 오류를 체크한다.
		} catch (MyModException_22 e) {
			System.out.println("MyModException_22");
			return -1;
		}
		System.out.println("<%d %d>", x, y);
		return m;
	}
}
class STEP_11_Exception_2 {
	public static void main(String[] args) {
		Get_n_2 rd = new Get_n_2();
		Get_m_2 md = new Get_m_2(rd);
		int m;
		
		while(true) {
			if( (m = md.getmod()) < 0)
				break;
			System.out.println("-->" + m);
		}
		System.out.println("Stop...");
	}
}