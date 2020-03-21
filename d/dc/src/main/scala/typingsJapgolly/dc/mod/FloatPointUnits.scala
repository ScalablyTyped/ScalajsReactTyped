package typingsJapgolly.dc.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FloatPointUnits extends js.Object {
  def precision(precision: Double): UnitFunction
}

object FloatPointUnits {
  @scala.inline
  def apply(precision: Double => CallbackTo[UnitFunction]): FloatPointUnits = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("precision")(js.Any.fromFunction1((t0: scala.Double) => precision(t0).runNow()))
    __obj.asInstanceOf[FloatPointUnits]
  }
}

