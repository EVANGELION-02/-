import java.io.*;

class IO_21 {
	void io_test() {
		boolean bl = true;	byte bt = 65;
		short st = 0x42;	char ch = 'C';
		int it = 0104;		long lg = 69L;
		float ft = 1e-2f;	double db = 0.02;
	
		FileOutputStream fos = null;
		DataOutputStream dos = null;

		try {
			fos = new FileOutputStream("data.bin");
			dos = new DataOutputStream(fos);
		} catch(FileNotFoundException e) {
			System.err.println("Can't open 'data.bin' for output...");
			System.exit(1);
		}
		System.out.println("IO_21...");
		
		try {
			dos.writeBoolean(bl);	dos.writeByte(bt);
			dos.writeShort(st);		dos.writeChar(ch);
			dos.writeInt(it);		dos.writeLong(lg);
			dos.writeFloat(ft);		dos.writeDouble(db);
		} catch (IOException e) {
			System.out.println("Data write error...");
			System.exit(2);
		}
	}
}
class IO_22 {
	void io_test() {
		boolean bl;	byte bt;
		short st;	char ch;
		int it;		long lg;
		float ft;	double db;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
	
		try {
			fis = new FileInputStream("data.bin");
			dis = new DataInputStream(fis);
		} catch(FileNotFoundException e) {
			System.err.println("Can't open 'data.bin' for input...");
			System.exit(1);
		}
		System.out.println("IO_22...");
		
		try {
			bl=dis.readBoolean();	bt=dis.readByte();
			st=dis.readShort();		ch=dis.readChar();
			it=dis.readInt();		lg=dis.readLong();
			ft=dis.readFloat();		db=dis.readDouble();
			System.out.printf("%s, %d, %d, %c, %d, %d, %f, %f", bl, bt, st, ch, it, lg, ft, db);
		} catch(IOException e) {
			System.out.println("Data read error...");
			System.exit(2);
		}
	}
}
public class STEP_15_IO_2 {
	public static void main(String[] args) {
		new IO_21().io_test();
		new IO_22().io_test();
	}
}