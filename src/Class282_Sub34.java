public class Class282_Sub34 extends Node {

	public int anInt7853;
	int anInt7852;

	Class282_Sub34(int i_1, int i_2) {
		this.anInt7853 = i_1;
		this.anInt7852 = i_2;
	}

	static final void decodePlayerUpdate(RsBitsBuffer rsbitsbuffer_0, int i_1) {
		Class197.anInt2434 = 0;
		LoadingStage.decodeUpdate(rsbitsbuffer_0);
		PingRequester.decodeMasks(rsbitsbuffer_0);
		if (rsbitsbuffer_0.index != i_1) {
			throw new RuntimeException(rsbitsbuffer_0.index + " " + i_1);
		}
	}

}
