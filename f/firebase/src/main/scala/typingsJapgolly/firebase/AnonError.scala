package typingsJapgolly.firebase

import japgolly.scalajs.react.Callback
import typingsJapgolly.firebase.mod.firestore.DocumentSnapshot
import typingsJapgolly.firebase.mod.firestore.FirestoreError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonError[T] extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ FirestoreError, Unit]] = js.undefined
  var next: js.UndefOr[js.Function1[/* snapshot */ DocumentSnapshot[T], Unit]] = js.undefined
}

object AnonError {
  @scala.inline
  def apply[T](
    complete: js.UndefOr[Callback] = js.undefined,
    error: /* error */ FirestoreError => Callback = null,
    next: /* snapshot */ DocumentSnapshot[T] => Callback = null
  ): AnonError[T] = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* error */ typingsJapgolly.firebase.mod.firestore.FirestoreError) => error(t0).runNow()))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1((t0: /* snapshot */ typingsJapgolly.firebase.mod.firestore.DocumentSnapshot[T]) => next(t0).runNow()))
    __obj.asInstanceOf[AnonError[T]]
  }
}

