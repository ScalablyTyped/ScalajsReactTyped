package typingsJapgolly.cypress.cypressMod.Cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieDefaults extends js.Object {
  var whitelist: String | js.Array[String] | js.RegExp | (js.Function1[/* cookie */ js.Any, Boolean])
}

object CookieDefaults {
  @scala.inline
  def apply(whitelist: String | js.Array[String] | js.RegExp | (js.Function1[/* cookie */ js.Any, Boolean])): CookieDefaults = {
    val __obj = js.Dynamic.literal(whitelist = whitelist.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CookieDefaults]
  }
}

