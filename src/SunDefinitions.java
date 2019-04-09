import java.io.IOException;
import java.net.Socket;

public class SunDefinitions {

	public int anInt396 = 8;
	public boolean aBool400;
	public int anInt401;
	public int anInt397;
	public int anInt399;
	public int anInt395;
	public int anInt402;
	public int anInt404 = 16777215;
	public int anInt403;
	public int anInt398;
	public int anInt405;

	void method843(RsByteBuffer stream, int opcode) {
		if (opcode == 1) {
			this.anInt396 = stream.readUnsignedShort();
		} else if (opcode == 2) {
			this.aBool400 = true;
		} else if (opcode == 3) {
			this.anInt401 = stream.readShort();
			this.anInt397 = stream.readShort();
			this.anInt399 = stream.readShort();
		} else if (opcode == 4) {
			this.anInt395 = stream.readUnsignedByte();
		} else if (opcode == 5) {
			this.anInt402 = stream.readBigSmart();
		} else if (opcode == 6) {
			this.anInt404 = stream.read24BitUnsignedInteger();
		} else if (opcode == 7) {
			this.anInt403 = stream.readShort();
			this.anInt398 = stream.readShort();
			this.anInt405 = stream.readShort();
		}
	}

	void method850(RsByteBuffer rsbytebuffer_1) {
		while (true) {
			int i_3 = rsbytebuffer_1.readUnsignedByte();
			if (i_3 == 0) {
				return;
			}
			this.method843(rsbytebuffer_1, i_3);
		}
	}

	static void method851(int i_0) {
		Class180.anInt2246 = i_0;
		Class180.aClass229_2245.method3859(1791836497);
	}

	public static Connection createAsyncConnection(Socket socket_0, int i_1, int i_2) throws IOException {
		return new Class202_Sub1(socket_0, i_1);
	}

	public static RouteStrategy method853(int i_0, int i_1, int i_2) {
		Class224.aClass225_Sub1_2776.approxDestinationX = i_0;
		Class224.aClass225_Sub1_2776.approxDestinationY = i_1;
		Class224.aClass225_Sub1_2776.approxDestinationSizeX = 1;
		Class224.aClass225_Sub1_2776.approxDestinationSizeY = 1;
		return Class224.aClass225_Sub1_2776;
	}

	public static void method854(boolean bool_0, boolean bool_1, int i_2) {
		if (bool_0) {
			++Class540.anInt7137;
			Class371.method6351();
		}
		if (bool_1) {
			++Class540.anInt7135;
			Class77.method1365();
		}
	}

