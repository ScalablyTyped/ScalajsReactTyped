package typingsJapgolly.dojo.dojox.encoding

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/encoding/base64.html
  *
  *
  */
trait base64 extends js.Object {
  /**
    * Convert a base64-encoded string to an array of bytes
    *
    * @param str
    */
  def decode(str: String): Unit
  /**
    * Encode an array of bytes as a base64-encoded string
    *
    * @param ba
    */
  def encode(ba: js.Array[Double]): Unit
}

object base64 {
  @scala.inline
  def apply(decode: String => Callback, encode: js.Array[Double] => Callback): base64 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: java.lang.String) => decode(t0).runNow()))
    __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => encode(t0).runNow()))
    __obj.asInstanceOf[base64]
  }
}

