package typingsJapgolly.wordpressData

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wordpressData.mod.SelectorMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSelect extends js.Object {
  var select: js.Function1[/* key */ String, SelectorMap]
}

object AnonSelect {
  @scala.inline
  def apply(select: /* key */ String => CallbackTo[SelectorMap]): AnonSelect = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* key */ java.lang.String) => select(t0).runNow()))
    __obj.asInstanceOf[AnonSelect]
  }
}

