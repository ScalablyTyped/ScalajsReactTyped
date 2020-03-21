package typingsJapgolly.jschannel.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageTransaction extends js.Object {
  def complete(result: js.Any): Unit
  def completed(): Boolean
  def delayReturn(delay: Boolean): Boolean
  def error(error: js.Any, message: String): Unit
  def invoke(callbackName: String, params: js.Any): Unit
}

object MessageTransaction {
  @scala.inline
  def apply(
    complete: js.Any => Callback,
    completed: CallbackTo[Boolean],
    delayReturn: Boolean => CallbackTo[Boolean],
    error: (js.Any, String) => Callback,
    invoke: (String, js.Any) => Callback
  ): MessageTransaction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: js.Any) => complete(t0).runNow()))
    __obj.updateDynamic("completed")(completed.toJsFn)
    __obj.updateDynamic("delayReturn")(js.Any.fromFunction1((t0: scala.Boolean) => delayReturn(t0).runNow()))
    __obj.updateDynamic("error")(js.Any.fromFunction2((t0: js.Any, t1: java.lang.String) => error(t0, t1).runNow()))
    __obj.updateDynamic("invoke")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => invoke(t0, t1).runNow()))
    __obj.asInstanceOf[MessageTransaction]
  }
}

