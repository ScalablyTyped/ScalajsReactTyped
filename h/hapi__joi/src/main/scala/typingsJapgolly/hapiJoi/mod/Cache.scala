package typingsJapgolly.hapiJoi.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cache extends js.Object {
  /**
    * Retrieve an item from the cache.
    *
    * Note that key and value can be anything including objects, array, etc.
    */
  def get(key: js.Any): js.Any
  /**
    * Add an item to the cache.
    *
    * Note that key and value can be anything including objects, array, etc.
    */
  def set(key: js.Any, value: js.Any): Unit
}

object Cache {
  @scala.inline
  def apply(get: js.Any => CallbackTo[js.Any], set: (js.Any, js.Any) => Callback): Cache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: js.Any) => get(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => set(t0, t1).runNow()))
    __obj.asInstanceOf[Cache]
  }
}

