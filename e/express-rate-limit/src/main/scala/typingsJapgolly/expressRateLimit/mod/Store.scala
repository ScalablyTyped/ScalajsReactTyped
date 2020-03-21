package typingsJapgolly.expressRateLimit.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Store extends js.Object {
  def decrement(key: String): Unit
  def incr(key: String, cb: StoreIncrementCallback): Unit
  def resetAll(): Unit
  def resetKey(key: String): Unit
}

object Store {
  @scala.inline
  def apply(
    decrement: String => Callback,
    incr: (String, StoreIncrementCallback) => Callback,
    resetAll: Callback,
    resetKey: String => Callback
  ): Store = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("decrement")(js.Any.fromFunction1((t0: java.lang.String) => decrement(t0).runNow()))
    __obj.updateDynamic("incr")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.expressRateLimit.mod.StoreIncrementCallback) => incr(t0, t1).runNow()))
    __obj.updateDynamic("resetAll")(resetAll.toJsFn)
    __obj.updateDynamic("resetKey")(js.Any.fromFunction1((t0: java.lang.String) => resetKey(t0).runNow()))
    __obj.asInstanceOf[Store]
  }
}

