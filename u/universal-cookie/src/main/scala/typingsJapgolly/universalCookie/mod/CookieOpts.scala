package typingsJapgolly.universalCookie.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieOpts extends js.Object {
  /**
    * domain for the cookie (sub.domain.com or .allsubdomains.com)
    */
  var domain: js.UndefOr[String] = js.undefined
  /**
    * absolute expiration date for the cookie
    */
  var expires: js.UndefOr[js.Date] = js.undefined
  /**
    * Is only the server can access the cookie?
    */
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * relative max age of the cookie from when the client receives it in second
    */
  var maxAge: js.UndefOr[Double] = js.undefined
  /**
    * cookie path, use / as the path if you want your cookie to be accessible on all pages
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * Is only accessible through HTTPS?
    */
  var secure: js.UndefOr[Boolean] = js.undefined
}

object CookieOpts {
  @scala.inline
  def apply(
    domain: String = null,
    expires: js.Date = null,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    maxAge: Int | Double = null,
    path: String = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): CookieOpts = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieOpts]
  }
}

