package typingsJapgolly.reapop

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMain extends js.Object {
  var main: js.UndefOr[String] = js.undefined
  var position: js.UndefOr[js.Function1[/* position */ String, String]] = js.undefined
}

object AnonMain {
  @scala.inline
  def apply(main: String = null, position: /* position */ String => CallbackTo[String] = null): AnonMain = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(js.Any.fromFunction1((t0: /* position */ java.lang.String) => position(t0).runNow()))
    __obj.asInstanceOf[AnonMain]
  }
}

