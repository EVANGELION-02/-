import java.io.*;

class IO_11 {
	void io_test() {
		int b1 = 0x01, b2 = 0x02, b3 = 0x03;
		byte[] bs = {'A', 'B', 'C'};

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("data.bin");
		} catch (FileNotFoundException e) {
			System.err.println("Can't open 'data.bin' for output");
			System.exit(1);
		}
		System.out.println("IO_11...");
		try {
			fos.write(b1); fos.write(b2); fos.write(b3); fos.write(bs);
		} catch (IOException e) {
			System.err.println("File write error...");
			System.exit(2);
		}
	}
}
class IO_12 {
	void io_test() {
		int b1, b2, b3, n;
		byte[] bs = new byte[3];
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("data.bin");
		} catch (FileNotFoundException e) {
			System.err.println("Can't open 'data.bin' for input...");
			System.exit(1);
		}
		System.out.println("IO_22...");
		try {
			b1 = fis.read(); b2 = fis.read(); b3 = fis.read();
			n = fis.read(bs);
			System.out.printf("%02x, %02x, %02x, %02x, %02x, %02x\n", b1,b2,b3,
				(int)bs[0], (int)bs[1], (int)bs[2]);
		} catch ( IOException e) {
			System.err.println("File read error...");
			System.exit(2);
		}
	}
}
public  class STEP_15_IO_1 {
	public static void main(String[] args) {
		new IO_11().io_test();
		new IO_12().io_test();
	}
}