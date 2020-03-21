package typingsJapgolly.androiduix.android.widget.AdapterView

import japgolly.scalajs.react.Callback
import typingsJapgolly.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnItemClickListener extends js.Object {
  def onItemClick(
    parent: typingsJapgolly.androiduix.android.widget.AdapterView[_],
    view: View,
    position: Double,
    id: Double
  ): Unit
}

object OnItemClickListener {
  @scala.inline
  def apply(
    onItemClick: (typingsJapgolly.androiduix.android.widget.AdapterView[js.Any], View, Double, Double) => Callback
  ): OnItemClickListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onItemClick")(js.Any.fromFunction4((t0: typingsJapgolly.androiduix.android.widget.AdapterView[js.Any], t1: typingsJapgolly.androiduix.android.view.View, t2: scala.Double, t3: scala.Double) => onItemClick(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[OnItemClickListener]
  }
}

