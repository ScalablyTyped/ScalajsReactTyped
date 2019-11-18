package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.yandexDashMaps.yandexDashMapsMod.data.Manager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaConnectionArrow extends IPanoramaConnection {
  var properties: Manager
  def getDirection(): js.Array[Double]
  def getPanorama(): IPanorama
}

object IPanoramaConnectionArrow {
  @scala.inline
  def apply(
    getConnectedPanorama: CallbackTo[js.Promise[IPanorama]],
    getDirection: CallbackTo[js.Array[Double]],
    getPanorama: CallbackTo[IPanorama],
    properties: Manager
  ): IPanoramaConnectionArrow = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("getConnectedPanorama")(getConnectedPanorama.toJsFn)
    __obj.updateDynamic("getDirection")(getDirection.toJsFn)
    __obj.updateDynamic("getPanorama")(getPanorama.toJsFn)
    __obj.asInstanceOf[IPanoramaConnectionArrow]
  }
}

