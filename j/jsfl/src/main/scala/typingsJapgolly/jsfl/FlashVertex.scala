package typingsJapgolly.jsfl

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlashVertex extends js.Object {
  var x: Double
  var y: Double
  def getHalfEdge(): FlashHalfEdge
  def setLocation(x: Double, y: Double): js.Any
}

object FlashVertex {
  @scala.inline
  def apply(
    getHalfEdge: CallbackTo[FlashHalfEdge],
    setLocation: (Double, Double) => CallbackTo[js.Any],
    x: Double,
    y: Double
  ): FlashVertex = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("getHalfEdge")(getHalfEdge.toJsFn)
    __obj.updateDynamic("setLocation")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => setLocation(t0, t1).runNow()))
    __obj.asInstanceOf[FlashVertex]
  }
}

