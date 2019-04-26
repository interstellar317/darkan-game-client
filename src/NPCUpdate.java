import java.util.Iterator;

public class NPCUpdate {

	static final void decode(boolean largeView) {
		client.anInt7216 = 0;
		client.npcListSize = 0;
		++client.anInt7332;
		decodeAddRemove();
		decodeUpdate(largeView);
		decodeMasks();
		boolean bool_2 = false;
		int i_3;
		int i_4;
		for (i_3 = 0; i_3 < client.anInt7216; i_3++) {
			i_4 = client.anIntArray7421[i_3];
			StringNode class282_sub47_5 = (StringNode) client.NPCS.get((long) i_4);
			NPC npc_7 = (NPC) class282_sub47_5.anObject8068;
			if (npc_7.lastUpdate != client.anInt7332) {
				if (Class20.aBool161 && EnumIndexLoader.method7426(i_4, (byte) -86)) {
					Class316.method5594();
				}
				if (npc_7.definitions.method6886()) {
					TextureDetails.method2876(npc_7);
				}
				npc_7.setDefinition((NPCDefinitions) null);
				class282_sub47_5.remove();
				bool_2 = true;
			}
		}
		if (bool_2) {
			i_3 = client.anInt7210;
			client.anInt7210 = client.NPCS.method7748((short) 15812);
			i_4 = 0;
			StringNode class282_sub47_9;
			for (Iterator iterator_8 = client.NPCS.iterator(); iterator_8.hasNext(); client.aNode_Sub47Array7209[i_4++] = class282_sub47_9) {
				class282_sub47_9 = (StringNode) iterator_8.next();
			}
			for (int i_6 = client.anInt7210; i_6 < i_3; i_6++) {
				client.aNode_Sub47Array7209[i_6] = null;
			}
		}
		if (client.outputContext.recievedBuffer.index != client.outputContext.currentPacketSize) {
			throw new RuntimeException(client.outputContext.recievedBuffer.index + " " + client.outputContext.currentPacketSize);
		} else {
			for (i_3 = 0; i_3 < client.NPC_UPDATE_INDEX; i_3++) {
				if (client.NPCS.get((long) client.NPC_UPDATE_INDICES[i_3]) == null) {
					throw new RuntimeException(i_3 + " " + client.NPC_UPDATE_INDEX);
				}
			}
			if (client.anInt7210 - client.NPC_UPDATE_INDEX != 0) {
				throw new RuntimeException("" + (client.anInt7210 - client.NPC_UPDATE_INDEX));
			} else {
				for (i_3 = 0; i_3 < client.anInt7210; i_3++) {
					if (((Animable) client.aNode_Sub47Array7209[i_3].anObject8068).lastUpdate != client.anInt7332) {
						throw new RuntimeException("" + ((Animable) client.aNode_Sub47Array7209[i_3].anObject8068).index);
					}
				}
			}
		}
	}

