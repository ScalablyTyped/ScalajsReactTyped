package typingsJapgolly.node.zlibMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZlibReset extends js.Object {
  def reset(): Unit
}

object ZlibReset {
  @scala.inline
  def apply(reset: Callback): ZlibReset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[ZlibReset]
  }
}

