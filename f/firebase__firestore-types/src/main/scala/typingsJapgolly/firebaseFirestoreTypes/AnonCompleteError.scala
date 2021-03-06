package typingsJapgolly.firebaseFirestoreTypes

import japgolly.scalajs.react.Callback
import typingsJapgolly.firebaseFirestoreTypes.mod.QuerySnapshot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompleteError[T] extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  var next: js.UndefOr[js.Function1[/* snapshot */ QuerySnapshot[T], Unit]] = js.undefined
}

object AnonCompleteError {
  @scala.inline
  def apply[T](
    complete: js.UndefOr[Callback] = js.undefined,
    error: /* error */ js.Error => Callback = null,
    next: /* snapshot */ QuerySnapshot[T] => Callback = null
  ): AnonCompleteError[T] = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* error */ js.Error) => error(t0).runNow()))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1((t0: /* snapshot */ typingsJapgolly.firebaseFirestoreTypes.mod.QuerySnapshot[T]) => next(t0).runNow()))
    __obj.asInstanceOf[AnonCompleteError[T]]
  }
}