	static final void decodeAddRemove() {
		RsBitsBuffer buffer = client.outputContext.recievedBuffer;
		buffer.initBitAccess((byte) 104);
		int size = buffer.readBits(8);
		int i;
		if (size < client.NPC_UPDATE_INDEX) {
			for (i = size; i < client.NPC_UPDATE_INDEX; i++) {
				client.anIntArray7421[++client.anInt7216 - 1] = client.NPC_UPDATE_INDICES[i];
			}
		}
	
		if (size > client.NPC_UPDATE_INDEX) {
			throw new RuntimeException();
		} else {
			client.NPC_UPDATE_INDEX = 0;
	
			for (i = 0; i < size; i++) {
				int key = client.NPC_UPDATE_INDICES[i];
				NPC npc = (NPC) ((StringNode) client.NPCS.get((long) key)).anObject8068;
				int needsUpdate = buffer.readBits(1);
				if (needsUpdate == 0) {
					client.NPC_UPDATE_INDICES[++client.NPC_UPDATE_INDEX - 1] = key;
					npc.lastUpdate = client.anInt7332;
				} else {
					int moveSpeed = buffer.readBits(2);
					if (moveSpeed == 0) {
						client.NPC_UPDATE_INDICES[++client.NPC_UPDATE_INDEX - 1] = key;
						npc.lastUpdate = client.anInt7332;
						client.NPC_INDICES[++client.npcListSize - 1] = key;
					} else if (moveSpeed == 1) {
						client.NPC_UPDATE_INDICES[++client.NPC_UPDATE_INDEX - 1] = key;
						npc.lastUpdate = client.anInt7332;
						NPCDirection class252_8 = (NPCDirection) Class386.identify(Class46.getDirections(), buffer.readBits(3));
						npc.move(class252_8, MovementType.WALKING.id);
						int i_9 = buffer.readBits(1);
						if (i_9 == 1) {
							client.NPC_INDICES[++client.npcListSize - 1] = key;
						}
					} else if (moveSpeed == 2) {
						client.NPC_UPDATE_INDICES[++client.NPC_UPDATE_INDEX - 1] = key;
						npc.lastUpdate = client.anInt7332;
						if (buffer.readBits(1) == 1) {
							NPCDirection direction = (NPCDirection) Class386.identify(Class46.getDirections(), buffer.readBits(3));
							npc.move(direction, MovementType.RUNNING.id);
							NPCDirection class252_10 = (NPCDirection) Class386.identify(Class46.getDirections(), buffer.readBits(3));
							npc.move(class252_10, MovementType.RUNNING.id);
						} else {
							NPCDirection class252_8 = (NPCDirection) Class386.identify(Class46.getDirections(), buffer.readBits(3));
							npc.move(class252_8, MovementType.HALF_WALK.id);
						}
	
						int i_11 = buffer.readBits(1);
						if (i_11 == 1) {
							client.NPC_INDICES[++client.npcListSize - 1] = key;
						}
					} else if (moveSpeed == 3) {
						client.anIntArray7421[++client.anInt7216 - 1] = key;
					}
				}
			}
	
		}
	}

	static final void decodeUpdate(boolean largeView) {
		RsBitsBuffer rsbitsbuffer_2 = client.outputContext.recievedBuffer;
		while (rsbitsbuffer_2.readableBits(client.outputContext.currentPacketSize) >= 15) {
			int i_3 = rsbitsbuffer_2.readBits(15);
			if (i_3 == 32767) {
				break;
			}
			boolean bool_4 = false;
			StringNode class282_sub47_5 = (StringNode) client.NPCS.get((long) i_3);
			NPC npc_6;
			if (class282_sub47_5 == null) {
				npc_6 = new NPC(IndexLoaders.MAP_REGION_DECODER.getSceneObjectManager());
				npc_6.index = i_3;
				class282_sub47_5 = new StringNode(npc_6);
				client.NPCS.put(class282_sub47_5, (long) i_3);
				client.aNode_Sub47Array7209[++client.anInt7210 - 1] = class282_sub47_5;
				bool_4 = true;
			}
			npc_6 = (NPC) class282_sub47_5.anObject8068;
			client.NPC_UPDATE_INDICES[++client.NPC_UPDATE_INDEX - 1] = i_3;
			npc_6.lastUpdate = client.anInt7332;
			if (npc_6.definitions != null && npc_6.definitions.method6886()) {
				TextureDetails.method2876(npc_6);
			}
			int i_7 = rsbitsbuffer_2.readBits(1);
			if (i_7 == 1) {
				client.NPC_INDICES[++client.npcListSize - 1] = i_3;
			}
			int i_8;
			if (largeView) {
				i_8 = rsbitsbuffer_2.readBits(8);
				if (i_8 > 127) {
					i_8 -= 256;
				}
			} else {
				i_8 = rsbitsbuffer_2.readBits(5);
				if (i_8 > 15) {
					i_8 -= 32;
				}
			}
			int i_9 = rsbitsbuffer_2.readBits(3) + 4 << 11 & 0x3fff;
			npc_6.setDefinition(IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(rsbitsbuffer_2.readBits(15)));
			int i_10;
			if (largeView) {
				i_10 = rsbitsbuffer_2.readBits(8);
				if (i_10 > 127) {
					i_10 -= 256;
				}
			} else {
				i_10 = rsbitsbuffer_2.readBits(5);
				if (i_10 > 15) {
					i_10 -= 32;
				}
			}
			int i_11 = rsbitsbuffer_2.readBits(1);
			int i_12 = rsbitsbuffer_2.readBits(2);
			npc_6.setBoundSize(npc_6.definitions.size);
			npc_6.anInt10340 = npc_6.definitions.contrast << 3;
			if (bool_4) {
				npc_6.turn(i_9, true);
			}
			npc_6.move(i_12, VertexNormal.myPlayer.regionBaseX[0] + i_10, VertexNormal.myPlayer.regionBaseY[0] + i_8, i_11 == 1, npc_6.getSize());
			if (npc_6.definitions.method6886()) {
				Class397.method6775(npc_6.plane, npc_6.regionBaseX[0], npc_6.regionBaseY[0], 0, (ObjectDefinitions) null, npc_6, (Player) null, 386204149);
			}
		}
		rsbitsbuffer_2.finishBitAccess((byte) 35);
	}

