package typingsJapgolly.kendoUi.kendo.dataviz.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiagramEditableResize extends js.Object {
  var handles: js.UndefOr[DiagramEditableResizeHandles] = js.undefined
}

object DiagramEditableResize {
  @scala.inline
  def apply(handles: DiagramEditableResizeHandles = null): DiagramEditableResize = {
    val __obj = js.Dynamic.literal()
    if (handles != null) __obj.updateDynamic("handles")(handles.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiagramEditableResize]
  }
}

