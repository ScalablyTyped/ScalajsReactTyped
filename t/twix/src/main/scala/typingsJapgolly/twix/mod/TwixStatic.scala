package typingsJapgolly.twix.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwixStatic extends js.Object {
  var formatTemplate: js.UndefOr[js.Function2[/* left */ js.Any, /* right */ js.Any, _]] = js.undefined
}

object TwixStatic {
  @scala.inline
  def apply(formatTemplate: (/* left */ js.Any, /* right */ js.Any) => CallbackTo[js.Any] = null): TwixStatic = {
    val __obj = js.Dynamic.literal()
    if (formatTemplate != null) __obj.updateDynamic("formatTemplate")(js.Any.fromFunction2((t0: /* left */ js.Any, t1: /* right */ js.Any) => formatTemplate(t0, t1).runNow()))
    __obj.asInstanceOf[TwixStatic]
  }
}

