package typingsJapgolly.threeTdsLoader

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofCache extends js.Object {
  var enabled: Boolean
  var files: js.Any
  def add(key: String, file: js.Any): Unit
  def clear(): Unit
  def get(key: String): js.Any
  def remove(key: String): Unit
}

object TypeofCache {
  @scala.inline
  def apply(
    add: (String, js.Any) => Callback,
    clear: Callback,
    enabled: Boolean,
    files: js.Any,
    get: String => CallbackTo[js.Any],
    remove: String => Callback
  ): TypeofCache = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => add(t0, t1).runNow()))
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.asInstanceOf[TypeofCache]
  }
}

