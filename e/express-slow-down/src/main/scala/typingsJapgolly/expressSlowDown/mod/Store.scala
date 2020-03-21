package typingsJapgolly.expressSlowDown.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store extends js.Object {
  def decrement(key: String): Unit
  def incr(key: String, cb: StoreIncrementCallback): Unit
  def resetKey(key: String): Unit
}

object Store {
  @scala.inline
  def apply(
    decrement: String => Callback,
    incr: (String, StoreIncrementCallback) => Callback,
    resetKey: String => Callback
  ): Store = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decrement")(js.Any.fromFunction1((t0: java.lang.String) => decrement(t0).runNow()))
    __obj.updateDynamic("incr")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.expressSlowDown.mod.StoreIncrementCallback) => incr(t0, t1).runNow()))
    __obj.updateDynamic("resetKey")(js.Any.fromFunction1((t0: java.lang.String) => resetKey(t0).runNow()))
    __obj.asInstanceOf[Store]
  }
}

