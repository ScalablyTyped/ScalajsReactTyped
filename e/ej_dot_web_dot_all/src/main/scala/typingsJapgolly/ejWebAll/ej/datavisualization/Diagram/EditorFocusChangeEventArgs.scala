package typingsJapgolly.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorFocusChangeEventArgs extends js.Object {
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.undefined
  /** parameter returns the editor element
    */
  var event: js.UndefOr[js.Any] = js.undefined
  /** Returns the diagram model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object EditorFocusChangeEventArgs {
  @scala.inline
  def apply(diagramId: String = null, event: js.Any = null, model: js.Any = null, `type`: String = null): EditorFocusChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorFocusChangeEventArgs]
  }
}

