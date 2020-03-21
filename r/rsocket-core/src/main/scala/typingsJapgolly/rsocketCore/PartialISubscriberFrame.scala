package typingsJapgolly.rsocketCore

import japgolly.scalajs.react.Callback
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Frame
import typingsJapgolly.rsocketTypes.reactiveStreamTypesMod.ISubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rsocket-types.rsocket-types.ISubscriber<rsocket-types.rsocket-types.Frame>> */
trait PartialISubscriberFrame extends js.Object {
  var onComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  var onNext: js.UndefOr[js.Function1[/* value */ Frame, Unit]] = js.undefined
  var onSubscribe: js.UndefOr[js.Function1[/* subscription */ ISubscription, Unit]] = js.undefined
}

object PartialISubscriberFrame {
  @scala.inline
  def apply(
    onComplete: js.UndefOr[Callback] = js.undefined,
    onError: /* error */ js.Error => Callback = null,
    onNext: /* value */ Frame => Callback = null,
    onSubscribe: /* subscription */ ISubscription => Callback = null
  ): PartialISubscriberFrame = {
    val __obj = js.Dynamic.literal()
    onComplete.foreach(p => __obj.updateDynamic("onComplete")(p.toJsFn))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onError(t0).runNow()))
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Frame) => onNext(t0).runNow()))
    if (onSubscribe != null) __obj.updateDynamic("onSubscribe")(js.Any.fromFunction1((t0: /* subscription */ typingsJapgolly.rsocketTypes.reactiveStreamTypesMod.ISubscription) => onSubscribe(t0).runNow()))
    __obj.asInstanceOf[PartialISubscriberFrame]
  }
}

