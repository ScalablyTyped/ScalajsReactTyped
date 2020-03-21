package typingsJapgolly.antd.formListMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Operation extends js.Object {
  def add(): Unit
  def move(from: Double, to: Double): Unit
  def remove(index: Double): Unit
}

object Operation {
  @scala.inline
  def apply(add: Callback, move: (Double, Double) => Callback, remove: Double => Callback): Operation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(add.toJsFn)
    __obj.updateDynamic("move")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => move(t0, t1).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: scala.Double) => remove(t0).runNow()))
    __obj.asInstanceOf[Operation]
  }
}

