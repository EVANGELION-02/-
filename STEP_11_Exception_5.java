import java.io.*;

class MyRndException_51{
}
class MyModException_52{
}

class Get_n_5 {
	int getnum() throws MyRndException_51 {
		int n;
		
		n = (int)(Math.ramdon() *10);
		System.out.println(n);
		if(n == 0)
			throw new MyRndException_51;
		return n;
	}
}
class Get_m_5 {
	Get_n_5 gn;
	Get_m_5(Get_n_5 gn){
		this.gn = gn;
	}
	int getmod throws MyRndException_51, MyModException_52 {
		int x,y,m;
		
		x = gn.getnum();	y = gn.getnum();
		if( (m = (x%y)) == 0)
			throw MyModException_52;
		System.out.printf("<%d %d>", x, y);
		return m;
	}
}
class STEP_11_Exception_5 {
	public static void main(String[] args) {
		Get_n_5 rd = new Get_n_5();
		Get_m_5 md = new Get_m_5(rd);
		
		int m = 0;
		while(true) {
			try {
				m = md.getmod();
			//Exception은 모든 종류의 예외를 포획한다.
			} catch( Exception e) {
				//푀획한 예외는 toString으로 문자열로 바꾸고 equals를 통해 구분한다.
				if(e.toString.equals("MyRndException_51"))
					System.out.println("MyRndException_51");
				else if(e.toString.equals("MyModException_52");
					Systme.out.println("MyModException_52");
				break;
			}
			System.out.println("-->" + m);
		}
		System.out.println("Stop...");
	}
}
		