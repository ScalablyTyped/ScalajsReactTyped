package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.event
import typingsJapgolly.devextreme.mod.DevExpress.ui.dxResizable
import typingsJapgolly.devextreme.mod._Global_.JQueryEventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventHeight extends js.Object {
  var component: js.UndefOr[dxResizable] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var event: js.UndefOr[typingsJapgolly.devextreme.mod.DevExpress.event] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var jQueryEvent: js.UndefOr[JQueryEventObject] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object AnonEventHeight {
  @scala.inline
  def apply(
    component: dxResizable = null,
    element: dxElement = null,
    event: event = null,
    height: Int | Double = null,
    jQueryEvent: JQueryEventObject = null,
    model: js.Any = null,
    width: Int | Double = null
  ): AnonEventHeight = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (jQueryEvent != null) __obj.updateDynamic("jQueryEvent")(jQueryEvent.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEventHeight]
  }
}

