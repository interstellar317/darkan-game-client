public class Preference_Sub22 extends Preference {

	int method7787() {
		return 1;
	}

	public void method12871() {
		if (this.manager.method13514((byte) 28) != Game.darkan) {
			this.anInt5578 = 1;
		}

		if (this.anInt5578 != 0 && this.anInt5578 != 1) {
			this.anInt5578 = this.method7781(2131611866);
		}

	}

	int method7781(int i_1) {
		return 1;
	}

	public boolean method12872() {
		return this.manager.method13514((byte) 119) == Game.darkan;
	}

	public int method7785(int i_1, int i_2) {
		return this.manager.method13514((byte) 66) == Game.darkan ? (i_1 != 0 && this.manager.aPreference_Sub17_8200.method12762(288309414) != 1 ? 2 : 1) : 3;
	}

	public int method12873(int i_1) {
		return this.anInt5578;
	}

	int method7786() {
		return 1;
	}

	public int method7784(int i_1) {
		return this.manager.method13514((byte) 72) == Game.darkan ? (i_1 != 0 && this.manager.aPreference_Sub17_8200.method12762(-925093981) != 1 ? 2 : 1) : 3;
	}

	void method7780(int i_1) {
		this.anInt5578 = -754033619 * i_1 * -859024475;
	}

	public Preference_Sub22(Node_Sub54 class282_sub54_1) {
		super(class282_sub54_1);
	}

	void method7783(int i_1) {
		this.anInt5578 = i_1;
	}

	public Preference_Sub22(int i_1, Node_Sub54 class282_sub54_2) {
		super(i_1, class282_sub54_2);
	}

	static IComponentDefinitions method12880(IComponentDefinitions icomponentdefinitions_0) {
		IComponentDefinitions icomponentdefinitions_2 = client.method11634(icomponentdefinitions_0);
		if (icomponentdefinitions_2 == null) {
			icomponentdefinitions_2 = icomponentdefinitions_0.aClass118_1379;
		}

		return icomponentdefinitions_2;
	}

}