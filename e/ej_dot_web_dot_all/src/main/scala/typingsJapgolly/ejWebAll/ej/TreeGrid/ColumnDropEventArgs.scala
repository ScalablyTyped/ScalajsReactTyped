package typingsJapgolly.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDropEventArgs extends js.Object {
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

object ColumnDropEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    draggedColumn: js.Any = null,
    draggedColumnIndex: Int | Double = null,
    model: js.Any = null,
    targetColumn: js.Any = null,
    targetColumnIndex: Int | Double = null,
    `type`: String = null
  ): ColumnDropEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (draggedColumn != null) __obj.updateDynamic("draggedColumn")(draggedColumn.asInstanceOf[js.Any])
    if (draggedColumnIndex != null) __obj.updateDynamic("draggedColumnIndex")(draggedColumnIndex.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (targetColumn != null) __obj.updateDynamic("targetColumn")(targetColumn.asInstanceOf[js.Any])
    if (targetColumnIndex != null) __obj.updateDynamic("targetColumnIndex")(targetColumnIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDropEventArgs]
  }
}

