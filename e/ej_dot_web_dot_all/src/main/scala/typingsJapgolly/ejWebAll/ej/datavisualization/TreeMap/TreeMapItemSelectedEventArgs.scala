package typingsJapgolly.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeMapItemSelectedEventArgs extends js.Object {
  /** Returns selected treeMapItem object.
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object TreeMapItemSelectedEventArgs {
  @scala.inline
  def apply(originalEvent: js.Any = null): TreeMapItemSelectedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeMapItemSelectedEventArgs]
  }
}

