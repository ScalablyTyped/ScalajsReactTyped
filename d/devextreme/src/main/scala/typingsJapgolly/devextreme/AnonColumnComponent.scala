package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.event
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGridColumn
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGridRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnComponent extends js.Object {
  var column: js.UndefOr[dxDataGridColumn] = js.undefined
  var component: js.UndefOr[dxDataGrid] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var event: js.UndefOr[typingsJapgolly.devextreme.mod.DevExpress.event] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var row: js.UndefOr[dxDataGridRowObject] = js.undefined
}

object AnonColumnComponent {
  @scala.inline
  def apply(
    column: dxDataGridColumn = null,
    component: dxDataGrid = null,
    element: dxElement = null,
    event: event = null,
    model: js.Any = null,
    row: dxDataGridRowObject = null
  ): AnonColumnComponent = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnComponent]
  }
}

