package typingsJapgolly.foundationSites

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonThrottle extends js.Object {
  def throttle(func: js.Function1[/* repeated */ js.Any, _], delay: Double): js.Function1[/* repeated */ js.Any, _]
}

object AnonThrottle {
  @scala.inline
  def apply(
    throttle: (js.Function1[/* repeated */ js.Any, js.Any], Double) => CallbackTo[js.Function1[/* repeated */ js.Any, js.Any]]
  ): AnonThrottle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("throttle")(js.Any.fromFunction2((t0: js.Function1[/* repeated */ js.Any, js.Any], t1: scala.Double) => throttle(t0, t1).runNow()))
    __obj.asInstanceOf[AnonThrottle]
  }
}

