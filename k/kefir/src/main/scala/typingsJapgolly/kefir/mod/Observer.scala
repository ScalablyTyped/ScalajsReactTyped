package typingsJapgolly.kefir.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[T, S] extends js.Object {
  var end: js.UndefOr[js.Function0[Unit]] = js.undefined
  var error: js.UndefOr[js.Function1[/* error */ S, Unit]] = js.undefined
  var value: js.UndefOr[js.Function1[/* value */ T, Unit]] = js.undefined
}

object Observer {
  @scala.inline
  def apply[T, S](
    end: js.UndefOr[Callback] = js.undefined,
    error: /* error */ S => Callback = null,
    value: /* value */ T => Callback = null
  ): Observer[T, S] = {
    val __obj = js.Dynamic.literal()
    end.foreach(p => __obj.updateDynamic("end")(p.toJsFn))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* error */ S) => error(t0).runNow()))
    if (value != null) __obj.updateDynamic("value")(js.Any.fromFunction1((t0: /* value */ T) => value(t0).runNow()))
    __obj.asInstanceOf[Observer[T, S]]
  }
}

