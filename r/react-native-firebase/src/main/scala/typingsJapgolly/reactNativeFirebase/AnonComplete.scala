package typingsJapgolly.reactNativeFirebase

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.ErrorHandler
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.Handler
import typingsJapgolly.reactNativeFirebase.mod.RNFirebase.RnError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComplete[T] extends js.Object {
  var complete: js.UndefOr[Handler[T]] = js.undefined
  var error: js.UndefOr[ErrorHandler] = js.undefined
  var next: js.UndefOr[Handler[T]] = js.undefined
}

object AnonComplete {
  @scala.inline
  def apply[T](complete: T => Callback = null, error: RnError => Callback = null, next: T => Callback = null): AnonComplete[T] = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: T) => complete(t0).runNow()))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: typingsJapgolly.reactNativeFirebase.mod.RNFirebase.RnError) => error(t0).runNow()))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1((t0: T) => next(t0).runNow()))
    __obj.asInstanceOf[AnonComplete[T]]
  }
}

