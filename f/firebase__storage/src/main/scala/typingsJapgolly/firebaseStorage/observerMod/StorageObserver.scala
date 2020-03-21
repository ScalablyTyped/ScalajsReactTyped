package typingsJapgolly.firebaseStorage.observerMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.firebaseStorage.errorMod.FirebaseStorageError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StorageObserver[T] extends js.Object {
  var complete: js.UndefOr[CompleteFn | Null] = js.undefined
  var error: js.UndefOr[ErrorFn | Null] = js.undefined
  var next: js.UndefOr[NextFn[T] | Null] = js.undefined
}

object StorageObserver {
  @scala.inline
  def apply[T](
    complete: js.UndefOr[Callback] = js.undefined,
    error: /* error */ js.Error | FirebaseStorageError => Callback = null,
    next: T => Callback = null
  ): StorageObserver[T] = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* error */ js.Error | typingsJapgolly.firebaseStorage.errorMod.FirebaseStorageError) => error(t0).runNow()))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1((t0: T) => next(t0).runNow()))
    __obj.asInstanceOf[StorageObserver[T]]
  }
}

