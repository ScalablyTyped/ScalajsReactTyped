package typingsJapgolly.popmotion.observerTypesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PartialObserver extends _ObserverCandidate {
  var complete: js.UndefOr[Complete] = js.undefined
  var error: js.UndefOr[Error] = js.undefined
  var registerParent: js.UndefOr[js.Function] = js.undefined
  var update: js.UndefOr[Update] = js.undefined
}

object PartialObserver {
  @scala.inline
  def apply(
    complete: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    error: /* err */ js.UndefOr[js.Any] => CallbackTo[js.Any] = null,
    registerParent: js.Function = null,
    update: Update = null
  ): PartialObserver = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* err */ js.UndefOr[js.Any]) => error(t0).runNow()))
    if (registerParent != null) __obj.updateDynamic("registerParent")(registerParent.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialObserver]
  }
}

