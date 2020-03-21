package typingsJapgolly.gatsby.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityTracker extends js.Object {
  var panic: LogErrorType
  var panicOnBuild: LogErrorType
  var span: js.Object
  def end(): js.Function0[Unit]
  def setStatus(status: String): Unit
  def start(): js.Function0[Unit]
}

object ActivityTracker {
  @scala.inline
  def apply(
    end: CallbackTo[js.Function0[Unit]],
    panic: (/* errorMeta */ String | js.Object, /* error */ js.UndefOr[js.Object]) => Callback,
    panicOnBuild: (/* errorMeta */ String | js.Object, /* error */ js.UndefOr[js.Object]) => Callback,
    setStatus: String => Callback,
    span: js.Object,
    start: CallbackTo[js.Function0[Unit]]
  ): ActivityTracker = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("end")(end.toJsFn)
    __obj.updateDynamic("panic")(js.Any.fromFunction2((t0: /* errorMeta */ java.lang.String | js.Object, t1: /* error */ js.UndefOr[js.Object]) => panic(t0, t1).runNow()))
    __obj.updateDynamic("panicOnBuild")(js.Any.fromFunction2((t0: /* errorMeta */ java.lang.String | js.Object, t1: /* error */ js.UndefOr[js.Object]) => panicOnBuild(t0, t1).runNow()))
    __obj.updateDynamic("setStatus")(js.Any.fromFunction1((t0: java.lang.String) => setStatus(t0).runNow()))
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.asInstanceOf[ActivityTracker]
  }
}

