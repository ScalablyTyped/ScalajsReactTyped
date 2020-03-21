package typingsJapgolly.rcPicker.interfaceMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisabledTimes extends js.Object {
  var disabledHours: js.UndefOr[js.Function0[js.Array[Double]]] = js.undefined
  var disabledMinutes: js.UndefOr[js.Function1[/* hour */ Double, js.Array[Double]]] = js.undefined
  var disabledSeconds: js.UndefOr[js.Function2[/* hour */ Double, /* minute */ Double, js.Array[Double]]] = js.undefined
}

object DisabledTimes {
  @scala.inline
  def apply(
    disabledHours: js.UndefOr[CallbackTo[js.Array[Double]]] = js.undefined,
    disabledMinutes: /* hour */ Double => CallbackTo[js.Array[Double]] = null,
    disabledSeconds: (/* hour */ Double, /* minute */ Double) => CallbackTo[js.Array[Double]] = null
  ): DisabledTimes = {
    val __obj = js.Dynamic.literal()
    disabledHours.foreach(p => __obj.updateDynamic("disabledHours")(p.toJsFn))
    if (disabledMinutes != null) __obj.updateDynamic("disabledMinutes")(js.Any.fromFunction1((t0: /* hour */ scala.Double) => disabledMinutes(t0).runNow()))
    if (disabledSeconds != null) __obj.updateDynamic("disabledSeconds")(js.Any.fromFunction2((t0: /* hour */ scala.Double, t1: /* minute */ scala.Double) => disabledSeconds(t0, t1).runNow()))
    __obj.asInstanceOf[DisabledTimes]
  }
}

