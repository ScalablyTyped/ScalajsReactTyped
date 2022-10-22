package typingsJapgolly.lib0.distMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encoding {
  
  @JSImport("lib0/dist", "encoding")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lib0/dist", "encoding.Encoder")
  @js.native
  open class Encoder ()
    extends typingsJapgolly.lib0.distEncodingMod.Encoder
  
  @JSImport("lib0/dist", "encoding.IncUintOptRleEncoder")
  @js.native
  open class IncUintOptRleEncoder ()
    extends typingsJapgolly.lib0.distEncodingMod.IncUintOptRleEncoder
  
  @JSImport("lib0/dist", "encoding.IntDiffEncoder")
  @js.native
  open class IntDiffEncoder protected ()
    extends typingsJapgolly.lib0.distEncodingMod.IntDiffEncoder {
    /**
      * @param {number} start
      */
    def this(start: Double) = this()
  }
  
  @JSImport("lib0/dist", "encoding.IntDiffOptRleEncoder")
  @js.native
  open class IntDiffOptRleEncoder ()
    extends typingsJapgolly.lib0.distEncodingMod.IntDiffOptRleEncoder
  
  @JSImport("lib0/dist", "encoding.RleEncoder")
  @js.native
  open class RleEncoder[T] protected ()
    extends typingsJapgolly.lib0.distEncodingMod.RleEncoder[T] {
    /**
      * @param {function(Encoder, T):void} writer
      */
    def this(writer: js.Function2[/* arg0 */ typingsJapgolly.lib0.distEncodingMod.Encoder, /* arg1 */ T, Unit]) = this()
  }
  
  @JSImport("lib0/dist", "encoding.RleIntDiffEncoder")
  @js.native
  open class RleIntDiffEncoder protected ()
    extends typingsJapgolly.lib0.distEncodingMod.RleIntDiffEncoder {
    /**
      * @param {number} start
      */
    def this(start: Double) = this()
  }
  
  @JSImport("lib0/dist", "encoding.StringEncoder")
  @js.native
  open class StringEncoder ()
    extends typingsJapgolly.lib0.distEncodingMod.StringEncoder
  
  @JSImport("lib0/dist", "encoding.UintOptRleEncoder")
  @js.native
  open class UintOptRleEncoder ()
    extends typingsJapgolly.lib0.distEncodingMod.UintOptRleEncoder
  
  inline def createEncoder(): typingsJapgolly.lib0.distEncodingMod.Encoder = ^.asInstanceOf[js.Dynamic].applyDynamic("createEncoder")().asInstanceOf[typingsJapgolly.lib0.distEncodingMod.Encoder]
  
  inline def length(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("length")(encoder.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def set(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, pos: Double, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(encoder.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setUint16(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, pos: Double, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUint16")(encoder.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setUint32(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, pos: Double, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUint32")(encoder.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setUint8(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, pos: Double, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setUint8")(encoder.asInstanceOf[js.Any], pos.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def toUint8Array(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toUint8Array")(encoder.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def verifyLen(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, len: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("verifyLen")(encoder.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def write(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("write")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeAny(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def writeAny(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeAny(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, data: js.Array[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeAny(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, data: js.BigInt): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeAny(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, data: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeAny(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, data: StringDictionary[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeAny(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, data: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def writeAny(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, data: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAny")(encoder.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeBigInt64(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, num: js.BigInt): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBigInt64")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def writeBigUint64(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, num: js.BigInt): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBigUint64")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def writeBinaryEncoder(
    encoder: typingsJapgolly.lib0.distEncodingMod.Encoder,
    append: typingsJapgolly.lib0.distEncodingMod.Encoder
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBinaryEncoder")(encoder.asInstanceOf[js.Any], append.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeFloat32(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFloat32")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeFloat64(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFloat64")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeOnDataView(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, len: Double): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("writeOnDataView")(encoder.asInstanceOf[js.Any], len.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  
  inline def writeUint16(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUint16")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeUint32(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUint32")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeUint32BigEndian(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUint32BigEndian")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeUint8(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUint8")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeUint8Array(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, uint8Array: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeUint8Array")(encoder.asInstanceOf[js.Any], uint8Array.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeVarInt(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeVarInt")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeVarString(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, str: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeVarString")(encoder.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeVarStringNative(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, str: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_writeVarStringNative")(encoder.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeVarStringPolyfill(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, str: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_writeVarStringPolyfill")(encoder.asInstanceOf[js.Any], str.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeVarUint(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, num: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeVarUint")(encoder.asInstanceOf[js.Any], num.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def writeVarUint8Array(encoder: typingsJapgolly.lib0.distEncodingMod.Encoder, uint8Array: js.typedarray.Uint8Array): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeVarUint8Array")(encoder.asInstanceOf[js.Any], uint8Array.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
