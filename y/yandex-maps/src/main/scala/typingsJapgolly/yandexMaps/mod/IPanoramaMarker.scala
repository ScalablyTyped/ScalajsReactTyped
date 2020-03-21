package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.yandexMaps.mod.data.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaMarker extends js.Object {
  var properties: Manager
  def getIconSet(): js.Promise[IPanoramaMarkerIconSet]
  def getPanorama(): IPanorama
  def getPosition(): js.Array[Double]
}

object IPanoramaMarker {
  @scala.inline
  def apply(
    getIconSet: CallbackTo[js.Promise[IPanoramaMarkerIconSet]],
    getPanorama: CallbackTo[IPanorama],
    getPosition: CallbackTo[js.Array[Double]],
    properties: Manager
  ): IPanoramaMarker = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("getIconSet")(getIconSet.toJsFn)
    __obj.updateDynamic("getPanorama")(getPanorama.toJsFn)
    __obj.updateDynamic("getPosition")(getPosition.toJsFn)
    __obj.asInstanceOf[IPanoramaMarker]
  }
}

