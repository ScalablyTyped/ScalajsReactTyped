package typingsJapgolly.androiduix.android.widget.ExpandableListView

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnGroupCollapseListener extends js.Object {
  def onGroupCollapse(groupPosition: Double): Unit
}

object OnGroupCollapseListener {
  @scala.inline
  def apply(onGroupCollapse: Double => Callback): OnGroupCollapseListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onGroupCollapse")(js.Any.fromFunction1((t0: scala.Double) => onGroupCollapse(t0).runNow()))
    __obj.asInstanceOf[OnGroupCollapseListener]
  }
}

