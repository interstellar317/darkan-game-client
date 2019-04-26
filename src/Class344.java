public class Class344 {

    int anInt4015;

    int anInt4012;

    int[][] anIntArrayArray4017;

    byte[] method6102(byte[] bytes_1) {
        if (this.anIntArrayArray4017 != null) {
            int i_3 = (int) ((long) this.anInt4012 * (long) bytes_1.length / (long) this.anInt4015) + 14;
            int[] ints_4 = new int[i_3];
            int i_5 = 0;
            int i_6 = 0;
            int i_7;
            for (i_7 = 0; i_7 < bytes_1.length; i_7++) {
                byte b_8 = bytes_1[i_7];
                int[] ints_9 = this.anIntArrayArray4017[i_6];
                int i_10;
                for (i_10 = 0; i_10 < 14; i_10++) {
                    ints_4[i_5 + i_10] += b_8 * ints_9[i_10];
                }
                i_6 += this.anInt4012;
                i_10 = i_6 / this.anInt4015;
                i_5 += i_10;
                i_6 -= i_10 * this.anInt4015;
            }
            bytes_1 = new byte[i_3];
            for (i_7 = 0; i_7 < i_3; i_7++) {
                int i_11 = ints_4[i_7] + 32768 >> 16;
                if (i_11 < -128) {
                    bytes_1[i_7] = -128;
                } else if (i_11 > 127) {
                    bytes_1[i_7] = 127;
                } else {
                    bytes_1[i_7] = (byte) i_11;
                }
            }
        }
        return bytes_1;
    }

    public Class344(int i_1, int i_2) {
        if (i_2 != i_1) {
            int i_3 = CutsceneAction_Sub15.method14645(i_1, i_2);
            i_1 /= i_3;
            i_2 /= i_3;
            this.anInt4015 = i_1;
            this.anInt4012 = i_2;
            this.anIntArrayArray4017 = new int[i_1][14];
            for (int i_4 = 0; i_4 < i_1; i_4++) {
                int[] ints_5 = this.anIntArrayArray4017[i_4];
                double d_6 = (double) i_4 / (double) i_1 + 6.0D;
                int i_8 = (int) Math.floor(d_6 - 7.0D + 1.0D);
                if (i_8 < 0) {
                    i_8 = 0;
                }
                int i_9 = (int) Math.ceil(7.0D + d_6);
                if (i_9 > 14) {
                    i_9 = 14;
                }
                for (double d_10 = (double) i_2 / (double) i_1; i_8 < i_9; i_8++) {
                    double d_12 = ((double) i_8 - d_6) * 3.141592653589793D;
                    double d_14 = d_10;
                    if (d_12 < -1.0E-4D || d_12 > 1.0E-4D) {
                        d_14 = d_10 * (Math.sin(d_12) / d_12);
                    }
                    d_14 *= 0.54D + 0.46D * Math.cos(0.2243994752564138D * ((double) i_8 - d_6));
                    ints_5[i_8] = (int) Math.floor(d_14 * 65536.0D + 0.5D);
                }
            }
        }
    }

    public short[] method6111(short[] shorts_1) {
        if (this.anIntArrayArray4017 != null) {
            int i_3 = (int) ((long) shorts_1.length * (long) this.anInt4012 / (long) this.anInt4015) + 14;
            int[] ints_4 = new int[i_3];
            int i_5 = 0;
            int i_6 = 0;
            int i_7;
            for (i_7 = 0; i_7 < shorts_1.length; i_7++) {
                short s_8 = shorts_1[i_7];
                int[] ints_9 = this.anIntArrayArray4017[i_6];
                int i_10;
                for (i_10 = 0; i_10 < 14; i_10++) {
                    ints_4[i_10 + i_5] += ints_9[i_10] * s_8 >> 2;
                }
                i_6 += this.anInt4012;
                i_10 = i_6 / this.anInt4015;
                i_5 += i_10;
                i_6 -= i_10 * this.anInt4015;
            }
            shorts_1 = new short[i_3];
            for (i_7 = 0; i_7 < i_3; i_7++) {
                int i_11 = ints_4[i_7] + 8192 >> 14;
                if (i_11 < -32768) {
                    shorts_1[i_7] = -32768;
                } else if (i_11 > 32767) {
                    shorts_1[i_7] = 32767;
                } else {
                    shorts_1[i_7] = (short) i_11;
                }
            }
        }
        return shorts_1;
    }

    int method6112(int i_1) {
        if (this.anIntArrayArray4017 != null) {
            i_1 = (int) ((long) this.anInt4012 * (long) i_1 / (long) this.anInt4015);
        }
        return i_1;
    }

    int method6114(int i_1, int i_2) {
        if (this.anIntArrayArray4017 != null) {
            i_1 = (int) ((long) this.anInt4012 * (long) i_1 / (long) this.anInt4015) + 6;
        }
        return i_1;
    }

    public static RouteStrategy method6115(int i_0, int i_1, int i_2, int i_3) {
        Class224.aRouteStrategy_Sub3_2773.approxDestinationX = i_0;
        Class224.aRouteStrategy_Sub3_2773.approxDestinationY = i_1;
        Class224.aRouteStrategy_Sub3_2773.approxDestinationSizeX = i_2;
        Class224.aRouteStrategy_Sub3_2773.approxDestinationSizeY = i_3;
        Class224.aRouteStrategy_Sub3_2773.anInt7929 = 0;
        return Class224.aRouteStrategy_Sub3_2773;
    }

    public static final void method6119(String string_0) {
        if (Class467.aClass173Array5575 != null) {
            BufferedConnectionContext class184_2 = Preference_Sub20.method12807(978713855);
            TCPPacket tcpmessage_3 = Class271.createPacket(OutgoingPacket.KICK_FRIENDS_CHAT, class184_2.isaac);
            tcpmessage_3.buffer.writeByte(ChatLine.getLength(string_0));
            tcpmessage_3.buffer.writeString(string_0);
            class184_2.queuePacket(tcpmessage_3);
        }
    }
}
