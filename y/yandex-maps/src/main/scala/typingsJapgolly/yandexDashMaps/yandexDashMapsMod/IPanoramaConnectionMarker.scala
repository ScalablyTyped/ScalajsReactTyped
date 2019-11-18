package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.data.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaConnectionMarker
  extends IPanoramaConnection
     with IPanoramaMarker

object IPanoramaConnectionMarker {
  @scala.inline
  def apply(
    getConnectedPanorama: CallbackTo[js.Promise[IPanorama]],
    getIconSet: CallbackTo[js.Promise[IPanoramaMarkerIconSet]],
    getPanorama: CallbackTo[IPanorama],
    getPosition: CallbackTo[js.Array[Double]],
    properties: Manager
  ): IPanoramaConnectionMarker = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("getConnectedPanorama")(getConnectedPanorama.toJsFn)
    __obj.updateDynamic("getIconSet")(getIconSet.toJsFn)
    __obj.updateDynamic("getPanorama")(getPanorama.toJsFn)
    __obj.updateDynamic("getPosition")(getPosition.toJsFn)
    __obj.asInstanceOf[IPanoramaConnectionMarker]
  }
}

