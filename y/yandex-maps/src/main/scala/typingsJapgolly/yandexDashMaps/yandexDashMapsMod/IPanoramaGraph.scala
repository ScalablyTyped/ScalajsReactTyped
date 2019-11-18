package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaGraph extends js.Object {
  def getEdges(): js.Array[IPanoramaGraphEdge]
  def getNodes(): js.Array[IPanoramaGraphEdge]
  def getPanorama(): IPanorama
}

object IPanoramaGraph {
  @scala.inline
  def apply(
    getEdges: CallbackTo[js.Array[IPanoramaGraphEdge]],
    getNodes: CallbackTo[js.Array[IPanoramaGraphEdge]],
    getPanorama: CallbackTo[IPanorama]
  ): IPanoramaGraph = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEdges")(getEdges.toJsFn)
    __obj.updateDynamic("getNodes")(getNodes.toJsFn)
    __obj.updateDynamic("getPanorama")(getPanorama.toJsFn)
    __obj.asInstanceOf[IPanoramaGraph]
  }
}

