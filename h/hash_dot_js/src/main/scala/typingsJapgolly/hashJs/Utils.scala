package typingsJapgolly.hashJs

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.hashJs.hashJsStrings.hex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Utils extends js.Object {
  @JSName("toArray")
  def toArray_hex(msg: js.Any, enc: hex): js.Array[Double]
  def toHex(msg: js.Any): String
}

object Utils {
  @scala.inline
  def apply(toArray: (js.Any, hex) => CallbackTo[js.Array[Double]], toHex: js.Any => CallbackTo[String]): Utils = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toArray")(js.Any.fromFunction2((t0: js.Any, t1: typingsJapgolly.hashJs.hashJsStrings.hex) => toArray(t0, t1).runNow()))
    __obj.updateDynamic("toHex")(js.Any.fromFunction1((t0: js.Any) => toHex(t0).runNow()))
    __obj.asInstanceOf[Utils]
  }
}

