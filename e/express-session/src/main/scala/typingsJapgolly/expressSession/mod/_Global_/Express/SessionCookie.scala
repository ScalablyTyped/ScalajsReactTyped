package typingsJapgolly.expressSession.mod._Global_.Express

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionCookie extends SessionCookieData {
  def serialize(name: String, value: String): String
}

object SessionCookie {
  @scala.inline
  def apply(
    expires: js.Date | Boolean,
    httpOnly: Boolean,
    originalMaxAge: Double,
    path: String,
    serialize: (String, String) => CallbackTo[String],
    domain: String = null,
    maxAge: Int | Double = null,
    sameSite: Boolean | String = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): SessionCookie = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], originalMaxAge = originalMaxAge.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("serialize")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => serialize(t0, t1).runNow()))
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionCookie]
  }
}

