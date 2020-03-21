package typingsJapgolly.firebaseUtil.subscribeMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@firebase/util.@firebase/util/dist/src/subscribe.Observer<T>> */
trait PartialObserver[T] extends js.Object {
  var complete: js.UndefOr[CompleteFn] = js.undefined
  var error: js.UndefOr[ErrorFn] = js.undefined
  var next: js.UndefOr[NextFn[T]] = js.undefined
}

object PartialObserver {
  @scala.inline
  def apply[T](
    complete: js.UndefOr[Callback] = js.undefined,
    error: /* error */ js.Error => Callback = null,
    next: T => Callback = null
  ): PartialObserver[T] = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* error */ js.Error) => error(t0).runNow()))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1((t0: T) => next(t0).runNow()))
    __obj.asInstanceOf[PartialObserver[T]]
  }
}

