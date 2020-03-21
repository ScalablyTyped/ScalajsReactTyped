package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.event
import typingsJapgolly.devextreme.mod.DevExpress.viz.dxSankey
import typingsJapgolly.devextreme.mod.DevExpress.viz.dxSankeyLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventModelTarget extends js.Object {
  var component: js.UndefOr[dxSankey] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var event: js.UndefOr[typingsJapgolly.devextreme.mod.DevExpress.event] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var target: js.UndefOr[dxSankeyLink] = js.undefined
}

object AnonEventModelTarget {
  @scala.inline
  def apply(
    component: dxSankey = null,
    element: dxElement = null,
    event: event = null,
    model: js.Any = null,
    target: dxSankeyLink = null
  ): AnonEventModelTarget = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEventModelTarget]
  }
}

