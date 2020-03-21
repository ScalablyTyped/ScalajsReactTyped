package typingsJapgolly.ejWebAll.ej.Grid

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MergeCellInfoEventArgs extends js.Object {
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.undefined
  /** Returns grid cell.
    */
  var cell: js.UndefOr[js.Any] = js.undefined
  /** Method to merge Grid columns.
    */
  var colMerge: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Returns the column object.
    */
  var column: js.UndefOr[js.Any] = js.undefined
  /** Returns current row record object (JSON).
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /** Method to merge Grid rows and columns.
    */
  var merge: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Returns the grid model.
    */
  var model: js.UndefOr[js.Any] = js.undefined
  /** Returns current row record object (JSON).
    */
  var rowData: js.UndefOr[js.Any] = js.undefined
  /** Method to merge Grid rows.
    */
  var rowMerge: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** Returns the text value in the cell.
    */
  var text: js.UndefOr[String] = js.undefined
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object MergeCellInfoEventArgs {
  @scala.inline
  def apply(
    cancel: js.UndefOr[Boolean] = js.undefined,
    cell: js.Any = null,
    colMerge: js.UndefOr[Callback] = js.undefined,
    column: js.Any = null,
    data: js.Any = null,
    merge: js.UndefOr[Callback] = js.undefined,
    model: js.Any = null,
    rowData: js.Any = null,
    rowMerge: js.UndefOr[Callback] = js.undefined,
    text: String = null,
    `type`: String = null
  ): MergeCellInfoEventArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cancel)) __obj.updateDynamic("cancel")(cancel.asInstanceOf[js.Any])
    if (cell != null) __obj.updateDynamic("cell")(cell.asInstanceOf[js.Any])
    colMerge.foreach(p => __obj.updateDynamic("colMerge")(p.toJsFn))
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    merge.foreach(p => __obj.updateDynamic("merge")(p.toJsFn))
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (rowData != null) __obj.updateDynamic("rowData")(rowData.asInstanceOf[js.Any])
    rowMerge.foreach(p => __obj.updateDynamic("rowMerge")(p.toJsFn))
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergeCellInfoEventArgs]
  }
}

