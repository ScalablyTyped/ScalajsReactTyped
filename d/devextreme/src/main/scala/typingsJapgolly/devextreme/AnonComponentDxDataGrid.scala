package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDataGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponentDxDataGrid extends js.Object {
  var component: js.UndefOr[dxDataGrid] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
}

object AnonComponentDxDataGrid {
  @scala.inline
  def apply(component: dxDataGrid = null, element: dxElement = null, model: js.Any = null): AnonComponentDxDataGrid = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponentDxDataGrid]
  }
}

