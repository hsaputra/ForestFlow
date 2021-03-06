// automatically generated by the FlatBuffers compiler, do not modify

package graphpipe;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Error extends Table {
  public static Error getRootAsError(ByteBuffer _bb) { return getRootAsError(_bb, new Error()); }
  public static Error getRootAsError(ByteBuffer _bb, Error obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public Error __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public long code() { int o = __offset(4); return o != 0 ? bb.getLong(o + bb_pos) : 0L; }
  public String message() { int o = __offset(6); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer messageAsByteBuffer() { return __vector_as_bytebuffer(6, 1); }
  public ByteBuffer messageInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 6, 1); }

  public static int createError(FlatBufferBuilder builder,
      long code,
      int messageOffset) {
    builder.startObject(2);
    Error.addCode(builder, code);
    Error.addMessage(builder, messageOffset);
    return Error.endError(builder);
  }

  public static void startError(FlatBufferBuilder builder) { builder.startObject(2); }
  public static void addCode(FlatBufferBuilder builder, long code) { builder.addLong(0, code, 0L); }
  public static void addMessage(FlatBufferBuilder builder, int messageOffset) { builder.addOffset(1, messageOffset, 0); }
  public static int endError(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

