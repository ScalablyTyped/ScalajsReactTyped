package typingsJapgolly.firebaseFirestoreTypes

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComplete extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  var next: js.UndefOr[js.Function1[/* value */ Unit, Unit]] = js.undefined
}

object AnonComplete {
  @scala.inline
  def apply(
    complete: js.UndefOr[Callback] = js.undefined,
    error: /* error */ js.Error => Callback = null,
    next: /* value */ Unit => Callback = null
  ): AnonComplete = {
    val __obj = js.Dynamic.literal()
    complete.foreach(p => __obj.updateDynamic("complete")(p.toJsFn))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* error */ js.Error) => error(t0).runNow()))
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction1((t0: /* value */ scala.Unit) => next(t0).runNow()))
    __obj.asInstanceOf[AnonComplete]
  }
}

