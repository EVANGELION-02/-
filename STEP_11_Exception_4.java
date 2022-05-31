import java.io.*;

class MyRndException_41 extends Exception{
}
class MyModException_42 extends Exception{
}

class Get_n_4 {
	/*해당 메소드에서 예외 처리를 하지 않을 경우
	  throws를 통해 토스할 예외 명시한다. */	
	 int getnum() throws MyRndException_41 {
		int n;
		
		n = (int)(Math.random() * 10);
		System.out.println(n);
		
		if(n == 0)
			throw new MyRndException_41();
		return n;
	}
}
class Get_m_4 {
	Get_n_4 gn;
	
	Get_m_4(Get_n_4 gn) {
		this.gn = gn;
	}
	//앞에서 토스한 예외를 처리하지 않으면 모두 명시해야 한다.
	int getmod() throws MyRndException_41, MyModException_42 {
		int x,y,m;
		
		x = gn.getnum();	y = gn.getnum();
	
		if( (m = (x%y)) == 0)
			throw new MyModException_42;
		System.out.printf("<%d %d>", x, y);
		return m;
	}
}
class STEP_11_Exception_4 {
	public static void main(String[] args) {
		Get_n_4 rd = new Get_n_4();
		Get_m_4 md = new Get_m_4(rd);
		int m;
		
		while(true) {
			try {
				m = md.getmod();
			} catch( MyRndException_41 e) {
				System.out.println("MyRndException_41");
				break;
			} catch( MyModException_42 e) {
				System.out.println("MyModException_42");
				break;
			}
			System.out.printf("-->" + m);
		}
		System.out.println("Stop...");
	}
}