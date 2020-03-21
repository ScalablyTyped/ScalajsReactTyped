package typingsJapgolly.androiduix.android.widget.NumberPicker

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnValueChangeListener extends js.Object {
  def onValueChange(picker: typingsJapgolly.androiduix.android.widget.NumberPicker, oldVal: Double, newVal: Double): Unit
}

object OnValueChangeListener {
  @scala.inline
  def apply(
    onValueChange: (typingsJapgolly.androiduix.android.widget.NumberPicker, Double, Double) => Callback
  ): OnValueChangeListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onValueChange")(js.Any.fromFunction3((t0: typingsJapgolly.androiduix.android.widget.NumberPicker, t1: scala.Double, t2: scala.Double) => onValueChange(t0, t1, t2).runNow()))
    __obj.asInstanceOf[OnValueChangeListener]
  }
}

