package typingsJapgolly.rcPicker.pickerMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PickerRefConfig extends js.Object {
  def blur(): Unit
  def focus(): Unit
}

object PickerRefConfig {
  @scala.inline
  def apply(blur: Callback, focus: Callback): PickerRefConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("blur")(blur.toJsFn)
    __obj.updateDynamic("focus")(focus.toJsFn)
    __obj.asInstanceOf[PickerRefConfig]
  }
}

