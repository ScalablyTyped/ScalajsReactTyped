package typingsJapgolly.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<cypress.cypress.Cypress.CookieDefaults> */
trait PartialCookieDefaults extends js.Object {
  var whitelist: js.UndefOr[
    String | js.Array[String] | js.RegExp | (js.Function1[/* cookie */ js.Any, Boolean])
  ] = js.undefined
}

object PartialCookieDefaults {
  @scala.inline
  def apply(
    whitelist: String | js.Array[String] | js.RegExp | (js.Function1[/* cookie */ js.Any, Boolean]) = null
  ): PartialCookieDefaults = {
    val __obj = js.Dynamic.literal()
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialCookieDefaults]
  }
}

