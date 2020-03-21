package typingsJapgolly.stacktraceJs.StackTrace

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackTraceOptions extends js.Object {
  var filter: js.UndefOr[js.Function1[/* stackFrame */ StackFrame, Boolean]] = js.undefined
  var offline: js.UndefOr[Boolean] = js.undefined
  var sourceCache: js.UndefOr[SourceCache] = js.undefined
}

object StackTraceOptions {
  @scala.inline
  def apply(
    filter: /* stackFrame */ StackFrame => CallbackTo[Boolean] = null,
    offline: js.UndefOr[Boolean] = js.undefined,
    sourceCache: SourceCache = null
  ): StackTraceOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* stackFrame */ typingsJapgolly.stacktraceJs.StackTrace.StackFrame) => filter(t0).runNow()))
    if (!js.isUndefined(offline)) __obj.updateDynamic("offline")(offline.asInstanceOf[js.Any])
    if (sourceCache != null) __obj.updateDynamic("sourceCache")(sourceCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackTraceOptions]
  }
}

