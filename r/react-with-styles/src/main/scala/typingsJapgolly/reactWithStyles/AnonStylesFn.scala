package typingsJapgolly.reactWithStyles

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactWithStyles.mod.Styles
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStylesFn[TStyles /* <: Styles */] extends js.Object {
  def stylesFn(args: js.Any*): TStyles
}

object AnonStylesFn {
  @scala.inline
  def apply[TStyles /* <: Styles */](stylesFn: /* repeated */ js.Any => CallbackTo[TStyles]): AnonStylesFn[TStyles] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("stylesFn")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => stylesFn(t0).runNow()))
    __obj.asInstanceOf[AnonStylesFn[TStyles]]
  }
}

