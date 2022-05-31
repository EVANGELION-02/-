import java.io.*;

class MyIOException_91 extends Exception{
}
class Get_n_9 {
	//자바 내장 함수인 System.in.read()에 IOException을 투척했다.
	int getnum() throws MyIOException_91, IOException {
		int n;
		while(true) {
			n = System.in.read();
			if(n =='\n') continue;
			if(n < '0' || n > '9') throw new MyIOException_91();
			return n-'0';
		}
	}
}
class Get_m_9 {
	Get_n_9 gn;
	Get_m_9(Get_n_9 gn) {
		this.gn = gn;
	}
	int getmod() {
		int x,y,m;
		
		x=gn.getnum();	y=gn.getnum();
		m=(x%y);
		System.out.printf("<%d %d>", x, y);
		return m;
	}
}
class STEP_11_Exception_9 {
	public static void main(String[] args) {
		int m;
		Get_n_9 rd = new Get_n_9();
		Get_m_9 md = new Get_m_9(rd);
		while(true) {
			try{
				m = md.getmod();
			} catch(MyIOException_91 e) {
				System.out.println(e.toString());
				break;
			} catch( IOException e) {
				System.out.println(e.toString());
				break;
			}
			/*위에서 투척한 예외 말고도 JVM에 의해 투척되는
			예외들이 있다. 이런 예외를 포획해 printStackTrace
			로 어디에서 예외가 투척되는지 알아낸다. */ 
			catch( Exception e) {
				System.out.println(e.toString());
				//printStackTrace는 어디에서 오류가 났는지 알려준다.
				e.printStackTrace();
				break;
			}
			System.out.println("-->" + m);
		}
		System.out.println("Stop...");
	}
}