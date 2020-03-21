package typingsJapgolly.popmotion.valueMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.popmotion.observerTypesMod.Complete
import typingsJapgolly.popmotion.observerTypesMod.Error
import typingsJapgolly.popmotion.observerTypesMod.Middleware
import typingsJapgolly.popmotion.observerTypesMod.Update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined popmotion.popmotion/lib/observer/types.ObserverProps & {  value  :popmotion.popmotion/lib/reactions/value.Value,   initialSubscription ? :popmotion.popmotion/lib/observer/types.Update} */
trait ValueProps extends js.Object {
  var complete: js.UndefOr[Complete] = js.undefined
  var error: js.UndefOr[Error] = js.undefined
  var initialSubscription: js.UndefOr[Update] = js.undefined
  var middleware: js.UndefOr[js.Array[Middleware]] = js.undefined
  var onComplete: js.UndefOr[js.Function] = js.undefined
  var registerParent: js.UndefOr[js.Function] = js.undefined
  var update: js.UndefOr[Update] = js.undefined
  var value: Value
}

object ValueProps {
  @scala.inline
  def apply(
    value: Value,
    complete: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    error: /* err */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    initialSubscription: Update = null,
    middleware: js.Array[Middleware] = null,
    onComplete: js.Function = null,
    registerParent: js.Function = null,
    update: Update = null
  ): ValueProps = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* err */ js.UndefOr[js.Any]) => error(t0).runNow()))
    if (initialSubscription != null) __obj.updateDynamic("initialSubscription")(initialSubscription.asInstanceOf[js.Any])
    if (middleware != null) __obj.updateDynamic("middleware")(middleware.asInstanceOf[js.Any])
    if (onComplete != null) __obj.updateDynamic("onComplete")(onComplete.asInstanceOf[js.Any])
    if (registerParent != null) __obj.updateDynamic("registerParent")(registerParent.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueProps]
  }
}