	static void method857(GraphicalRenderer graphicalrenderer_0) {
		int i_2 = Class301.anInt3555;
		int i_3 = BufferedConnectionContext.anInt2300;
		int i_4 = Class158_Sub2.anInt8975;
		int i_5 = Class110.anInt1104 - 3;
		byte b_6 = 20;
		if (Class186.aClass8_2348 == null || Class176.aClass414_2200 == null) {
			Class186.aClass8_2348 = (FontRenderer) Class487.aClass378_5752.method6426(client.anInterface35_7206, QuestIndexLoader.anInt2982, true, true, -2144080048);
			Class176.aClass414_2200 = Class487.aClass378_5752.method6415(client.anInterface35_7206, QuestIndexLoader.anInt2982, -1588148414);
			if (Class186.aClass8_2348 != null && Class176.aClass414_2200 != null) {
				Class316.method5594();
				int i_15 = i_4 / 2 + i_2;
				if (i_15 + i_4 > Class349.anInt4083) {
					i_15 = Class349.anInt4083 - i_4;
				}
				if (i_15 < 0) {
					i_15 = 0;
				}
				NativeLibraryLoader.method4653(i_15, BufferedConnectionContext.anInt2300, 1505177278);
				return;
			}
		}
		FontRenderer fontrenderer_7;
		if (Class186.aClass8_2348 != null && Class176.aClass414_2200 != null) {
			fontrenderer_7 = Class186.aClass8_2348;
		} else {
			fontrenderer_7 = Class285.aClass8_3394;
		}
		FontMetrics fontmetrics_8 = Class114.method1887(-864314974);
		Class456_Sub2.method12680(graphicalrenderer_0, Class301.anInt3555, BufferedConnectionContext.anInt2300, Class158_Sub2.anInt8975, Class110.anInt1104, b_6, fontrenderer_7, fontmetrics_8, Message.CHOOSE_OPTION.translate(Class223.CURRENT_LANGUAGE, -827597083));
		int i_9 = 255 - Class182.anInt2262 - Class20.anInt156;
		if (i_9 < 0) {
			i_9 = 0;
		}
		int i_10 = Class163.mouseRecorder.method3569(2129837373);
		int i_11 = Class163.mouseRecorder.method3570();
		int i_12;
		Class282_Sub50_Sub7 class282_sub50_sub7_13;
		int i_14;
		Class282_Sub50_Sub15 class282_sub50_sub15_16;
		if (!Class20.aBool162) {
			i_12 = 0;
			for (class282_sub50_sub7_13 = (Class282_Sub50_Sub7) Class20.aClass482_171.head((byte) 108); class282_sub50_sub7_13 != null; class282_sub50_sub7_13 = (Class282_Sub50_Sub7) Class20.aClass482_171.next(-573495848)) {
				i_14 = i_3 + b_6 + (Class20.anInt169 - 1 - i_12) * Class20.anInt178 + fontmetrics_8.anInt4978 + 1;
				if (i_10 > Class301.anInt3555 && i_10 < Class301.anInt3555 + Class158_Sub2.anInt8975 && i_11 > i_14 - fontmetrics_8.anInt4978 - 1 && i_11 < i_14 + fontmetrics_8.anInt4979 && class282_sub50_sub7_13.aBool9583) {
					graphicalrenderer_0.B(Class301.anInt3555, i_14 - fontmetrics_8.anInt4978, Class158_Sub2.anInt8975, Class20.anInt178, i_9 << 24 | Class20.anInt188, 1);
				}
				++i_12;
			}
		} else {
			i_12 = 0;
			for (class282_sub50_sub15_16 = (Class282_Sub50_Sub15) Class20.aClass477_182.method7941(); class282_sub50_sub15_16 != null; class282_sub50_sub15_16 = (Class282_Sub50_Sub15) Class20.aClass477_182.method7955(-2089129686)) {
				i_14 = i_3 + b_6 + i_12 * Class20.anInt178 + fontmetrics_8.anInt4978 + 1;
				if (i_10 > Class301.anInt3555 && i_10 < Class158_Sub2.anInt8975 + Class301.anInt3555 && i_11 > i_14 - fontmetrics_8.anInt4978 - 1 && i_11 < i_14 + fontmetrics_8.anInt4979 && (class282_sub50_sub15_16.anInt9769 > 1 || ((Class282_Sub50_Sub7) class282_sub50_sub15_16.aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119).aBool9583)) {
					graphicalrenderer_0.B(Class301.anInt3555, i_14 - fontmetrics_8.anInt4978, Class158_Sub2.anInt8975, Class20.anInt178, i_9 << 24 | Class20.anInt188, 1);
				}
				++i_12;
			}
			if (Class20.aClass282_Sub50_Sub15_163 != null) {
				Class456_Sub2.method12680(graphicalrenderer_0, Class341.anInt3996, Class282_Sub50_Sub2.anInt9471, Class96_Sub3.anInt8518, Class521_Sub1_Sub5_Sub1.anInt10526, b_6, fontrenderer_7, fontmetrics_8, Class20.aClass282_Sub50_Sub15_163.aString9771);
				i_12 = 0;
				for (class282_sub50_sub7_13 = (Class282_Sub50_Sub7) Class20.aClass282_Sub50_Sub15_163.aClass477_9770.method7941(); class282_sub50_sub7_13 != null; class282_sub50_sub7_13 = (Class282_Sub50_Sub7) Class20.aClass282_Sub50_Sub15_163.aClass477_9770.method7955(-889659924)) {
					i_14 = b_6 + i_12 * Class20.anInt178 + fontmetrics_8.anInt4978 + Class282_Sub50_Sub2.anInt9471 + 1;
					if (i_10 > Class341.anInt3996 && i_10 < Class96_Sub3.anInt8518 + Class341.anInt3996 && i_11 > i_14 - fontmetrics_8.anInt4978 - 1 && i_11 < i_14 + fontmetrics_8.anInt4979 && class282_sub50_sub7_13.aBool9583) {
						graphicalrenderer_0.B(Class341.anInt3996, i_14 - fontmetrics_8.anInt4978, Class96_Sub3.anInt8518, Class20.anInt178, i_9 << 24 | Class20.anInt188, 1);
					}
					++i_12;
				}
				Class487.method8209(graphicalrenderer_0, Class341.anInt3996, Class282_Sub50_Sub2.anInt9471, Class96_Sub3.anInt8518, Class521_Sub1_Sub5_Sub1.anInt10526, b_6, (byte) 61);
			}
		}
		Class487.method8209(graphicalrenderer_0, Class301.anInt3555, BufferedConnectionContext.anInt2300, Class158_Sub2.anInt8975, Class110.anInt1104, b_6, (byte) -15);
		if (!Class20.aBool162) {
			i_12 = 0;
			for (class282_sub50_sub7_13 = (Class282_Sub50_Sub7) Class20.aClass482_171.head((byte) 123); class282_sub50_sub7_13 != null; class282_sub50_sub7_13 = (Class282_Sub50_Sub7) Class20.aClass482_171.next(-668033309)) {
				i_14 = i_3 + b_6 + (Class20.anInt169 - 1 - i_12) * Class20.anInt178 + fontmetrics_8.anInt4978 + 1;
				Class282_Sub25.method12400(i_10, i_11, i_2, i_3, i_4, i_5, i_14, class282_sub50_sub7_13, fontrenderer_7, fontmetrics_8, Class388.anInt4722 | ~0xffffff, Class99.anInt1005 | ~0xffffff, -162491799);
				++i_12;
			}
		} else {
			i_12 = 0;
			for (class282_sub50_sub15_16 = (Class282_Sub50_Sub15) Class20.aClass477_182.method7941(); class282_sub50_sub15_16 != null; class282_sub50_sub15_16 = (Class282_Sub50_Sub15) Class20.aClass477_182.method7955(880459303)) {
				i_14 = b_6 + i_12 * Class20.anInt178 + fontmetrics_8.anInt4978 + BufferedConnectionContext.anInt2300 + 1;
				if (class282_sub50_sub15_16.anInt9769 == 1) {
					Class282_Sub25.method12400(i_10, i_11, Class301.anInt3555, BufferedConnectionContext.anInt2300, Class158_Sub2.anInt8975, Class110.anInt1104, i_14, (Class282_Sub50_Sub7) class282_sub50_sub15_16.aClass477_9770.aClass282_Sub50_5629.aClass282_Sub50_8119, fontrenderer_7, fontmetrics_8, Class388.anInt4722 | ~0xffffff, Class99.anInt1005 | ~0xffffff, -462904311);
				} else {
					Class99.method1630(i_10, i_11, Class301.anInt3555, BufferedConnectionContext.anInt2300, Class158_Sub2.anInt8975, Class110.anInt1104, i_14, class282_sub50_sub15_16, fontrenderer_7, fontmetrics_8, Class388.anInt4722 | ~0xffffff, Class99.anInt1005 | ~0xffffff, -814194841);
				}
				++i_12;
			}
			if (Class20.aClass282_Sub50_Sub15_163 != null) {
				i_12 = 0;
				for (class282_sub50_sub7_13 = (Class282_Sub50_Sub7) Class20.aClass282_Sub50_Sub15_163.aClass477_9770.method7941(); class282_sub50_sub7_13 != null; class282_sub50_sub7_13 = (Class282_Sub50_Sub7) Class20.aClass282_Sub50_Sub15_163.aClass477_9770.method7955(-2102750964)) {
					i_14 = b_6 + i_12 * Class20.anInt178 + fontmetrics_8.anInt4978 + Class282_Sub50_Sub2.anInt9471 + 1;
					Class282_Sub25.method12400(i_10, i_11, Class341.anInt3996, Class282_Sub50_Sub2.anInt9471, Class96_Sub3.anInt8518, Class521_Sub1_Sub5_Sub1.anInt10526, i_14, class282_sub50_sub7_13, fontrenderer_7, fontmetrics_8, Class388.anInt4722 | ~0xffffff, Class99.anInt1005 | ~0xffffff, 50305852);
					++i_12;
				}
			}
		}
	}

	static boolean method859(int i_0, int i_1) {
		return i_0 != 18 && i_0 != 19 && i_0 != 20 && i_0 != 21 && i_0 != 22 && i_0 != 1004 ? i_0 == 17 : true;
	}

	static void setComponentText(int i_0, String string_1) {
		PulseEvent class282_sub50_sub12_3 = PulseEvent.createPulseEvent(3, (long) i_0);
		class282_sub50_sub12_3.immediate();
		class282_sub50_sub12_3.string = string_1;
	}
}