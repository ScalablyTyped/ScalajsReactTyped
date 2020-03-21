package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOriginalRoute extends js.Object {
  var component: js.UndefOr[dxMap] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var options: js.UndefOr[js.Any] = js.undefined
  var originalRoute: js.UndefOr[js.Any] = js.undefined
}

object AnonOriginalRoute {
  @scala.inline
  def apply(
    component: dxMap = null,
    element: dxElement = null,
    model: js.Any = null,
    options: js.Any = null,
    originalRoute: js.Any = null
  ): AnonOriginalRoute = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    if (originalRoute != null) __obj.updateDynamic("originalRoute")(originalRoute.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOriginalRoute]
  }
}

