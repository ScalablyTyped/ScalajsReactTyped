package typingsJapgolly.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuBeforeOpenEventArgs extends js.Object {
  /** parameter returns whether or not to cancel the dragOver event
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** parameter returns the actual arguments from context menu
    */
  var contextmenu: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the diagram object
    */
  var diagram: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.undefined
  /** parameter returns the actual click event arguments that explains which button is clicked
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the object that was clicked
    */
  var target: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the type of the event triggered
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ContextMenuBeforeOpenEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    contextmenu: js.Any = null,
    diagram: js.Any = null,
    diagramId: String = null,
    model: js.Any = null,
    target: js.Any = null,
    `type`: String = null
  ): ContextMenuBeforeOpenEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (contextmenu != null) __obj.updateDynamic("contextmenu")(contextmenu.asInstanceOf[js.Any])
    if (diagram != null) __obj.updateDynamic("diagram")(diagram.asInstanceOf[js.Any])
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuBeforeOpenEventArgs]
  }
}

