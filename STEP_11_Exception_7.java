class STEP_11_Exception_7 {
	public static void main(String[] args) {
		Get_n_7 rd = new Get_n_7();
		Get_m_7 md = new Get_m_7(rd);
		
		int Flag=0, i, m=0;

		for(i = 0; i<3; i++) {
			//Flag=1은 작업을 위해 자원을 획득한 상태를 의미한다.
			Flag = 1;
			try {
				m = md.getmod();
			} catch( MyRndException_71 e) {
				System.out.println("MyRndException_71");
				break;
			} catch( MyModException_72 e) {
				System.out.println("MyModException_72");
				break;
			}
			/*하지만 예외로 인해 Flag=0을 하지 못하면 
			획득한 자원을 반납하지 않게된다. 이런 문제를
			해결하기 위해 finally 예외 처리 공통 구문이 필요하다. */
			Flag = 0;
			System.out.println("-->" + m);
		}
		System.out.println("Stop...Flag=" + Flag);
	}
}