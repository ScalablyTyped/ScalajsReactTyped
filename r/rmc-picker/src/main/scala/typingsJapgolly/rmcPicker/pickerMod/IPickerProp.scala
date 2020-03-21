package typingsJapgolly.rmcPicker.pickerMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPickerProp extends js.Object {
  def computeChildIndex(arg: js.Any*): Double
  def doScrollingComplete(arg: js.Any*): Unit
  def select(arg: js.Any*): Unit
}

object IPickerProp {
  @scala.inline
  def apply(
    computeChildIndex: /* repeated */ js.Any => CallbackTo[Double],
    doScrollingComplete: /* repeated */ js.Any => Callback,
    select: /* repeated */ js.Any => Callback
  ): IPickerProp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("computeChildIndex")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => computeChildIndex(t0).runNow()))
    __obj.updateDynamic("doScrollingComplete")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => doScrollingComplete(t0).runNow()))
    __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => select(t0).runNow()))
    __obj.asInstanceOf[IPickerProp]
  }
}

