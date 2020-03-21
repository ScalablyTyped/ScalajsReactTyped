package typingsJapgolly.officeUiFabricReact.datePickerTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDatePicker extends js.Object {
  /** Sets focus to the text field */
  def focus(): Unit
  /** Reset the state of the picker to the default */
  def reset(): Unit
}

object IDatePicker {
  @scala.inline
  def apply(focus: Callback, reset: Callback): IDatePicker = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.updateDynamic("reset")(reset.toJsFn)
    __obj.asInstanceOf[IDatePicker]
  }
}

