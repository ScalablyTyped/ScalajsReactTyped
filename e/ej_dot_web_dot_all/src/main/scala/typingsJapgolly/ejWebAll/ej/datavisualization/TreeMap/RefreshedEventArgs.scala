package typingsJapgolly.ejWebAll.ej.datavisualization.TreeMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RefreshedEventArgs extends js.Object {
  /** Refresh and load the treemap.
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object RefreshedEventArgs {
  @scala.inline
  def apply(originalEvent: js.Any = null): RefreshedEventArgs = {
    val __obj = js.Dynamic.literal()
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshedEventArgs]
  }
}

