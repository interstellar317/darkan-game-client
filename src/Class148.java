public class Class148 {

	static Index aClass317_1731;

	static Index aClass317_1732;

	static Node_Sub15_Sub2 aNode_Sub15_Sub2_1735;

	static Index aClass317_1737;

	static int anInt1738;

	static long aLong1740;

	static int anInt1730 = 0;

	Class148() throws Throwable {
		throw new Error();
	}

	public static String method2550(int i_0) {
		Node_Sub37 class282_sub37_2 = (Node_Sub37) Class492.aClass465_5774.get((long) i_0);
		if (class282_sub37_2 != null) {
			Node_Sub41_Sub2 class282_sub41_sub2_3 = class282_sub37_2.aClass278_Sub1_8001.method4935();
			if (class282_sub41_sub2_3 != null) {
				double d_4 = class282_sub37_2.aClass278_Sub1_8001.method4923(1997080101);
				if ((double) class282_sub41_sub2_3.method14702() <= d_4 && (double) class282_sub41_sub2_3.method14705((byte) 5) >= d_4) {
					return class282_sub41_sub2_3.method14704();
				}
			}
		}
		return null;
	}

	public static RouteStrategy method2551(int i_0, int i_1, SceneObjectType sceneobjecttype_4, int i_5) {
		Class224.aRouteStrategy_Sub5_2775.approxDestinationX = i_0;
		Class224.aRouteStrategy_Sub5_2775.approxDestinationY = i_1;
		Class224.aRouteStrategy_Sub5_2775.approxDestinationSizeX = 0;
		Class224.aRouteStrategy_Sub5_2775.approxDestinationSizeY = 0;
		Class224.aRouteStrategy_Sub5_2775.aClass458_7972 = sceneobjecttype_4;
		Class224.aRouteStrategy_Sub5_2775.anInt7971 = i_5;
		return Class224.aRouteStrategy_Sub5_2775;
	}

	static Class method2553(String string_0, short s_1) throws ClassNotFoundException {
		return string_0.equals("B") ? Byte.TYPE : (string_0.equals("I") ? Integer.TYPE : (string_0.equals("S") ? Short.TYPE : (string_0.equals("J") ? Long.TYPE : (string_0.equals("Z") ? Boolean.TYPE : (string_0.equals("F") ? Float.TYPE : (string_0.equals("D") ? Double.TYPE : (string_0.equals("C") ? Character.TYPE : (string_0.equals("void") ? Void.TYPE : Class.forName(string_0)))))))));
	}
}
