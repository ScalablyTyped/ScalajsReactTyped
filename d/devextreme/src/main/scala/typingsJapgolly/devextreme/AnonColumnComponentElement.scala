package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.event
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeListColumn
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeListRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumnComponentElement extends js.Object {
  var column: js.UndefOr[dxTreeListColumn] = js.undefined
  var component: js.UndefOr[dxTreeList] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var event: js.UndefOr[typingsJapgolly.devextreme.mod.DevExpress.event] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var row: js.UndefOr[dxTreeListRowObject] = js.undefined
}

object AnonColumnComponentElement {
  @scala.inline
  def apply(
    column: dxTreeListColumn = null,
    component: dxTreeList = null,
    element: dxElement = null,
    event: event = null,
    model: js.Any = null,
    row: dxTreeListRowObject = null
  ): AnonColumnComponentElement = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumnComponentElement]
  }
}

