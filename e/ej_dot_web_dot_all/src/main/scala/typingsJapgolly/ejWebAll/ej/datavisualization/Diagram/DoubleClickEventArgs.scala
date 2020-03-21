package typingsJapgolly.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DoubleClickEventArgs extends js.Object {
  /** parameter returns the object that is actually clicked
    */
  var actualObject: js.UndefOr[js.Any] = js.undefined
  /** parameter to specify whether or not to cancel the event
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.undefined
  /** parameter returns the selected object
    */
  var element: js.UndefOr[js.Any] = js.undefined
}

object DoubleClickEventArgs {
  @scala.inline
  def apply(
    actualObject: js.Any = null,
    cancel: js.UndefOr[Boolean] = js.undefined,
    diagramId: String = null,
    element: js.Any = null
  ): DoubleClickEventArgs = {
    val __obj = js.Dynamic.literal()
    if (actualObject != null) __obj.updateDynamic("actualObject")(actualObject.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    __obj.asInstanceOf[DoubleClickEventArgs]
  }
}

