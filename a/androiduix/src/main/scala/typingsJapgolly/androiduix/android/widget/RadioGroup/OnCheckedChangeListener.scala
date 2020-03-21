package typingsJapgolly.androiduix.android.widget.RadioGroup

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCheckedChangeListener extends js.Object {
  def onCheckedChanged(group: typingsJapgolly.androiduix.android.widget.RadioGroup, checkedId: String): Unit
}

object OnCheckedChangeListener {
  @scala.inline
  def apply(onCheckedChanged: (typingsJapgolly.androiduix.android.widget.RadioGroup, String) => Callback): OnCheckedChangeListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onCheckedChanged")(js.Any.fromFunction2((t0: typingsJapgolly.androiduix.android.widget.RadioGroup, t1: java.lang.String) => onCheckedChanged(t0, t1).runNow()))
    __obj.asInstanceOf[OnCheckedChangeListener]
  }
}

