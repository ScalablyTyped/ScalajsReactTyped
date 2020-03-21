package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The HalfEdge object is the directed side of the edge of a Shape object.
  * An edge has two half edges. You can transverse the contours of a shape by "walking around"
  * these half edges. For example, starting from a half edge, you can trace all the half edges
  * around a contour of a shape, and return to the original half edge.  Half edges are ordered.
  * One half edge represents one side of the edge; the other half edge represents the other side.
  */
trait FlashHalfEdge extends js.Object {
  var id: Double
  var index: Double
  def getEdge(): FlashEdge
  def getNext(): FlashHalfEdge
  def getOppositeHalfEdge(): FlashHalfEdge
  def getPrev(): FlashHalfEdge
  def getVertex(): FlashVertex
}

object FlashHalfEdge {
  @scala.inline
  def apply(
    getEdge: CallbackTo[FlashEdge],
    getNext: CallbackTo[FlashHalfEdge],
    getOppositeHalfEdge: CallbackTo[FlashHalfEdge],
    getPrev: CallbackTo[FlashHalfEdge],
    getVertex: CallbackTo[FlashVertex],
    id: Double,
    index: Double
  ): FlashHalfEdge = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
    __obj.updateDynamic("getEdge")(getEdge.toJsFn)
    __obj.updateDynamic("getNext")(getNext.toJsFn)
    __obj.updateDynamic("getOppositeHalfEdge")(getOppositeHalfEdge.toJsFn)
    __obj.updateDynamic("getPrev")(getPrev.toJsFn)
    __obj.updateDynamic("getVertex")(getVertex.toJsFn)
    __obj.asInstanceOf[FlashHalfEdge]
  }
}

