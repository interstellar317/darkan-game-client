import jaggl.OpenGL;

public class Class141_Sub7 extends Class141 {

	boolean aBool9090 = false;
	Class138 aClass138_9088;

	void method2403(boolean bool_1) {
		Class137_Sub2 class137_sub2_2 = this.aGraphicalRenderer_Sub1_1664.method13596();
		if (this.aClass138_9088 != null && class137_sub2_2 != null && bool_1) {
			this.aClass138_9088.method2379('\u0000');
			this.aGraphicalRenderer_Sub1_1664.method13610(1);
			this.aGraphicalRenderer_Sub1_1664.method13654(class137_sub2_2);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf(this.aGraphicalRenderer_Sub1_1664.aClass384_8391.method6534(this.aGraphicalRenderer_Sub1_1664.aFloatArray8477), 0);
			OpenGL.glMatrixMode(5888);
			this.aGraphicalRenderer_Sub1_1664.method13610(0);
			this.aBool9090 = true;
		} else {
			this.aGraphicalRenderer_Sub1_1664.method13616(0, 34168);
		}

	}

	void method2402(boolean bool_1) {
		Class137_Sub2 class137_sub2_2 = this.aGraphicalRenderer_Sub1_1664.method13596();
		if (this.aClass138_9088 != null && class137_sub2_2 != null && bool_1) {
			this.aClass138_9088.method2379('\u0000');
			this.aGraphicalRenderer_Sub1_1664.method13610(1);
			this.aGraphicalRenderer_Sub1_1664.method13654(class137_sub2_2);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf(this.aGraphicalRenderer_Sub1_1664.aClass384_8391.method6534(this.aGraphicalRenderer_Sub1_1664.aFloatArray8477), 0);
			OpenGL.glMatrixMode(5888);
			this.aGraphicalRenderer_Sub1_1664.method13610(0);
			this.aBool9090 = true;
		} else {
			this.aGraphicalRenderer_Sub1_1664.method13616(0, 34168);
		}

	}

	Class141_Sub7(OpenGLGraphicalRenderer class505_sub1_1) {
		super(class505_sub1_1);
		if (class505_sub1_1.aBool8480) {
			this.aClass138_9088 = new Class138(class505_sub1_1, 2);
			this.aClass138_9088.method2380(0);
			this.aGraphicalRenderer_Sub1_1664.method13610(1);
			this.aGraphicalRenderer_Sub1_1664.method13717(34165, 7681);
			this.aGraphicalRenderer_Sub1_1664.method13595(2, 34168, 770);
			this.aGraphicalRenderer_Sub1_1664.method13616(0, 34167);
			OpenGL.glTexGeni(8192, 9472, 34066);
			OpenGL.glTexGeni(8193, 9472, 34066);
			OpenGL.glTexGeni(8194, 9472, 34066);
			OpenGL.glEnable(3168);
			OpenGL.glEnable(3169);
			OpenGL.glEnable(3170);
			this.aGraphicalRenderer_Sub1_1664.method13610(0);
			this.aClass138_9088.method2381();
			this.aClass138_9088.method2380(1);
			this.aGraphicalRenderer_Sub1_1664.method13610(1);
			this.aGraphicalRenderer_Sub1_1664.method13717(8448, 8448);
			this.aGraphicalRenderer_Sub1_1664.method13595(2, 34166, 770);
			this.aGraphicalRenderer_Sub1_1664.method13616(0, 5890);
			OpenGL.glDisable(3168);
			OpenGL.glDisable(3169);
			OpenGL.glDisable(3170);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			this.aGraphicalRenderer_Sub1_1664.method13610(0);
			this.aClass138_9088.method2381();
		}

	}

	void method2394(Class137 class137_1, int i_2) {
		this.aGraphicalRenderer_Sub1_1664.method13654(class137_1);
		this.aGraphicalRenderer_Sub1_1664.method13612(i_2);
	}

