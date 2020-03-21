package typingsJapgolly.zipkinContextCls.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.zipkin.mod.Context
import typingsJapgolly.zipkin.mod.TraceId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CLSContext
  extends Context[js.Any] {
  def letContext[V](ctx: TraceId, callback: js.Function0[V]): V
  def setContext(ctx: TraceId): Unit
}

object CLSContext {
  @scala.inline
  def apply(
    getContext: CallbackTo[js.Any],
    letContext: (TraceId, js.Function0[js.Any]) => CallbackTo[js.Any],
    scoped: js.Function0[js.Any] => CallbackTo[js.Any],
    setContext: TraceId => Callback
  ): CLSContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getContext")(getContext.toJsFn)
    __obj.updateDynamic("letContext")(js.Any.fromFunction2((t0: typingsJapgolly.zipkin.mod.TraceId, t1: js.Function0[js.Any]) => letContext(t0, t1).runNow()))
    __obj.updateDynamic("scoped")(js.Any.fromFunction1((t0: js.Function0[js.Any]) => scoped(t0).runNow()))
    __obj.updateDynamic("setContext")(js.Any.fromFunction1((t0: typingsJapgolly.zipkin.mod.TraceId) => setContext(t0).runNow()))
    __obj.asInstanceOf[CLSContext]
  }
}

