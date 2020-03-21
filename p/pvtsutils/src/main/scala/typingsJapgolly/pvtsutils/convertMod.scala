package typingsJapgolly.pvtsutils

import typingsJapgolly.std.BufferSource
import typingsJapgolly.std.SharedArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pvtsutils/build/types/convert", JSImport.Namespace)
@js.native
object convertMod extends js.Object {
  @js.native
  class Convert () extends js.Object
  
  trait _BufferEncoding extends js.Object
  
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
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.pvtsutils.pvtsutilsStrings.utf8
    - typingsJapgolly.pvtsutils.pvtsutilsStrings.binary
    - typingsJapgolly.pvtsutils.pvtsutilsStrings.base64
    - typingsJapgolly.pvtsutils.pvtsutilsStrings.base64url
    - typingsJapgolly.pvtsutils.pvtsutilsStrings.hex
    - java.lang.String
  */
  type BufferEncoding = _BufferEncoding | String
}

