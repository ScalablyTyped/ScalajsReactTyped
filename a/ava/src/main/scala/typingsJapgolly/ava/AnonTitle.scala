package typingsJapgolly.ava

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTitle[Args /* <: js.Array[_] */] extends js.Object {
  var title: js.UndefOr[js.Function2[/* providedTitle */ js.UndefOr[String], /* args */ Args, String]] = js.undefined
}

object AnonTitle {
  @scala.inline
  def apply[Args /* <: js.Array[_] */](title: (/* providedTitle */ js.UndefOr[String], /* args */ Args) => CallbackTo[String] = null): AnonTitle[Args] = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(js.Any.fromFunction2((t0: /* providedTitle */ js.UndefOr[java.lang.String], t1: /* args */ Args) => title(t0, t1).runNow()))
    __obj.asInstanceOf[AnonTitle[Args]]
  }
}

