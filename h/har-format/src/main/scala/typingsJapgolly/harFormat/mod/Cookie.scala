package typingsJapgolly.harFormat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  /**  A comment provided by the user or the application */
  var comment: js.UndefOr[String] = js.undefined
  /** The host of the cookie. */
  var domain: js.UndefOr[String] = js.undefined
  /**
    * Cookie expiration time.
    * (ISO 8601 - `YYYY-MM-DDThh:mm:ss.sTZD`,
    * e.g. `2009-07-24T19:20:30.123+02:00`).
    */
  var expires: js.UndefOr[String] = js.undefined
  /** Set to true if the cookie is HTTP only, false otherwise. */
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  /** The name of the cookie. */
  var name: String
  /** The path pertaining to the cookie. */
  var path: js.UndefOr[String] = js.undefined
  /** True if the cookie was transmitted over ssl, false otherwise. */
  var secure: js.UndefOr[Boolean] = js.undefined
  /** The cookie value. */
  var value: String
}

object Cookie {
  @scala.inline
  def apply(
    name: String,
    value: String,
    comment: String = null,
    domain: String = null,
    expires: String = null,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): Cookie = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
}

