package typingsJapgolly.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RightClickEventArgs extends js.Object {
  /** Returns right clicked shape object.
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object RightClickEventArgs {
  @scala.inline
  def apply(originalEvent: js.Any = null): RightClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[RightClickEventArgs]
  }
}

