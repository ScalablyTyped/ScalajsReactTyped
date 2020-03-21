package typingsJapgolly.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDeselectingEventArgs extends js.Object {
  /** Returns corresponding column object (JSON).
    */
  var column: js.UndefOr[js.Any] = js.undefined
  /** Returns the deselecting column index value.
    */
  var columnIndex: js.UndefOr[Double] = js.undefined
  /** Returns the deselecting column header element.
    */
  var headerCell: js.UndefOr[js.Any] = js.undefined
  /** Returns whether the ctrl key is pressed while deselecting column
    */
  var isCtrlKeyPressed: js.UndefOr[Boolean] = js.undefined
  /** Returns whether the shift key is pressed while deselecting column
    */
  var isShiftKeyPressed: js.UndefOr[Boolean] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ColumnDeselectingEventArgs {
  @scala.inline
  def apply(
    column: js.Any = null,
    columnIndex: Int | Double = null,
    headerCell: js.Any = null,
    isCtrlKeyPressed: js.UndefOr[Boolean] = js.undefined,
    isShiftKeyPressed: js.UndefOr[Boolean] = js.undefined,
    model: js.Any = null,
    `type`: String = null
  ): ColumnDeselectingEventArgs = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (headerCell != null) __obj.updateDynamic("headerCell")(headerCell.asInstanceOf[js.Any])
    if (!js.isUndefined(isCtrlKeyPressed)) __obj.updateDynamic("isCtrlKeyPressed")(isCtrlKeyPressed.asInstanceOf[js.Any])
    if (!js.isUndefined(isShiftKeyPressed)) __obj.updateDynamic("isShiftKeyPressed")(isShiftKeyPressed.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDeselectingEventArgs]
  }
}

