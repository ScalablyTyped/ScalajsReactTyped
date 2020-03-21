package typingsJapgolly.mfiles

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnError extends js.Object {
  var Finally: js.UndefOr[js.Function0[Unit]] = js.undefined
  var OnError: js.UndefOr[
    js.Function3[/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String, Unit]
  ] = js.undefined
  var OnSuccess: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object AnonOnError {
  @scala.inline
  def apply(
    Finally: js.UndefOr[Callback] = js.undefined,
    OnError: (/* errorCode */ Double, /* errorMessage */ String, /* errorStack */ String) => Callback = null,
    OnSuccess: js.UndefOr[Callback] = js.undefined
  ): AnonOnError = {
    val __obj = js.Dynamic.literal()
    Finally.foreach(p => __obj.updateDynamic("Finally")(p.toJsFn))
    if (OnError != null) __obj.updateDynamic("OnError")(js.Any.fromFunction3((t0: /* errorCode */ scala.Double, t1: /* errorMessage */ java.lang.String, t2: /* errorStack */ java.lang.String) => OnError(t0, t1, t2).runNow()))
    OnSuccess.foreach(p => __obj.updateDynamic("OnSuccess")(p.toJsFn))
    __obj.asInstanceOf[AnonOnError]
  }
}

