package typingsJapgolly.googlemaps.google.maps

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolyMouseEvent extends MouseEvent {
  var edge: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[Double] = js.undefined
  var vertex: js.UndefOr[Double] = js.undefined
}

object PolyMouseEvent {
  @scala.inline
  def apply(
    latLng: LatLng,
    stop: Callback,
    edge: Int | Double = null,
    path: Int | Double = null,
    vertex: Int | Double = null
  ): PolyMouseEvent = {
    val __obj = js.Dynamic.literal(latLng = latLng.asInstanceOf[js.Any])
    __obj.updateDynamic("stop")(stop.toJsFn)
    if (edge != null) __obj.updateDynamic("edge")(edge.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (vertex != null) __obj.updateDynamic("vertex")(vertex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolyMouseEvent]
  }
}

