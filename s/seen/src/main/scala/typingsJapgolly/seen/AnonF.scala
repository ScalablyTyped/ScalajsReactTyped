package typingsJapgolly.seen

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonF extends js.Object {
  def f(f: js.Any): js.Any
  def v(v: js.Any): js.Any
}

object AnonF {
  @scala.inline
  def apply(f: js.Any => CallbackTo[js.Any], v: js.Any => CallbackTo[js.Any]): AnonF = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("f")(js.Any.fromFunction1((t0: js.Any) => f(t0).runNow()))
    __obj.updateDynamic("v")(js.Any.fromFunction1((t0: js.Any) => v(t0).runNow()))
    __obj.asInstanceOf[AnonF]
  }
}

