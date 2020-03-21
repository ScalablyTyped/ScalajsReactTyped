package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGridRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRowIndex extends js.Object {
  var column: js.UndefOr[this.type] = js.undefined
  var columnIndex: js.UndefOr[Double] = js.undefined
  var component: js.UndefOr[dxDataGrid] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var displayValue: js.UndefOr[js.Any] = js.undefined
  var row: js.UndefOr[dxDataGridRowObject] = js.undefined
  var rowIndex: js.UndefOr[Double] = js.undefined
  var rowType: js.UndefOr[String] = js.undefined
  var setValue: js.UndefOr[js.Any] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
  var watch: js.UndefOr[js.Function] = js.undefined
}

object AnonRowIndex {
  @scala.inline
  def apply(
    column: AnonRowIndex = null,
    columnIndex: Int | Double = null,
    component: dxDataGrid = null,
    data: js.Any = null,
    displayValue: js.Any = null,
    row: dxDataGridRowObject = null,
    rowIndex: Int | Double = null,
    rowType: String = null,
    setValue: js.Any = null,
    text: String = null,
    value: js.Any = null,
    watch: js.Function = null
  ): AnonRowIndex = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (columnIndex != null) __obj.updateDynamic("columnIndex")(columnIndex.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (displayValue != null) __obj.updateDynamic("displayValue")(displayValue.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (rowIndex != null) __obj.updateDynamic("rowIndex")(rowIndex.asInstanceOf[js.Any])
    if (rowType != null) __obj.updateDynamic("rowType")(rowType.asInstanceOf[js.Any])
    if (setValue != null) __obj.updateDynamic("setValue")(setValue.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    if (watch != null) __obj.updateDynamic("watch")(watch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRowIndex]
  }
}

