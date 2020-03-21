package typingsJapgolly.kendoUi.kendo.dataviz.ui

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.kendo.dataviz.map.Marker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapMarkerCreatedEvent extends MapEvent {
  var layer: js.UndefOr[Marker] = js.undefined
  var marker: js.UndefOr[Marker] = js.undefined
}

object MapMarkerCreatedEvent {
  @scala.inline
  def apply(
    isDefaultPrevented: CallbackTo[Boolean],
    preventDefault: js.Function,
    sender: Map,
    layer: Marker = null,
    marker: Marker = null
  ): MapMarkerCreatedEvent = {
    val __obj = js.Dynamic.literal(preventDefault = preventDefault.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
    __obj.updateDynamic("isDefaultPrevented")(isDefaultPrevented.toJsFn)
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapMarkerCreatedEvent]
  }
}

