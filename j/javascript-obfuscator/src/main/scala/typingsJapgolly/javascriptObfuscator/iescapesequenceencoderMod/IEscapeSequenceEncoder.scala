package typingsJapgolly.javascriptObfuscator.iescapesequenceencoderMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEscapeSequenceEncoder extends js.Object {
  /**
    * @param {string} string
    * @param {boolean} encodeAllSymbols
    * @returns {string}
    */
  def encode(string: String, encodeAllSymbols: Boolean): String
}

object IEscapeSequenceEncoder {
  @scala.inline
  def apply(encode: (String, Boolean) => CallbackTo[String]): IEscapeSequenceEncoder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encode")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Boolean) => encode(t0, t1).runNow()))
    __obj.asInstanceOf[IEscapeSequenceEncoder]
  }
}

