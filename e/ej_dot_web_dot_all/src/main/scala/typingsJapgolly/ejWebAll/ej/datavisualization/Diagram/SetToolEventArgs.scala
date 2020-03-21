package typingsJapgolly.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetToolEventArgs extends js.Object {
  /** Defines the tool to be activated.
    */
  var action: js.UndefOr[ActiveTool] = js.undefined
  /** Returns the port when mouse move over on it
    */
  var source: js.UndefOr[js.Any] = js.undefined
}

object SetToolEventArgs {
  @scala.inline
  def apply(action: ActiveTool = null, source: js.Any = null): SetToolEventArgs = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetToolEventArgs]
  }
}

