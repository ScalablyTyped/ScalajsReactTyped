package typingsJapgolly.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupChangeEventArgs extends js.Object {
  /** parameter returns the cause of group change("group", unGroup")
    */
  var cause: js.UndefOr[String] = js.undefined
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.undefined
  /** parameter returns the object that is added to/removed from a group
    */
  var element: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the new parent group(if any) of the object
    */
  var newParent: js.UndefOr[js.Any] = js.undefined
  /** parameter returns the old parent group(if any) of the object
    */
  var oldParent: js.UndefOr[js.Any] = js.undefined
}

object GroupChangeEventArgs {
  @scala.inline
  def apply(
    cause: String = null,
    diagramId: String = null,
    element: js.Any = null,
    newParent: js.Any = null,
    oldParent: js.Any = null
  ): GroupChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (diagramId != null) __obj.updateDynamic("diagramId")(diagramId.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (newParent != null) __obj.updateDynamic("newParent")(newParent.asInstanceOf[js.Any])
    if (oldParent != null) __obj.updateDynamic("oldParent")(oldParent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupChangeEventArgs]
  }
}

