package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDiagram
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxDiagramItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem extends js.Object {
  var component: js.UndefOr[dxDiagram] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var item: js.UndefOr[dxDiagramItem] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
}

object AnonItem {
  @scala.inline
  def apply(
    component: dxDiagram = null,
    element: dxElement = null,
    item: dxDiagramItem = null,
    model: js.Any = null
  ): AnonItem = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItem]
  }
}

