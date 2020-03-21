package typingsJapgolly.aphrodite.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Extension extends js.Object {
  var selectorHandler: js.UndefOr[SelectorHandler] = js.undefined
}

object Extension {
  @scala.inline
  def apply(
    selectorHandler: (/* selector */ String, /* baseSelector */ String, /* callback */ js.Function1[/* selector */ String, String]) => CallbackTo[String | Null] = null
  ): Extension = {
    val __obj = js.Dynamic.literal()
    if (selectorHandler != null) __obj.updateDynamic("selectorHandler")(js.Any.fromFunction3((t0: /* selector */ java.lang.String, t1: /* baseSelector */ java.lang.String, t2: /* callback */ js.Function1[/* selector */ java.lang.String, java.lang.String]) => selectorHandler(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Extension]
  }
}

