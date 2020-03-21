package typingsJapgolly.cesium

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlways extends js.Object {
  def always(e: js.Any, t: js.Any): js.Any
  def otherwise(e: js.Any): js.Any
  def spread(t: js.Any): js.Any
  def `then`(e: js.Any): js.Any
  def `yield`(e: js.Any): js.Any
}

object AnonAlways {
  @scala.inline
  def apply(
    always: (js.Any, js.Any) => CallbackTo[js.Any],
    otherwise: js.Any => CallbackTo[js.Any],
    spread: js.Any => CallbackTo[js.Any],
    `then`: js.Any => CallbackTo[js.Any],
    `yield`: js.Any => CallbackTo[js.Any]
  ): AnonAlways = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("always")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => always(t0, t1).runNow()))
    __obj.updateDynamic("otherwise")(js.Any.fromFunction1((t0: js.Any) => otherwise(t0).runNow()))
    __obj.updateDynamic("spread")(js.Any.fromFunction1((t0: js.Any) => spread(t0).runNow()))
    __obj.updateDynamic("then")(js.Any.fromFunction1((t0: js.Any) => `then`(t0).runNow()))
    __obj.updateDynamic("yield")(js.Any.fromFunction1((t0: js.Any) => `yield`(t0).runNow()))
    __obj.asInstanceOf[AnonAlways]
  }
}

