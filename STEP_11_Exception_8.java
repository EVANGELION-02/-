class STEP_11_Exception_8 {
	public static void main(String[] args) {
		Get_n_8 rd = new Get_n_8();
		Get_m_8 md = new Get_m_8(rd);
		int Flag =0, i, m=0;

		while(true) {
			Flag = 1;
			
			try {
				m = md.getmod();
			} catch( MyRndException_81 e) {
				System.out.println("MyRndException_81");
				break;
			} catch( MyModException_82 e) {
				System.out.println("MyModException_82");
				break;
			} finally {
				/*예외 처리가 일어나도 finally이 실행되고 처리가
				되니 Flag=0으로 자원을 반납하고 break이 처리 된다. */
				Flag = 0;
			}
			System.out.println("-->" + m);
		}
		System.out.println("Stop...Flag=" + Flag);
	}
}