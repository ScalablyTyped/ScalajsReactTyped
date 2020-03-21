package typingsJapgolly.grahamScan.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.grahamScan.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConvexHullGrahamScan extends js.Object {
  def addPoint(x: Double, y: Double): Unit
  def getHull(): js.Array[AnonX]
}

object ConvexHullGrahamScan {
  @scala.inline
  def apply(addPoint: (Double, Double) => Callback, getHull: CallbackTo[js.Array[AnonX]]): ConvexHullGrahamScan = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addPoint")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => addPoint(t0, t1).runNow()))
    __obj.updateDynamic("getHull")(getHull.toJsFn)
    __obj.asInstanceOf[ConvexHullGrahamScan]
  }
}

