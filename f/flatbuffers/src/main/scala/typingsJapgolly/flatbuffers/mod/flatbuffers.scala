package typingsJapgolly.flatbuffers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flatbuffers", "flatbuffers")
@js.native
object flatbuffers extends js.Object {
  ////////////////////////////////////////////////////////////////////////////////
  @js.native
  class Builder ()
    extends typingsJapgolly.flatbuffers.mod._Global_.flatbuffers.Builder {
    def this(initial_size: Double) = this()
  }
  
  ////////////////////////////////////////////////////////////////////////////////
  @js.native
  class ByteBuffer protected ()
    extends typingsJapgolly.flatbuffers.mod._Global_.flatbuffers.ByteBuffer {
    def this(bytes: scala.scalajs.js.typedarray.Uint8Array) = this()
  }
  
  ////////////////////////////////////////////////////////////////////////////////
  @js.native
  class Long protected ()
    extends typingsJapgolly.flatbuffers.mod._Global_.flatbuffers.Long {
    def this(low: Double, high: Double) = this()
  }
  
  val FILE_IDENTIFIER_LENGTH: Double = js.native
  val SIZEOF_INT: Double = js.native
  val SIZEOF_SHORT: Double = js.native
  val SIZE_PREFIX_LENGTH: Double = js.native
  val float32: scala.scalajs.js.typedarray.Float32Array = js.native
  val float64: scala.scalajs.js.typedarray.Float64Array = js.native
  val int32: scala.scalajs.js.typedarray.Int32Array = js.native
  val isLittleEndian: Boolean = js.native
  /* static members */
  @js.native
  object Builder extends js.Object {
    /**
      * Doubles the size of the backing ByteBuffer and copies the old data towards
      * the end of the new buffer (since we build the buffer backwards).
      *
      * @param bb The current buffer with the existing data
      * @returns A new byte buffer with the old data copied
      * to it. The data is located at the end of the buffer.
      */
    def growByteBuffer(bb: typingsJapgolly.flatbuffers.mod._Global_.flatbuffers.ByteBuffer): typingsJapgolly.flatbuffers.mod._Global_.flatbuffers.ByteBuffer = js.native
  }
  
  /* static members */
  @js.native
  object ByteBuffer extends js.Object {
    def allocate(byte_size: Double): typingsJapgolly.flatbuffers.mod._Global_.flatbuffers.ByteBuffer = js.native
  }
  
  @js.native
  object Encoding extends js.Object {
    /* 1 */ val UTF16_STRING: typingsJapgolly.flatbuffers.mod._Global_.flatbuffers.Encoding.UTF16_STRING with Double = js.native
    /* 0 */ val UTF8_BYTES: typingsJapgolly.flatbuffers.mod._Global_.flatbuffers.Encoding.UTF8_BYTES with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.flatbuffers.mod._Global_.flatbuffers.Encoding with Double] = js.native
  }
  
  /* static members */
  @js.native
  object Long extends js.Object {
    var ZERO: typingsJapgolly.flatbuffers.mod._Global_.flatbuffers.Long = js.native
    def create(low: Double, high: Double): typingsJapgolly.flatbuffers.mod._Global_.flatbuffers.Long = js.native
  }
  
}

