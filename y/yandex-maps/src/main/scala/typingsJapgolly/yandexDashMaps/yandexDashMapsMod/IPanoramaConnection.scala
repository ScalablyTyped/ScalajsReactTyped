package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaConnection extends js.Object {
  def getConnectedPanorama(): js.Promise[IPanorama]
}

object IPanoramaConnection {
  @scala.inline
  def apply(getConnectedPanorama: CallbackTo[js.Promise[IPanorama]]): IPanoramaConnection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getConnectedPanorama")(getConnectedPanorama.toJsFn)
    __obj.asInstanceOf[IPanoramaConnection]
  }
}

