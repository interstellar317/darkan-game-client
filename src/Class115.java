public abstract class Class115 implements Interface7 {

	protected String aString1244;
	protected String aString1246;
	public static int anInt1247;
	static NativeSprite[] aClass160Array1248;
	static int anInt1249;
	protected String aString1245 = null;

	abstract void method1891(Class282_Sub21_Sub1 var1, Matrix44Arr var2);

	String method1892(byte b_1) {
		return this.aString1245;
	}

	abstract void method1893(int var1, float var2, float var3, float var4);

	abstract void method1894(Class282_Sub21_Sub1 var1, float var2);

	abstract void method1895(int var1, float var2, float var3, float var4, float var5);

	abstract void method1896(Class282_Sub21_Sub1 var1, int var2, Interface30 var3);

	abstract void method1897(Class282_Sub21_Sub1 var1, float var2, float var3, float var4, float var5);

	public abstract boolean method1898();

	public abstract boolean method1899();

	abstract void method1900(int var1, Matrix44Arr var2);

	abstract void method1901(Class282_Sub21_Sub1 var1, float var2, float var3, float var4, float var5);

	abstract void method1902(int var1, Matrix44Arr var2);

	abstract void method1903(Class282_Sub21_Sub1 var1, float[] var2, int var3);

	abstract void method1904(int var1, float[] var2, int var3);

	abstract void method1905(int var1, Matrix44Arr var2);

	abstract void method1906(int var1, Matrix44Arr var2);

	abstract void method1907(int var1, float var2, float var3, float var4, float var5);

	abstract void method1908(int var1, int var2, Interface30 var3);

	abstract void method1910(int var1, Matrix44Arr var2);

	public abstract boolean method1911();

	abstract void method1912(Class282_Sub21_Sub1 var1, float var2);

	abstract void method1913(Class282_Sub21_Sub1 var1, float var2, float var3);

	abstract void method1914(Class282_Sub21_Sub1 var1, float var2, float var3, float var4);

	abstract void method1915(Class282_Sub21_Sub1 var1, float var2, float var3, float var4);

	abstract void method1916(Class282_Sub21_Sub1 var1, float var2, float var3, float var4);

	abstract void method1917(Class282_Sub21_Sub1 var1, float var2, float var3, float var4, float var5);

	abstract void method1918(Class282_Sub21_Sub1 var1, float[] var2, int var3);

	abstract void method1919(Class282_Sub21_Sub1 var1, float[] var2, int var3);

	abstract void method1920(Class282_Sub21_Sub1 var1, float var2, float var3, float var4, float var5);

	abstract void method1921(Class282_Sub21_Sub1 var1, float[] var2, int var3);

	abstract void method1922(int var1, Matrix44Arr var2);

	abstract void method1923(Class282_Sub21_Sub1 var1, float var2, float var3);

	abstract void method1924(Class282_Sub21_Sub1 var1, Matrix44Arr var2);

	abstract void method1925(Class282_Sub21_Sub1 var1, Matrix44Arr var2);

	abstract void method1926(Class282_Sub21_Sub1 var1, Matrix44Arr var2);

	abstract void method1927(Class282_Sub21_Sub1 var1, Matrix44Arr var2);

	abstract void method1928(Class282_Sub21_Sub1 var1, int var2, Interface30 var3);

	abstract void method1929(Class282_Sub21_Sub1 var1, int var2, Interface30 var3);

	abstract void method1930(Class282_Sub21_Sub1 var1, int var2, Interface30 var3);

	abstract void method1931(int var1, float var2, float var3, float var4);

	abstract void method1932(int var1, float var2, float var3, float var4, float var5);

	abstract void method1933(int var1, float var2, float var3, float var4, float var5);

	abstract void method1934(int var1, float var2, float var3, float var4, float var5);

	abstract void method1935(int var1, float var2, float var3, float var4, float var5);

	abstract void method1936(Class282_Sub21_Sub1 var1, Matrix44Arr var2);

	abstract void method1937(int var1, float[] var2, int var3);

	abstract void method1938(int var1, float[] var2, int var3);

	abstract void method1939(Class282_Sub21_Sub1 var1, float var2, float var3, float var4);

	abstract void method1940(int var1, Matrix44Arr var2);

	abstract void method1941(Class282_Sub21_Sub1 var1, float var2, float var3, float var4, float var5);

	abstract void method1942(int var1, Matrix44Arr var2);

	abstract void method1943(int var1, Matrix44Arr var2);

	abstract void method1944(Class282_Sub21_Sub1 var1, float[] var2, int var3);

	abstract void method1945(int var1, int var2, Interface30 var3);

	abstract void method1946(int var1, int var2, Interface30 var3);

	abstract void method1947(int var1, int var2, Interface30 var3);

	abstract void method1948(int var1, int var2, Interface30 var3);

	static final void method1949(CS2Executor cs2executor_0) {
		ClassSomet underlaydefinition_2 = cs2executor_0.aBool7022 ? cs2executor_0.aClass513_6994 : cs2executor_0.aClass513_7007;
		IComponentDefinitions icomponentdefinitions_3 = underlaydefinition_2.aClass118_5886;
		Interface interface_4 = underlaydefinition_2.aClass98_5885;
		Class17.method569(icomponentdefinitions_3, interface_4, cs2executor_0, 2101137019);
	}

	public static boolean method1950(CharSequence charsequence_0, int i_1) {
		return Class272.method4841(charsequence_0, 10, true, 547705693);
	}

	static final void method1951(CS2Executor cs2executor_0, byte b_1) {
		int i_2 = cs2executor_0.intStack[--cs2executor_0.intStackPtr];
		int i_3 = client.aClass330Array7428[i_2].method5908(-1286970996);
		cs2executor_0.intStack[++cs2executor_0.intStackPtr - 1] = i_3 == 5 ? 1 : 0;
	}

	public static boolean method1952(boolean bool_0, int i_1) {
		boolean bool_2 = Renderers.SOFTWARE_RENDERER.method8471();
		if (bool_0 != bool_2) {
			if (bool_0) {
				if (!Renderers.SOFTWARE_RENDERER.method8469()) {
					bool_0 = false;
				}
			} else {
				Renderers.SOFTWARE_RENDERER.method8490();
			}

			if (bool_0 != bool_2) {
				Class393.preferences.setValue(Class393.preferences.aClass468_Sub12_8195, bool_0 ? 1 : 0, -2016706726);
				Class190.savePreferences((byte) 111);
				return true;
			} else {
				return false;
			}
		} else {
			return true;
		}
	}

}
