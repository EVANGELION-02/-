class Type_1 {
	void type_test() {
		/*기본 데이터 타입은 클래스를 형성하는 주위
		껍질이 없고, 오로지 해당 값의 비트 패턴을
		저장하기 위한 공간만을 즉시 할당 받는다.*/
		boolean bl = false;
		byte bt = 65;
		short st = 0x41;
		char ch = 'A';
		int it = 0101;
		long lg = 'B' - 1;
		float ft = le-2f;
		double db = 0.01;
	}
	/*여기서 byte와 char를 보면 크기는 2바이트로 같지만
	값의 범위로 보면 byte가 더 커서 형변환을 해야하고
	값의 최대 크기로 보면 char이 더 커서 형변환을 해야한다. */
}
public class STEP_12_Type_1{
	public static void main(String[] args) {
		Type_1 typ1 = new Type_1();
		typ1.type_test();
	}
}