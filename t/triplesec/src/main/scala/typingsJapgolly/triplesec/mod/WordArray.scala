package typingsJapgolly.triplesec.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WordArray extends js.Object {
  var sigBytes: Double
  var words: js.Array[Double]
  def to_hex(): String
}

object WordArray {
  @scala.inline
  def apply(sigBytes: Double, to_hex: CallbackTo[String], words: js.Array[Double]): WordArray = {
    val __obj = js.Dynamic.literal(sigBytes = sigBytes.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.updateDynamic("to_hex")(to_hex.toJsFn)
    __obj.asInstanceOf[WordArray]
  }
}

