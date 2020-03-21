package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaGraphNode extends js.Object {
  def getConnectedPanorama(): js.Promise[IPanorama]
}

object IPanoramaGraphNode {
  @scala.inline
  def apply(getConnectedPanorama: CallbackTo[js.Promise[IPanorama]]): IPanoramaGraphNode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getConnectedPanorama")(getConnectedPanorama.toJsFn)
    __obj.asInstanceOf[IPanoramaGraphNode]
  }
}

