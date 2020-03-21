package typingsJapgolly.androiduix.android.widget.CompoundButton

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCheckedChangeListener extends js.Object {
  def onCheckedChanged(buttonView: typingsJapgolly.androiduix.android.widget.CompoundButton, isChecked: Boolean): Unit
}

object OnCheckedChangeListener {
  @scala.inline
  def apply(onCheckedChanged: (typingsJapgolly.androiduix.android.widget.CompoundButton, Boolean) => Callback): OnCheckedChangeListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onCheckedChanged")(js.Any.fromFunction2((t0: typingsJapgolly.androiduix.android.widget.CompoundButton, t1: scala.Boolean) => onCheckedChanged(t0, t1).runNow()))
    __obj.asInstanceOf[OnCheckedChangeListener]
  }
}

