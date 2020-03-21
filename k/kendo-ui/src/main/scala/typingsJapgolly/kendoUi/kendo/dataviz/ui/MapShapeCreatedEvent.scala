package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.kendo.dataviz.map.layer.Shape
import typingsJapgolly.kendoUi.kendo.drawing.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapShapeCreatedEvent extends MapEvent {
  var layer: js.UndefOr[Shape] = js.undefined
  var originalEvent: js.UndefOr[js.Any] = js.undefined
  var shape: js.UndefOr[Element] = js.undefined
}

object MapShapeCreatedEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Map,
    layer: Shape = null,
    originalEvent: js.Any = null,
    shape: Element = null
  ): MapShapeCreatedEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (originalEvent != null) __obj.updateDynamic("originalEvent")(originalEvent.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapShapeCreatedEvent]
  }
}