	void method2398() {
		if (this.aBool9090) {
			this.aClass138_9088.method2379('\u0001');
			this.aGraphicalRenderer_Sub1_1664.method13610(1);
			this.aGraphicalRenderer_Sub1_1664.method13654((Class137) null);
			this.aGraphicalRenderer_Sub1_1664.method13610(0);
		} else {
			this.aGraphicalRenderer_Sub1_1664.method13616(0, 5890);
		}

		this.aGraphicalRenderer_Sub1_1664.method13717(8448, 8448);
		this.aBool9090 = false;
	}

	void method2399(int i_1, int i_2) {
	}

	void method2400(Class137 class137_1, int i_2) {
		this.aGraphicalRenderer_Sub1_1664.method13654(class137_1);
		this.aGraphicalRenderer_Sub1_1664.method13612(i_2);
	}

	void method2411() {
		if (this.aBool9090) {
			this.aClass138_9088.method2379('\u0001');
			this.aGraphicalRenderer_Sub1_1664.method13610(1);
			this.aGraphicalRenderer_Sub1_1664.method13654((Class137) null);
			this.aGraphicalRenderer_Sub1_1664.method13610(0);
		} else {
			this.aGraphicalRenderer_Sub1_1664.method13616(0, 5890);
		}

		this.aGraphicalRenderer_Sub1_1664.method13717(8448, 8448);
		this.aBool9090 = false;
	}

	boolean method2395() {
		return true;
	}

	void method2408(boolean bool_1) {
		this.aGraphicalRenderer_Sub1_1664.method13717(8448, 7681);
	}

	void method2404(boolean bool_1) {
		this.aGraphicalRenderer_Sub1_1664.method13717(8448, 7681);
	}

	void method2405(boolean bool_1) {
		this.aGraphicalRenderer_Sub1_1664.method13717(8448, 7681);
	}

	void method2406(boolean bool_1) {
		this.aGraphicalRenderer_Sub1_1664.method13717(8448, 7681);
	}

	void method2407(boolean bool_1) {
		this.aGraphicalRenderer_Sub1_1664.method13717(8448, 7681);
	}

	boolean method2401() {
		return true;
	}

	void method2409(int i_1, int i_2) {
	}

	void method2396(int i_1, int i_2) {
	}

	void method2410(int i_1, int i_2) {
	}

	void method2397(boolean bool_1) {
		Class137_Sub2 class137_sub2_2 = this.aGraphicalRenderer_Sub1_1664.method13596();
		if (this.aClass138_9088 != null && class137_sub2_2 != null && bool_1) {
			this.aClass138_9088.method2379('\u0000');
			this.aGraphicalRenderer_Sub1_1664.method13610(1);
			this.aGraphicalRenderer_Sub1_1664.method13654(class137_sub2_2);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf(this.aGraphicalRenderer_Sub1_1664.aClass384_8391.method6534(this.aGraphicalRenderer_Sub1_1664.aFloatArray8477), 0);
			OpenGL.glMatrixMode(5888);
			this.aGraphicalRenderer_Sub1_1664.method13610(0);
			this.aBool9090 = true;
		} else {
			this.aGraphicalRenderer_Sub1_1664.method13616(0, 34168);
		}

	}

	void method2412(Class137 class137_1, int i_2) {
		this.aGraphicalRenderer_Sub1_1664.method13654(class137_1);
		this.aGraphicalRenderer_Sub1_1664.method13612(i_2);
	}

	void method2413(Class137 class137_1, int i_2) {
		this.aGraphicalRenderer_Sub1_1664.method13654(class137_1);
		this.aGraphicalRenderer_Sub1_1664.method13612(i_2);
	}

	void method2414(Class137 class137_1, int i_2) {
		this.aGraphicalRenderer_Sub1_1664.method13654(class137_1);
		this.aGraphicalRenderer_Sub1_1664.method13612(i_2);
	}

}
