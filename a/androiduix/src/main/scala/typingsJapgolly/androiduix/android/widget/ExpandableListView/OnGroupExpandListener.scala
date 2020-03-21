package typingsJapgolly.androiduix.android.widget.ExpandableListView

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGroupExpandListener extends js.Object {
  def onGroupExpand(groupPosition: Double): Unit
}

object OnGroupExpandListener {
  @scala.inline
  def apply(onGroupExpand: Double => Callback): OnGroupExpandListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onGroupExpand")(js.Any.fromFunction1((t0: scala.Double) => onGroupExpand(t0).runNow()))
    __obj.asInstanceOf[OnGroupExpandListener]
  }
}

