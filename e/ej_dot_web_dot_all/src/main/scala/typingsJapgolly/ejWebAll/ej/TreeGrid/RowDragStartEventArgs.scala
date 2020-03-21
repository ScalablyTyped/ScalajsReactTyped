package typingsJapgolly.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RowDragStartEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the row which we start to drag.
    */
  var draggedRow: js.UndefOr[js.Any] = js.undefined
  /** Returns the row index which we start to drag.
    */
  var draggedRowIndex: js.UndefOr[Boolean] = js.undefined
  /** Returns the TreeGrid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns request type.
    */
  var requestType: js.UndefOr[String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object RowDragStartEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    draggedRow: js.Any = null,
    draggedRowIndex: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    requestType: String = null,
    `type`: String = null
  ): RowDragStartEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (draggedRow != null) __obj.updateDynamic("draggedRow")(draggedRow.asInstanceOf[js.Any])
    if (!js.isUndefined(draggedRowIndex)) __obj.updateDynamic("draggedRowIndex")(draggedRowIndex.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (requestType != null) __obj.updateDynamic("requestType")(requestType.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowDragStartEventArgs]
  }
}

