package typingsJapgolly.relayRuntime.relayNetworkTypesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegacyObserver[T] extends js.Object {
  var onCompleted: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  var onNext: js.UndefOr[js.Function1[/* data */ T, Unit]] = js.undefined
}

object LegacyObserver {
  @scala.inline
  def apply[T](
    onCompleted: js.UndefOr[Callback] = js.undefined,
    onError: /* error */ js.Error => Callback = null,
    onNext: /* data */ T => Callback = null
  ): LegacyObserver[T] = {
    val __obj = js.Dynamic.literal()
    onCompleted.foreach(p => __obj.updateDynamic("onCompleted")(p.toJsFn))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onError(t0).runNow()))
    if (onNext != null) __obj.updateDynamic("onNext")(js.Any.fromFunction1((t0: /* data */ T) => onNext(t0).runNow()))
    __obj.asInstanceOf[LegacyObserver[T]]
  }
}

