package typingsJapgolly.finalFormFocus.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FocusableInput extends js.Object {
  var name: String
  def focus(): Unit
}

object FocusableInput {
  @scala.inline
  def apply(focus: Callback, name: String): FocusableInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.asInstanceOf[FocusableInput]
  }
}

