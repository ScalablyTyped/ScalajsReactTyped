package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeList
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxTreeListRowObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponentDxTreeList extends js.Object {
  var component: js.UndefOr[dxTreeList] = js.undefined
  var row: js.UndefOr[dxTreeListRowObject] = js.undefined
}

object AnonComponentDxTreeList {
  @scala.inline
  def apply(component: dxTreeList = null, row: dxTreeListRowObject = null): AnonComponentDxTreeList = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponentDxTreeList]
  }
}

