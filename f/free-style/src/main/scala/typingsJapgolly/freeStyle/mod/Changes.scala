package typingsJapgolly.freeStyle.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Changes extends js.Object {
  def add(style: Container[_], index: Double): Unit
  def change(style: Container[_], oldIndex: Double, newIndex: Double): Unit
  def remove(style: Container[_], index: Double): Unit
}

object Changes {
  @scala.inline
  def apply(
    add: (Container[js.Any], Double) => Callback,
    change: (Container[js.Any], Double, Double) => Callback,
    remove: (Container[js.Any], Double) => Callback
  ): Changes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: typingsJapgolly.freeStyle.mod.Container[js.Any], t1: scala.Double) => add(t0, t1).runNow()))
    __obj.updateDynamic("change")(js.Any.fromFunction3((t0: typingsJapgolly.freeStyle.mod.Container[js.Any], t1: scala.Double, t2: scala.Double) => change(t0, t1, t2).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: typingsJapgolly.freeStyle.mod.Container[js.Any], t1: scala.Double) => remove(t0, t1).runNow()))
    __obj.asInstanceOf[Changes]
  }
}

