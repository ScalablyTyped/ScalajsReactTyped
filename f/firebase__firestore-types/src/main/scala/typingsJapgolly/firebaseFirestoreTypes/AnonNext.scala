package typingsJapgolly.firebaseFirestoreTypes

import japgolly.scalajs.react.Callback
import typingsJapgolly.firebaseFirestoreTypes.mod.DocumentSnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNext[T] extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  var next: js.UndefOr[js.Function1[/* snapshot */ DocumentSnapshot[T], Unit]] = js.undefined
}

object AnonNext {
  @scala.inline
  def apply[T](
    complete: js.UndefOr[Callback] = js.undefined,
    error: /* error */ js.Error => Callback = null,
    next: /* snapshot */ DocumentSnapshot[T] => Callback = null
  ): AnonNext[T] = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* error */ js.Error) => error(t0).runNow()))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1((t0: /* snapshot */ typingsJapgolly.firebaseFirestoreTypes.mod.DocumentSnapshot[T]) => next(t0).runNow()))
    __obj.asInstanceOf[AnonNext[T]]
  }
}

