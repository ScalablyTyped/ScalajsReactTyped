package typingsJapgolly.rmcPicker.multiPickerMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMultiPickerProp extends js.Object {
  def getValue(): js.Any
}

object IMultiPickerProp {
  @scala.inline
  def apply(getValue: CallbackTo[js.Any]): IMultiPickerProp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.asInstanceOf[IMultiPickerProp]
  }
}

