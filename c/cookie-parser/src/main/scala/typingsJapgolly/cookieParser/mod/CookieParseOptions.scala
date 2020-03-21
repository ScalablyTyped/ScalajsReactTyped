package typingsJapgolly.cookieParser.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieParseOptions extends js.Object {
  var decode: js.UndefOr[js.Function1[/* val */ String, String]] = js.undefined
}

object CookieParseOptions {
  @scala.inline
  def apply(decode: /* val */ String => CallbackTo[String] = null): CookieParseOptions = {
    val __obj = js.Dynamic.literal()
    if (decode != null) __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: /* val */ java.lang.String) => decode(t0).runNow()))
    __obj.asInstanceOf[CookieParseOptions]
  }
}

