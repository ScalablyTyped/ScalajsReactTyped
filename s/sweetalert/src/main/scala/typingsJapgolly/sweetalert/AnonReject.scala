package typingsJapgolly.sweetalert

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReject extends js.Object {
  var reject: js.UndefOr[js.Function0[Unit]] = js.undefined
  var resolve: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
}

object AnonReject {
  @scala.inline
  def apply(reject: js.UndefOr[Callback] = js.undefined, resolve: /* value */ String => Callback = null): AnonReject = {
    val __obj = js.Dynamic.literal()
    reject.foreach(p => __obj.updateDynamic("reject")(p.toJsFn))
    if (resolve != null) __obj.updateDynamic("resolve")(js.Any.fromFunction1((t0: /* value */ java.lang.String) => resolve(t0).runNow()))
    __obj.asInstanceOf[AnonReject]
  }
}

