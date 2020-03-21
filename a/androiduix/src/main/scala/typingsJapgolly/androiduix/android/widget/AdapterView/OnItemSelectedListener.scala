package typingsJapgolly.androiduix.android.widget.AdapterView

import japgolly.scalajs.react.Callback
import typingsJapgolly.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnItemSelectedListener extends js.Object {
  def onItemSelected(
    parent: typingsJapgolly.androiduix.android.widget.AdapterView[_],
    view: View,
    position: Double,
    id: Double
  ): Unit
  def onNothingSelected(parent: typingsJapgolly.androiduix.android.widget.AdapterView[_]): Unit
}

object OnItemSelectedListener {
  @scala.inline
  def apply(
    onItemSelected: (typingsJapgolly.androiduix.android.widget.AdapterView[js.Any], View, Double, Double) => Callback,
    onNothingSelected: typingsJapgolly.androiduix.android.widget.AdapterView[js.Any] => Callback
  ): OnItemSelectedListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onItemSelected")(js.Any.fromFunction4((t0: typingsJapgolly.androiduix.android.widget.AdapterView[js.Any], t1: typingsJapgolly.androiduix.android.view.View, t2: scala.Double, t3: scala.Double) => onItemSelected(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("onNothingSelected")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.widget.AdapterView[js.Any]) => onNothingSelected(t0).runNow()))
    __obj.asInstanceOf[OnItemSelectedListener]
  }
}

