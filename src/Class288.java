import java.util.Date;

public class Class288 {

	static FontMetrics aClass414_3438;

	SoftCache aClass229_3437 = new SoftCache(16);

	Index aClass317_3436;

	public void method5068(int i_1, byte b_2) {
		SoftCache softcache_3 = this.aClass229_3437;
		synchronized (this.aClass229_3437) {
			this.aClass229_3437.method3858(i_1, (byte) -51);
		}
	}

	public void method5070(int i_1) {
		SoftCache softcache_2 = this.aClass229_3437;
		synchronized (this.aClass229_3437) {
			this.aClass229_3437.method3859(1722121730);
		}
	}

	public Class288(Game game_1, Language xlanguage_2, Index index_3) {
		this.aClass317_3436 = index_3;
		this.aClass317_3436.filesCount(SharedConfigsType.aClass120_1469.id);
	}

	public void method5071(int i_1) {
		SoftCache softcache_2 = this.aClass229_3437;
		synchronized (this.aClass229_3437) {
			this.aClass229_3437.method3863(2056846713);
		}
	}

	Class207 method5072(int i_1, int i_2) {
		SoftCache softcache_4 = this.aClass229_3437;
		Class207 class207_3;
		synchronized (this.aClass229_3437) {
			class207_3 = (Class207) this.aClass229_3437.get((long) i_1);
		}
		if (class207_3 != null) {
			return class207_3;
		} else {
			Index index_5 = this.aClass317_3436;
			byte[] bytes_10;
			synchronized (this.aClass317_3436) {
				bytes_10 = this.aClass317_3436.getFile(SharedConfigsType.aClass120_1469.id, i_1);
			}
			class207_3 = new Class207();
			if (bytes_10 != null) {
				class207_3.method3549(new RsByteBuffer(bytes_10), -2145124357);
			}
			SoftCache softcache_9 = this.aClass229_3437;
			synchronized (this.aClass229_3437) {
				this.aClass229_3437.put(class207_3, (long) i_1);
				return class207_3;
			}
		}
	}

	public Class247 method5077(int i_1, int i_2, int i_3, int i_4, Class45 class45_5, int i_6) {
		Class334[] arr_7 = null;
		Class207 class207_8 = this.method5072(i_1, -2042609292);
		if (class207_8.anIntArray2655 != null) {
			arr_7 = new Class334[class207_8.anIntArray2655.length];
			for (int i_9 = 0; i_9 < arr_7.length; i_9++) {
				Class38 class38_10 = class45_5.method914(class207_8.anIntArray2655[i_9], -1040824349);
				arr_7[i_9] = new Class334(class38_10.anInt395, class38_10.anInt402, class38_10.anInt401, class38_10.anInt397, class38_10.anInt399, class38_10.anInt396, class38_10.anInt404, class38_10.aBool400, class38_10.anInt403, class38_10.anInt398, class38_10.anInt405);
			}
		}
		return new Class247(class207_8.anInt2653, arr_7, class207_8.anInt2654, i_2, i_3, i_4, class207_8.aClass204_2656, class207_8.anInt2657);
	}

	static void method5083(long long_0) {
		Class407.aCalendar4846.setTime(new Date(long_0));
	}

	public static Interface getInterface(int interfaceId, int[] ints_1, Interface interface_2, boolean bool_3, byte b_4) {
		if (!Class388.INTERFACE_INDEX.loadArchive(interfaceId)) {
			return null;
		} else {
			int componentSize = Class388.INTERFACE_INDEX.filesCount(interfaceId);
			IComponentDefinitions[] arr_6;
			if (componentSize == 0) {
				arr_6 = new IComponentDefinitions[0];
			} else if (interface_2 == null) {
				arr_6 = new IComponentDefinitions[componentSize];
			} else {
				arr_6 = interface_2.components;
			}
			if (interface_2 == null) {
				interface_2 = new Interface(bool_3, arr_6);
			} else {
				interface_2.components = arr_6;
				interface_2.aBool999 = bool_3;
			}
			for (int i = 0; i < componentSize; i++) {
				if (interface_2.components[i] == null) {
					byte[] bytes_8 = Class388.INTERFACE_INDEX.getFile(interfaceId, i, ints_1);
					if (bytes_8 != null) {
						IComponentDefinitions component = interface_2.components[i] = new IComponentDefinitions();
						component.idHash = i + (interfaceId << 16);
						component.readValues(new RsByteBuffer(bytes_8), 1943098120);
					}
				}
			}
			return interface_2;
		}
	}
}
