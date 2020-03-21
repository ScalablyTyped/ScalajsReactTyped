package typingsJapgolly.dojo.dojox.encoding

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/easy64.html
  *
  *
  */
trait easy64 extends js.Object {
  /**
    * decodes the input string back to array of numbers
    *
    * @param input the input string to decode
    */
  def decode(input: String): Unit
  /**
    * encodes input data in easy64 string
    *
    * @param input an array of numbers (0-255) to encode
    */
  def encode(input: js.Array[_]): Unit
}

object easy64 {
  @scala.inline
  def apply(decode: String => Callback, encode: js.Array[js.Any] => Callback): easy64 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: java.lang.String) => decode(t0).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: js.Array[js.Any]) => encode(t0).runNow()))
    __obj.asInstanceOf[easy64]
  }
}

