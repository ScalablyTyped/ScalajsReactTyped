package typingsJapgolly.nodeSass.mod.types

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Enumerable extends js.Object {
  def getLength(): Double
  def getValue(index: Double): Value
  def setValue(index: Double, value: Value): Unit
}

object Enumerable {
  @scala.inline
  def apply(
    getLength: CallbackTo[Double],
    getValue: Double => CallbackTo[Value],
    setValue: (Double, Value) => Callback
  ): Enumerable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLength")(getLength.toJsFn)
    __obj.updateDynamic("getValue")(js.Any.fromFunction1((t0: scala.Double) => getValue(t0).runNow()))
    __obj.updateDynamic("setValue")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.nodeSass.mod.types.Value) => setValue(t0, t1).runNow()))
    __obj.asInstanceOf[Enumerable]
  }
}

