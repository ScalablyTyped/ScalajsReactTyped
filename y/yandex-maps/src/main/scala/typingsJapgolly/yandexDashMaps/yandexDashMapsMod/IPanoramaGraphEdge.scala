package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanoramaGraphEdge extends js.Object {
  def getEndNodes(): js.Array[IPanoramaGraphNode]
}

object IPanoramaGraphEdge {
  @scala.inline
  def apply(getEndNodes: CallbackTo[js.Array[IPanoramaGraphNode]]): IPanoramaGraphEdge = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEndNodes")(getEndNodes.toJsFn)
    __obj.asInstanceOf[IPanoramaGraphEdge]
  }
}

