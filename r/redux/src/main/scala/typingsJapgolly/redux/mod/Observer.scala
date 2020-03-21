package typingsJapgolly.redux.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T] extends js.Object {
  var next: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
}

object Observer {
  @scala.inline
  def apply[T](next: /* value */ T => Callback = null): Observer[T] = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1((t0: /* value */ T) => next(t0).runNow()))
    __obj.asInstanceOf[Observer[T]]
  }
}

