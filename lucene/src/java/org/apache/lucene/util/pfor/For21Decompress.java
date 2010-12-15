package org.apache.lucene.util.pfor;
/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/* This program is generated, do not modify. See gendecompress.py */

import java.nio.IntBuffer;
class For21Decompress extends ForDecompress {
  static final int numFrameBits = 21;
  static final int mask = (int) ((1L<<numFrameBits) - 1);

  static void decompressFrame(FrameOfRef frameOfRef) {
    int[] output = frameOfRef.unCompressedData;
    IntBuffer compressedBuffer = frameOfRef.compressedBuffer;
    int outputOffset = frameOfRef.offset;
    //int inputSize = frameOfRef.unComprSize;
    for(int step=0;step<4;step++) {
      int intValue0 = compressedBuffer.get();
      int intValue1 = compressedBuffer.get();
      int intValue2 = compressedBuffer.get();
      int intValue3 = compressedBuffer.get();
      int intValue4 = compressedBuffer.get();
      int intValue5 = compressedBuffer.get();
      int intValue6 = compressedBuffer.get();
      int intValue7 = compressedBuffer.get();
      int intValue8 = compressedBuffer.get();
      int intValue9 = compressedBuffer.get();
      int intValue10 = compressedBuffer.get();
      int intValue11 = compressedBuffer.get();
      int intValue12 = compressedBuffer.get();
      int intValue13 = compressedBuffer.get();
      int intValue14 = compressedBuffer.get();
      int intValue15 = compressedBuffer.get();
      int intValue16 = compressedBuffer.get();
      int intValue17 = compressedBuffer.get();
      int intValue18 = compressedBuffer.get();
      int intValue19 = compressedBuffer.get();
      int intValue20 = compressedBuffer.get();
      output[0 + outputOffset] = intValue0 & mask;
      output[1 + outputOffset] = ((intValue0 >>> 21) | (intValue1 << 11)) & mask;
      output[2 + outputOffset] = (intValue1 >>> 10) & mask;
      output[3 + outputOffset] = ((intValue1 >>> 31) | (intValue2 << 1)) & mask;
      output[4 + outputOffset] = ((intValue2 >>> 20) | (intValue3 << 12)) & mask;
      output[5 + outputOffset] = (intValue3 >>> 9) & mask;
      output[6 + outputOffset] = ((intValue3 >>> 30) | (intValue4 << 2)) & mask;
      output[7 + outputOffset] = ((intValue4 >>> 19) | (intValue5 << 13)) & mask;
      output[8 + outputOffset] = (intValue5 >>> 8) & mask;
      output[9 + outputOffset] = ((intValue5 >>> 29) | (intValue6 << 3)) & mask;
      output[10 + outputOffset] = ((intValue6 >>> 18) | (intValue7 << 14)) & mask;
      output[11 + outputOffset] = (intValue7 >>> 7) & mask;
      output[12 + outputOffset] = ((intValue7 >>> 28) | (intValue8 << 4)) & mask;
      output[13 + outputOffset] = ((intValue8 >>> 17) | (intValue9 << 15)) & mask;
      output[14 + outputOffset] = (intValue9 >>> 6) & mask;
      output[15 + outputOffset] = ((intValue9 >>> 27) | (intValue10 << 5)) & mask;
      output[16 + outputOffset] = ((intValue10 >>> 16) | (intValue11 << 16)) & mask;
      output[17 + outputOffset] = (intValue11 >>> 5) & mask;
      output[18 + outputOffset] = ((intValue11 >>> 26) | (intValue12 << 6)) & mask;
      output[19 + outputOffset] = ((intValue12 >>> 15) | (intValue13 << 17)) & mask;
      output[20 + outputOffset] = (intValue13 >>> 4) & mask;
      output[21 + outputOffset] = ((intValue13 >>> 25) | (intValue14 << 7)) & mask;
      output[22 + outputOffset] = ((intValue14 >>> 14) | (intValue15 << 18)) & mask;
      output[23 + outputOffset] = (intValue15 >>> 3) & mask;
      output[24 + outputOffset] = ((intValue15 >>> 24) | (intValue16 << 8)) & mask;
      output[25 + outputOffset] = ((intValue16 >>> 13) | (intValue17 << 19)) & mask;
      output[26 + outputOffset] = (intValue17 >>> 2) & mask;
      output[27 + outputOffset] = ((intValue17 >>> 23) | (intValue18 << 9)) & mask;
      output[28 + outputOffset] = ((intValue18 >>> 12) | (intValue19 << 20)) & mask;
      output[29 + outputOffset] = (intValue19 >>> 1) & mask;
      output[30 + outputOffset] = ((intValue19 >>> 22) | (intValue20 << 10)) & mask;
      output[31 + outputOffset] = intValue20 >>> 11;
      // inputSize -= 32;
      outputOffset += 32;
    }
    
    //if (inputSize > 0) {
    //  decodeAnyFrame(compressedBuffer, bufIndex, inputSize, numFrameBits, output, outputOffset);
    //}
  }
}