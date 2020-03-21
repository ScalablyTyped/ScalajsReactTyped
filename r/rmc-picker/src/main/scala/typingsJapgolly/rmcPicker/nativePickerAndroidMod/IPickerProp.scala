package typingsJapgolly.rmcPicker.nativePickerAndroidMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPickerProp extends js.Object {
  def doScrollingComplete(arg: js.Any*): Unit
  def select(arg: js.Any*): Unit
}

object IPickerProp {
  @scala.inline
  def apply(doScrollingComplete: /* repeated */ js.Any => Callback, select: /* repeated */ js.Any => Callback): IPickerProp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("doScrollingComplete")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => doScrollingComplete(t0).runNow()))
    __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => select(t0).runNow()))
    __obj.asInstanceOf[IPickerProp]
  }
}

