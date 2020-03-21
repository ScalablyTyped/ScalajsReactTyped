package typingsJapgolly.officeUiFabricReact.checkboxTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICheckbox extends js.Object {
  /** Gets the current checked state. */
  var checked: Boolean
  /** Gets the current indeterminate state. */
  var indeterminate: Boolean
  /** Sets focus to the checkbox. */
  def focus(): Unit
}

object ICheckbox {
  @scala.inline
  def apply(checked: Boolean, focus: Callback, indeterminate: Boolean): ICheckbox = {
    val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], indeterminate = indeterminate.asInstanceOf[js.Any])
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.asInstanceOf[ICheckbox]
  }
}

