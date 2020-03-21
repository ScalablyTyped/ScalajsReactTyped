package typingsJapgolly.csurf.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.expressServeStaticCore.expressServeStaticCoreStrings.lax
import typingsJapgolly.expressServeStaticCore.expressServeStaticCoreStrings.none
import typingsJapgolly.expressServeStaticCore.expressServeStaticCoreStrings.strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieOptions
  extends typingsJapgolly.expressServeStaticCore.mod.CookieOptions {
  var key: js.UndefOr[String] = js.undefined
}

object CookieOptions {
  @scala.inline
  def apply(
    domain: String = null,
    encode: /* val */ String => CallbackTo[String] = null,
    expires: js.Date = null,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    maxAge: Int | Double = null,
    path: String = null,
    sameSite: Boolean | lax | strict | none = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    signed: js.UndefOr[Boolean] = js.undefined
  ): CookieOptions = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: /* val */ java.lang.String) => encode(t0).runNow()))
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (!js.isUndefined(signed)) __obj.updateDynamic("signed")(signed.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieOptions]
  }
}

