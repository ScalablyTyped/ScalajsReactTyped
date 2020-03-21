package typingsJapgolly.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDragEventArgs extends js.Object {
  /** Returns that we can drop over the column or not.
    */
  var canDrop: js.UndefOr[Boolean] = js.undefined
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns the column data which is dragged
    */
  var draggedColumn: js.UndefOr[js.Any] = js.undefined
  /** Returns the index of the column being dragged
    */
  var draggedColumnIndex: js.UndefOr[Double] = js.undefined
  /** Returns the control model values.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the target column data
    */
  var targetColumn: js.UndefOr[js.Any] = js.undefined
  /** Returns the index of the target column
    */
  var targetColumnIndex: js.UndefOr[Double] = js.undefined
  /** Returns the event Type.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ColumnDragEventArgs {
  @scala.inline
  def apply(
    canDrop: js.UndefOr[Boolean] = js.undefined,
    cancel: js.UndefOr[Boolean] = js.undefined,
    draggedColumn: js.Any = null,
    draggedColumnIndex: Int | Double = null,
    model: js.Any = null,
    targetColumn: js.Any = null,
    targetColumnIndex: Int | Double = null,
    `type`: String = null
  ): ColumnDragEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canDrop)) __obj.updateDynamic("canDrop")(canDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (draggedColumn != null) __obj.updateDynamic("draggedColumn")(draggedColumn.asInstanceOf[js.Any])
    if (draggedColumnIndex != null) __obj.updateDynamic("draggedColumnIndex")(draggedColumnIndex.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (targetColumn != null) __obj.updateDynamic("targetColumn")(targetColumn.asInstanceOf[js.Any])
    if (targetColumnIndex != null) __obj.updateDynamic("targetColumnIndex")(targetColumnIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDragEventArgs]
  }
}

