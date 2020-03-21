package typingsJapgolly.androiduix.android.widget.ExpandableListView

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.androiduix.android.view.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGroupClickListener extends js.Object {
  def onGroupClick(
    parent: typingsJapgolly.androiduix.android.widget.ExpandableListView,
    v: View,
    groupPosition: Double,
    id: Double
  ): Boolean
}

object OnGroupClickListener {
  @scala.inline
  def apply(
    onGroupClick: (typingsJapgolly.androiduix.android.widget.ExpandableListView, View, Double, Double) => CallbackTo[Boolean]
  ): OnGroupClickListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onGroupClick")(js.Any.fromFunction4((t0: typingsJapgolly.androiduix.android.widget.ExpandableListView, t1: typingsJapgolly.androiduix.android.view.View, t2: scala.Double, t3: scala.Double) => onGroupClick(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[OnGroupClickListener]
  }
}

