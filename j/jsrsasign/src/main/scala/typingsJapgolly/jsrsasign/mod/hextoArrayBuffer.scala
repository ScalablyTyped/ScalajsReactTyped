package typingsJapgolly.jsrsasign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsrsasign", "hextoArrayBuffer")
@js.native
object hextoArrayBuffer extends js.Object {
  /**
    * convert a hexadecimal string to an ArrayBuffer
    * @param hex hexadecimal string
    * @return ArrayBuffer
    * @description
    * This function converts from a hexadecimal string to an ArrayBuffer.
    * @example
    * hextoArrayBuffer("fffa01") → ArrayBuffer of [255, 250, 1]
    */
  def apply(hex: String): scala.scalajs.js.typedarray.ArrayBuffer = js.native
}

