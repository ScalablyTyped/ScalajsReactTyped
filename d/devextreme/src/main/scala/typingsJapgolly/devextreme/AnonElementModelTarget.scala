package typingsJapgolly.devextreme

import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.viz.basePointObject
import typingsJapgolly.devextreme.mod.DevExpress.viz.dxChartAnnotationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElementModelTarget[T] extends js.Object {
  var component: js.UndefOr[T] = js.undefined
  var element: js.UndefOr[dxElement] = js.undefined
  var model: js.UndefOr[js.Any] = js.undefined
  var target: js.UndefOr[basePointObject | dxChartAnnotationConfig | js.Any] = js.undefined
}

object AnonElementModelTarget {
  @scala.inline
  def apply[T](
    component: T = null,
    element: dxElement = null,
    model: js.Any = null,
    target: basePointObject | dxChartAnnotationConfig | js.Any = null
  ): AnonElementModelTarget[T] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (element != null) __obj.updateDynamic("element")(element.asInstanceOf[js.Any])
    if (model != null) __obj.updateDynamic("model")(model.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonElementModelTarget[T]]
  }
}

