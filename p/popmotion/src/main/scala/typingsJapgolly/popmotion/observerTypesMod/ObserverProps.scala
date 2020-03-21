package typingsJapgolly.popmotion.observerTypesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined popmotion.popmotion/lib/observer/types.PartialObserver & {  middleware ? :std.Array<popmotion.popmotion/lib/observer/types.Middleware>,   onComplete ? :std.Function} */
trait ObserverProps extends js.Object {
  var complete: js.UndefOr[Complete] = js.undefined
  var error: js.UndefOr[Error] = js.undefined
  var middleware: js.UndefOr[js.Array[Middleware]] = js.undefined
  var onComplete: js.UndefOr[js.Function] = js.undefined
  var registerParent: js.UndefOr[js.Function] = js.undefined
  var update: js.UndefOr[Update] = js.undefined
}

object ObserverProps {
  @scala.inline
  def apply(
    complete: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    error: /* err */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    middleware: js.Array[Middleware] = null,
    onComplete: js.Function = null,
    registerParent: js.Function = null,
    update: Update = null
  ): ObserverProps = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* err */ js.UndefOr[js.Any]) => error(t0).runNow()))
    if (middleware != null) __obj.updateDynamic("middleware")(middleware.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete.asInstanceOf[js.Any])
    if (registerParent != null) __obj.updateDynamic("registerParent")(registerParent.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObserverProps]
  }
}

