package typingsJapgolly.zipkin.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context[T] extends js.Object {
  def getContext(): T
  def letContext[V](ctx: T, callback: js.Function0[V]): V
  def scoped[V](callback: js.Function0[V]): V
  def setContext(ctx: T): Unit
}

object Context {
  @scala.inline
  def apply[T](
    getContext: CallbackTo[T],
    letContext: (T, js.Function0[js.Any]) => CallbackTo[js.Any],
    scoped: js.Function0[js.Any] => CallbackTo[js.Any],
    setContext: T => Callback
  ): Context[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContext")(getContext.toJsFn)
    __obj.updateDynamic("letContext")(js.Any.fromFunction2((t0: T, t1: js.Function0[js.Any]) => letContext(t0, t1).runNow()))
    __obj.updateDynamic("scoped")(js.Any.fromFunction1((t0: js.Function0[js.Any]) => scoped(t0).runNow()))
    __obj.updateDynamic("setContext")(js.Any.fromFunction1((t0: T) => setContext(t0).runNow()))
    __obj.asInstanceOf[Context[T]]
  }
}

