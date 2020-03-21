package typingsJapgolly.simplesignal.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SimpleSignal[F /* <: js.Function */] extends js.Object {
  var functions: js.Any
  def add(func: F): Boolean
  def dispatch(args: js.Any*): Unit
  def numItems(): Double
  def remove(func: F): Boolean
  def removeAll(): Boolean
}

object SimpleSignal {
  @scala.inline
  def apply[F /* <: js.Function */](
    add: F => CallbackTo[Boolean],
    dispatch: /* repeated */ js.Any => Callback,
    functions: js.Any,
    numItems: CallbackTo[Double],
    remove: F => CallbackTo[Boolean],
    removeAll: CallbackTo[Boolean]
  ): SimpleSignal[F] = {
    val __obj = js.Dynamic.literal(functions = functions.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: F) => add(t0).runNow()))
    __obj.updateDynamic("dispatch")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => dispatch(t0).runNow()))
    __obj.updateDynamic("numItems")(numItems.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: F) => remove(t0).runNow()))
    __obj.updateDynamic("removeAll")(removeAll.toJsFn)
    __obj.asInstanceOf[SimpleSignal[F]]
  }
}

