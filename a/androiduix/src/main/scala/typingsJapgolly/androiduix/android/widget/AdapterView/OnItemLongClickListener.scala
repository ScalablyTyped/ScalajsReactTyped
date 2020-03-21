package typingsJapgolly.androiduix.android.widget.AdapterView

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnItemLongClickListener extends js.Object {
  def onItemLongClick(
    parent: typingsJapgolly.androiduix.android.widget.AdapterView[_],
    view: View,
    position: Double,
    id: Double
  ): Boolean
}

object OnItemLongClickListener {
  @scala.inline
  def apply(
    onItemLongClick: (typingsJapgolly.androiduix.android.widget.AdapterView[js.Any], View, Double, Double) => CallbackTo[Boolean]
  ): OnItemLongClickListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onItemLongClick")(js.Any.fromFunction4((t0: typingsJapgolly.androiduix.android.widget.AdapterView[js.Any], t1: typingsJapgolly.androiduix.android.view.View, t2: scala.Double, t3: scala.Double) => onItemLongClick(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[OnItemLongClickListener]
  }
}

