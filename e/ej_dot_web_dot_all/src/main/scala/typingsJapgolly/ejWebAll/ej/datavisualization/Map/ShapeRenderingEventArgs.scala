package typingsJapgolly.ejWebAll.ej.datavisualization.Map

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeRenderingEventArgs extends js.Object {
  /** Returns the shape values.
    */
  var originalEvent: js.UndefOr[js.Any] = js.undefined
}

object ShapeRenderingEventArgs {
  @scala.inline
  def apply(originalEvent: js.Any = null): ShapeRenderingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeRenderingEventArgs]
  }
}

