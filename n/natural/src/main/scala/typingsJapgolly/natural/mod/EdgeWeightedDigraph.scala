package typingsJapgolly.natural.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EdgeWeightedDigraph extends js.Object {
  def add(start: Double, end: Double, weight: Double): Unit
  def e(): Double
  def v(): Double
}

object EdgeWeightedDigraph {
  @scala.inline
  def apply(add: (Double, Double, Double) => Callback, e: CallbackTo[Double], v: CallbackTo[Double]): EdgeWeightedDigraph = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Double, t2: scala.Double) => add(t0, t1, t2).runNow()))
    __obj.updateDynamic("e")(e.toJsFn)
    __obj.updateDynamic("v")(v.toJsFn)
    __obj.asInstanceOf[EdgeWeightedDigraph]
  }
}

