package typingsJapgolly.jsfl

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashEdge extends js.Object {
  var cubicSegmentIndex: Double
  var id: Double
  var isLine: Boolean
  var stroke: FlashStroke
  def getControl(i: Double): FlashPoint
  def getHalfEdge(index: Double): FlashHalfEdge
  def setControl(index: Double, x: Double, y: Double): Unit
  def splitEdge(t: Double): Unit
}

object FlashEdge {
  @scala.inline
  def apply(
    cubicSegmentIndex: Double,
    getControl: Double => CallbackTo[FlashPoint],
    getHalfEdge: Double => CallbackTo[FlashHalfEdge],
    id: Double,
    isLine: Boolean,
    setControl: (Double, Double, Double) => Callback,
    splitEdge: Double => Callback,
    stroke: FlashStroke
  ): FlashEdge = {
    val __obj = js.Dynamic.literal(cubicSegmentIndex = cubicSegmentIndex.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isLine = isLine.asInstanceOf[js.Any], stroke = stroke.asInstanceOf[js.Any])
    __obj.updateDynamic("getControl")(js.Any.fromFunction1((t0: scala.Double) => getControl(t0).runNow()))
    __obj.updateDynamic("getHalfEdge")(js.Any.fromFunction1((t0: scala.Double) => getHalfEdge(t0).runNow()))
    __obj.updateDynamic("setControl")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => setControl(t0, t1, t2).runNow()))
    __obj.updateDynamic("splitEdge")(js.Any.fromFunction1((t0: scala.Double) => splitEdge(t0).runNow()))
    __obj.asInstanceOf[FlashEdge]
  }
}

