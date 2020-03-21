package typingsJapgolly.uifabricUtilities

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFocus extends js.Object {
  def focus(): Unit
}

object AnonFocus {
  @scala.inline
  def apply(focus: Callback): AnonFocus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.asInstanceOf[AnonFocus]
  }
}

