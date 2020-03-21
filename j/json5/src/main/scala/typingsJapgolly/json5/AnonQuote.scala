package typingsJapgolly.json5

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.json5.mod.JSONReplacer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQuote extends js.Object {
  var quote: js.UndefOr[String] = js.undefined
  var replacer: js.UndefOr[JSONReplacer] = js.undefined
  var space: js.UndefOr[Double | String] = js.undefined
}

object AnonQuote {
  @scala.inline
  def apply(
    quote: String = null,
    replacer: (/* key */ String, /* value */ js.Any) => CallbackTo[js.Any | (js.Array[Double | String]) | Null] = null,
    space: Double | String = null
  ): AnonQuote = {
    val __obj = js.Dynamic.literal()
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    if (replacer != null) __obj.updateDynamic("replacer")(js.Any.fromFunction2((t0: /* key */ java.lang.String, t1: /* value */ js.Any) => replacer(t0, t1).runNow()))
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQuote]
  }
}

