package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.kendo.dataviz.map.layer.Shape
import typingsJapgolly.kendoUi.kendo.drawing.Group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapShapeFeatureCreatedEvent extends MapEvent {
  var dataItem: js.UndefOr[js.Any] = js.undefined
  var group: js.UndefOr[Group] = js.undefined
  var layer: js.UndefOr[Shape] = js.undefined
  var properties: js.UndefOr[js.Any] = js.undefined
}

object MapShapeFeatureCreatedEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Map,
    dataItem: js.Any = null,
    group: Group = null,
    layer: Shape = null,
    properties: js.Any = null
  ): MapShapeFeatureCreatedEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (dataItem != null) __obj.updateDynamic("dataItem")(dataItem.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapShapeFeatureCreatedEvent]
  }
}

