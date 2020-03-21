package typingsJapgolly.ol.kineticMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Kinetic extends js.Object {
  def begin(): Unit
  def end(): Boolean
  def getAngle(): Double
  def getDistance(): Double
  def update(x: Double, y: Double): Unit
}

object Kinetic {
  @scala.inline
  def apply(
    begin: Callback,
    end: CallbackTo[Boolean],
    getAngle: CallbackTo[Double],
    getDistance: CallbackTo[Double],
    update: (Double, Double) => Callback
  ): Kinetic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("begin")(begin.toJsFn)
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.updateDynamic("getAngle")(getAngle.toJsFn)
    __obj.updateDynamic("getDistance")(getDistance.toJsFn)
    __obj.updateDynamic("update")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => update(t0, t1).runNow()))
    __obj.asInstanceOf[Kinetic]
  }
}

