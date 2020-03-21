package typingsJapgolly.pvtsutils

import typingsJapgolly.pvtsutils.convertMod.BufferEncoding
import typingsJapgolly.std.BufferSource
import typingsJapgolly.std.SharedArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pvtsutils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BufferSourceConverter ()
    extends typingsJapgolly.pvtsutils.bufferSourceConverterMod.BufferSourceConverter
  
  @js.native
  class Convert ()
    extends typingsJapgolly.pvtsutils.convertMod.Convert
  
  def assign(target: js.Any, sources: js.Any*): js.Any = js.native
  def combine(buf: scala.scalajs.js.typedarray.ArrayBuffer*): scala.scalajs.js.typedarray.ArrayBuffer | SharedArrayBuffer = js.native
  def isEqual(bytes1: scala.scalajs.js.typedarray.ArrayBuffer, bytes2: scala.scalajs.js.typedarray.ArrayBuffer): Boolean = js.native
  /* static members */
  @js.native
  object BufferSourceConverter extends js.Object {
    def isBufferSource(data: js.Any): /* is std.BufferSource */ Boolean = js.native
    def toArrayBuffer(data: BufferSource): scala.scalajs.js.typedarray.ArrayBuffer = js.native
    def toUint8Array(data: BufferSource): scala.scalajs.js.typedarray.Uint8Array = js.native
  }
  
  /* static members */
  @js.native
  object Convert extends js.Object {
    /* protected */ def Base64Padding(base64: String): String = js.native
    def FromBase64(base64Text: String): scala.scalajs.js.typedarray.ArrayBuffer | SharedArrayBuffer = js.native
    def FromBase64Url(base64url: String): scala.scalajs.js.typedarray.ArrayBuffer | SharedArrayBuffer = js.native
    def FromBinary(text: String): scala.scalajs.js.typedarray.ArrayBuffer | SharedArrayBuffer = js.native
    /**
      * Converts HEX string to buffer
      *
      * @static
      * @param {string} hexString
      * @returns {Uint8Array}
      *
      * @memberOf Convert
      */
    def FromHex(hexString: String): scala.scalajs.js.typedarray.ArrayBuffer | SharedArrayBuffer = js.native
    def FromString(str: String): scala.scalajs.js.typedarray.ArrayBuffer | SharedArrayBuffer = js.native
    def FromString(str: String, enc: BufferEncoding): scala.scalajs.js.typedarray.ArrayBuffer | SharedArrayBuffer = js.native
    def FromUtf8String(text: String): scala.scalajs.js.typedarray.ArrayBuffer | SharedArrayBuffer = js.native
    def ToBase64(buffer: BufferSource): String = js.native
    def ToBase64Url(data: BufferSource): String = js.native
    def ToBinary(buffer: BufferSource): String = js.native
    /**
      * Converts buffer to HEX string
      * @param  {BufferSource} buffer Incoming buffer
      * @returns string
      */
    def ToHex(buffer: BufferSource): String = js.native
    def ToString(buffer: BufferSource): String = js.native
    def ToString(buffer: BufferSource, enc: BufferEncoding): String = js.native
    def ToUtf8String(buffer: BufferSource): String = js.native
  }
  
}

