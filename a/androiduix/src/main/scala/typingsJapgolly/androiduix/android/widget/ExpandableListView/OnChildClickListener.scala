package typingsJapgolly.androiduix.android.widget.ExpandableListView

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnChildClickListener extends js.Object {
  def onChildClick(
    parent: typingsJapgolly.androiduix.android.widget.ExpandableListView,
    v: View,
    groupPosition: Double,
    childPosition: Double,
    id: Double
  ): Boolean
}

object OnChildClickListener {
  @scala.inline
  def apply(
    onChildClick: (typingsJapgolly.androiduix.android.widget.ExpandableListView, View, Double, Double, Double) => CallbackTo[Boolean]
  ): OnChildClickListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onChildClick")(js.Any.fromFunction5((t0: typingsJapgolly.androiduix.android.widget.ExpandableListView, t1: typingsJapgolly.androiduix.android.view.View, t2: scala.Double, t3: scala.Double, t4: scala.Double) => onChildClick(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[OnChildClickListener]
  }
}

