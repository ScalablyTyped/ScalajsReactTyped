package typingsJapgolly.zenObservableTs.typesMod.ZenObservable

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObservableLike[T] extends js.Object {
  var subscribe: js.UndefOr[Subscriber[T]] = js.undefined
}

object ObservableLike {
  @scala.inline
  def apply[T](
    subscribe: /* observer */ SubscriptionObserver[T] => CallbackTo[Unit | js.Function0[Unit] | Subscription] = null
  ): ObservableLike[T] = {
    val __obj = js.Dynamic.literal()
    if (subscribe != null) __obj.updateDynamic("subscribe")(js.Any.fromFunction1((t0: /* observer */ typingsJapgolly.zenObservableTs.typesMod.ZenObservable.SubscriptionObserver[T]) => subscribe(t0).runNow()))
    __obj.asInstanceOf[ObservableLike[T]]
  }
}

