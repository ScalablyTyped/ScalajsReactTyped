package typingsJapgolly.webix.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait session extends js.Object {
  def clear(): Unit
  def get(name: String): js.Any
  def put(name: String, value: js.Any): Unit
  def remove(name: String): Unit
}

object session {
  @scala.inline
  def apply(
    clear: Callback,
    get: String => CallbackTo[js.Any],
    put: (String, js.Any) => Callback,
    remove: String => Callback
  ): session = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: java.lang.String) => get(t0).runNow()))
    __obj.updateDynamic("put")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => put(t0, t1).runNow()))
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: java.lang.String) => remove(t0).runNow()))
    __obj.asInstanceOf[session]
  }
}