	static final void decodeMasks() {
		RsBitsBuffer buffer = client.outputContext.recievedBuffer;
		for (int i_1 = 0; i_1 < client.npcListSize; i_1++) {
			int i_2 = client.NPC_INDICES[i_1];
			NPC npc = (NPC) ((StringNode) client.NPCS.get((long) i_2)).anObject8068;
			int i_4 = buffer.readUnsignedByte();
			if ((i_4 & 0x40) != 0) {
				i_4 += buffer.readUnsignedByte() << 8;
			}
			if ((i_4 & 0x2000) != 0) {
				i_4 += buffer.readUnsignedByte() << 16;
			}
			if ((i_4 & 0x100000) != 0) {
				i_4 += buffer.readUnsignedByte() << 24;
			}
			if ((i_4 & 0x10) != 0) {
				int[] ints_5 = new int[FontRenderer_Sub3.method14339().length];
				for (int i_6 = 0; i_6 < FontRenderer_Sub3.method14339().length; i_6++) {
					ints_5[i_6] = buffer.readBigSmart();
				}
				int i_6 = buffer.readUnsignedByte();
				Class20.animate(npc, ints_5, i_6, true, (byte) 23);
			}
			if ((i_4 & 0x100) != 0) {
				int i_14 = npc.definitions.modelIds.length;
				int i_6 = 0;
				if (npc.definitions.modifiedColors != null) {
					i_6 = npc.definitions.modifiedColors.length;
				}
				int i_7 = 0;
				if (npc.definitions.modifiedTextures != null) {
					i_7 = npc.definitions.modifiedTextures.length;
				}
				int i_8 = buffer.readUnsigned128Byte();
				if ((i_8 & 0x1) == 1) {
					npc.meshModifiers = null;
				} else {
					int[] ints_18 = null;
					if ((i_8 & 0x2) == 2) {
						ints_18 = new int[i_14];
						for (int i_10 = 0; i_10 < i_14; i_10++) {
							ints_18[i_10] = buffer.readBigSmart();
						}
					}
					short[] shorts_19 = null;
					if ((i_8 & 0x4) == 4) {
						shorts_19 = new short[i_6];
						for (int i_11 = 0; i_11 < i_6; i_11++) {
							shorts_19[i_11] = (short) buffer.readUnsignedShort();
						}
					}
					short[] shorts_20 = null;
					if ((i_8 & 0x8) == 8) {
						shorts_20 = new short[i_7];
						for (int i_12 = 0; i_12 < i_7; i_12++) {
							shorts_20[i_12] = (short) buffer.readUnsignedShort();
						}
					}
					long long_21 = (long) i_2 | (long) (++npc.meshModifierCount - 1) << 32;
					npc.meshModifiers = new NPCMeshModifier(long_21, ints_18, shorts_19, shorts_20);
				}
			}
			if ((i_4 & 0x400) != 0) {
				npc.anInt10326 = buffer.read128Byte();
				npc.anInt10328 = buffer.readByte128();
				npc.anInt10341 = buffer.readByteC();
				npc.anInt10343 = buffer.readByte128();
				npc.anInt10342 = buffer.readShortLE() + client.cycles;
				npc.anInt10345 = buffer.readShortLE() + client.cycles;
				npc.anInt10346 = buffer.readUnsignedShortLE128();
				npc.anInt10326 += npc.regionBaseX[0];
				npc.anInt10328 += npc.regionBaseY[0];
				npc.anInt10341 += npc.regionBaseX[0];
				npc.anInt10343 += npc.regionBaseY[0];
				npc.anInt10355 = 1;
				npc.anInt10367 = 0;
			}
			if ((i_4 & 0x1000) != 0) {
				npc.anInt10575 = buffer.readUnsignedShort();
				if (npc.anInt10575 == 65535) {
					npc.anInt10575 = -1;
				}
			}
			if ((i_4 & 0x200000) != 0) {
				int i_14 = buffer.buffer[++buffer.index - 1] & 0xff;
				for (int i_6 = 0; i_6 < i_14; i_6++) {
					int i_7 = buffer.readUnsignedShortLE128();
					int i_8 = buffer.readIntV1();
					npc.varns.setVarn(i_7, i_8);
				}
			}
			if ((i_4 & 0x1000000) != 0) {
				int i_14 = buffer.readUnsignedShort128();
				int i_6 = buffer.readIntV2();
				if (i_14 == 65535) {
					i_14 = -1;
				}
				int i_7 = buffer.readUnsignedByte128();
				int i_8 = i_7 & 0x7;
				int i_9 = i_7 >> 3 & 0xf;
				if (i_9 == 15) {
					i_9 = -1;
				}
				boolean bool_24 = (i_7 >> 7 & 0x1) == 1;
				npc.sendSpotAnim(i_14, i_6, i_8, i_9, bool_24, 3);
			}
			if ((i_4 & 0x80) != 0) {
				npc.faceEntity = buffer.readShortLE();
				if (npc.faceEntity == 65535) {
					npc.faceEntity = -1;
				}
			}
			if ((i_4 & 0x8000) != 0) {
				int i_14 = buffer.readUnsignedByteC();
				int[] ints_15 = new int[i_14];
				int[] ints_16 = new int[i_14];
				int[] ints_17 = new int[i_14];
				for (int i_9 = 0; i_9 < i_14; i_9++) {
					int i_10 = buffer.readBigSmart();
					ints_15[i_9] = i_10;
					ints_16[i_9] = buffer.readUnsignedByte();
					ints_17[i_9] = buffer.readShortLE();
				}
				QuickchatCategoryLoader.method5923(npc, ints_15, ints_16, ints_17, -125170497);
			}
			if ((i_4 & 0x800) != 0) {
				int i_14 = buffer.readShortLE();
				int i_6 = buffer.readInt();
				if (i_14 == 65535) {
					i_14 = -1;
				}
				int i_7 = buffer.readUnsignedByte128();
				int i_8 = i_7 & 0x7;
				int i_9 = i_7 >> 3 & 0xf;
				if (i_9 == 15) {
					i_9 = -1;
				}
				boolean bool_24 = (i_7 >> 7 & 0x1) == 1;
				npc.sendSpotAnim(i_14, i_6, i_8, i_9, bool_24, 1);
			}
			if ((i_4 & 0x1) != 0) {
				int i_14 = buffer.readUnsignedByte128();
				if (i_14 > 0) {
					for (int i_6 = 0; i_6 < i_14; i_6++) {
						int i_7 = -1;
						int i_8;
						int i_9 = -1;
						int i_10 = buffer.readUnsignedSmart();
						if (i_10 == 32767) {
							i_10 = buffer.readUnsignedSmart();
							i_8 = buffer.readUnsignedSmart();
							i_7 = buffer.readUnsignedSmart();
							i_9 = buffer.readUnsignedSmart();
						} else if (i_10 != 32766) {
							i_8 = buffer.readUnsignedSmart();
						} else {
							i_10 = -1;
							i_8 = buffer.readUnsignedByte();
						}
						int i_11 = buffer.readUnsignedSmart();
						npc.applyHit(i_10, i_8, i_7, i_9, client.cycles, i_11);
					}
				}
				int i_6 = buffer.readUnsignedByte128();
				if (i_6 > 0) {
					for (int i_7 = 0; i_7 < i_6; i_7++) {
						int i_8 = buffer.readUnsignedSmart();
						int i_9 = buffer.readUnsignedSmart();
						if (i_9 != 32767) {
							int i_10 = buffer.readUnsignedSmart();
							int i_11 = buffer.readUnsigned128Byte();
							int i_12 = i_9 > 0 ? buffer.readUnsignedByte128() : i_11;
							npc.displayHitbar(i_8, client.cycles, i_9, i_10, i_11, i_12);
						} else {
							npc.method15857(i_8);
						}
					}
				}
			}
			if ((i_4 & 0x8) != 0) {
				if (npc.definitions.method6886()) {
					TextureDetails.method2876(npc);
				}
				npc.setDefinition(IndexLoaders.NPC_INDEX_LOADER.getNPCDefinitions(buffer.readBigSmart()));
				npc.setBoundSize(npc.definitions.size);
				npc.anInt10340 = npc.definitions.contrast << 3;
				if (npc.definitions.method6886()) {
					Class397.method6775(npc.plane, npc.regionBaseX[0], npc.regionBaseY[0], 0, (ObjectDefinitions) null, npc, (Player) null, 352984427);
				}
			}
			if ((i_4 & 0x2000000) != 0) {
				int i_14 = buffer.readShortLE();
				int i_6 = buffer.readIntLE();
				if (i_14 == 65535) {
					i_14 = -1;
				}
				int i_7 = buffer.readUnsignedByte();
				int i_8 = i_7 & 0x7;
				int i_9 = i_7 >> 3 & 0xf;
				if (i_9 == 15) {
					i_9 = -1;
				}
				boolean bool_24 = (i_7 >> 7 & 0x1) == 1;
				npc.sendSpotAnim(i_14, i_6, i_8, i_9, bool_24, 2);
			}
			if ((i_4 & 0x80000) != 0) {
				int i_14 = buffer.buffer[++buffer.index - 1] & 0xff;
				for (int i_6 = 0; i_6 < i_14; i_6++) {
					int i_7 = buffer.readUnsignedByte128();
					int i_8 = buffer.readInt();
					int i_9 = buffer.method13132();
					npc.method16179(i_7, i_8, i_9);
				}
			}
			if ((i_4 & 0x40000) != 0) {
				int i_14 = npc.definitions.headModels.length;
				int i_6 = 0;
				if (npc.definitions.modifiedColors != null) {
					i_6 = npc.definitions.modifiedColors.length;
				}
				byte b_25 = 0;
				if (npc.definitions.modifiedTextures != null) {
					i_6 = npc.definitions.modifiedTextures.length;
				}
				int i_8 = buffer.readUnsignedByte128();
				if ((i_8 & 0x1) != 1) {
					int[] ints_18 = null;
					if ((i_8 & 0x2) == 2) {
						ints_18 = new int[i_14];
						for (int i_10 = 0; i_10 < i_14; i_10++) {
							ints_18[i_10] = buffer.readBigSmart();
						}
					}
					short[] shorts_19 = null;
					if ((i_8 & 0x4) == 4) {
						shorts_19 = new short[i_6];
						for (int i_11 = 0; i_11 < i_6; i_11++) {
							shorts_19[i_11] = (short) buffer.readUnsignedShort();
						}
					}
					short[] shorts_20 = null;
					if ((i_8 & 0x8) == 8) {
						shorts_20 = new short[b_25];
						for (int i_12 = 0; i_12 < b_25; i_12++) {
							shorts_20[i_12] = (short) buffer.readUnsignedShortLE128();
						}
					}
					long long_21 = (long) i_2 | (long) (++npc.headMeshModifierCount - 1) << 32;
					new NPCMeshModifier(long_21, ints_18, shorts_19, shorts_20);
				}
			}
			if ((i_4 & 0x10000) != 0) {
				npc.anInt10582 = buffer.readUnsignedShort128();
				if (npc.anInt10582 == 65535) {
					npc.anInt10582 = npc.definitions.combatLevel;
				}
			}
			if ((i_4 & 0x400000) != 0) {
				npc.varns.method2607();
				int i_14 = buffer.buffer[++buffer.index - 1] & 0xff;
				for (int i_6 = 0; i_6 < i_14; i_6++) {
					int i_7 = buffer.readUnsignedShort();
					int i_8 = buffer.readIntV1();
					npc.varns.setVarn(i_7, i_8);
				}
			}
			if ((i_4 & 0x4) != 0) {
				npc.anInt10578 = buffer.readUnsignedShortLE128();
				npc.anInt10577 = buffer.readShortLE();
			}
			if ((i_4 & 0x20000) != 0) {
				npc.aByte10371 = buffer.read128Byte();
				npc.aByte10327 = buffer.readByte();
				npc.aByte10364 = buffer.readByte();
				npc.aByte10352 = (byte) buffer.readUnsigned128Byte();
				npc.anInt10347 = client.cycles + buffer.readShortLE();
				npc.anInt10348 = client.cycles + buffer.readUnsignedShort();
			}
			if ((i_4 & 0x800000) != 0) {
				npc.modifiedName = buffer.readString();
				if ("".equals(npc.modifiedName) || npc.modifiedName.equals(npc.definitions.name)) {
					npc.modifiedName = npc.definitions.name;
				}
			}
			if ((i_4 & 0x2) != 0) {
				npc.method16164(buffer.readString());
			}
			if ((i_4 & 0x4000) != 0) {
				int i_14 = buffer.readUnsigned128Byte();
				int[] ints_15 = new int[i_14];
				int[] ints_16 = new int[i_14];
				for (int i_8 = 0; i_8 < i_14; i_8++) {
					int i_9 = buffer.readUnsignedShortLE128();
					if ((i_9 & 0xc000) == 49152) {
						int i_10 = buffer.readUnsignedShort();
						ints_15[i_8] = i_9 << 16 | i_10;
					} else {
						ints_15[i_8] = i_9;
					}
					ints_16[i_8] = buffer.readUnsignedShortLE128();
				}
				npc.method15797(ints_15, ints_16);
			}
			if ((i_4 & 0x20) != 0) {
				int i_14 = buffer.readUnsignedShort();
				int i_6 = buffer.readIntV2();
				if (i_14 == 65535) {
					i_14 = -1;
				}
				int i_7 = buffer.readUnsignedByteC();
				int i_8 = i_7 & 0x7;
				int i_9 = i_7 >> 3 & 0xf;
				if (i_9 == 15) {
					i_9 = -1;
				}
				boolean bool_24 = (i_7 >> 7 & 0x1) == 1;
				npc.sendSpotAnim(i_14, i_6, i_8, i_9, bool_24, 0);
			}
		}
	}

}