package typingsJapgolly.rollup.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PluginCache extends js.Object {
  def delete(id: String): Boolean
  def get[T](id: String): T
  def has(id: String): Boolean
  def set[T](id: String, value: T): Unit
}

object PluginCache {
  @scala.inline
  def apply(
    delete: String => CallbackTo[Boolean],
    get: String => CallbackTo[js.Any],
    has: String => CallbackTo[Boolean],
    set: (String, js.Any) => Callback
  ): PluginCache = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: java.lang.String) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: java.lang.String) => has(t0).runNow()))
    __obj.updateDynamic("set")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => set(t0, t1).runNow()))
    __obj.asInstanceOf[PluginCache]
  }
}

