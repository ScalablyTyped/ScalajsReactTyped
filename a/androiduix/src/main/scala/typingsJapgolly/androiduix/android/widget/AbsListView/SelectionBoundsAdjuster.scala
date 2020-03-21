package typingsJapgolly.androiduix.android.widget.AbsListView

import japgolly.scalajs.react.Callback
import typingsJapgolly.androiduix.android.graphics.Rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectionBoundsAdjuster extends js.Object {
  def adjustListItemSelectionBounds(bounds: Rect): Unit
}

object SelectionBoundsAdjuster {
  @scala.inline
  def apply(adjustListItemSelectionBounds: Rect => Callback): SelectionBoundsAdjuster = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("adjustListItemSelectionBounds")(js.Any.fromFunction1((t0: typingsJapgolly.androiduix.android.graphics.Rect) => adjustListItemSelectionBounds(t0).runNow()))
    __obj.asInstanceOf[SelectionBoundsAdjuster]
  }
}

