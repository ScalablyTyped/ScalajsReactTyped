package typingsJapgolly.angularCookies.mod.angularAugmentingMod.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Cookies options
  * see https://docs.angularjs.org/api/ngCookies/provider/$cookiesProvider#defaults
  */
trait ICookiesOptions extends js.Object {
  /**
    * The cookie will be available only for this domain and its sub-domains.
    * For obvious security reasons the user agent will not accept the cookie if the
    * current domain is not a sub domain or equals to the requested domain.
    */
  var domain: js.UndefOr[String] = js.undefined
  /**
    * String of the form "Wdy, DD Mon YYYY HH:MM:SS GMT" or a Date object
    * indicating the exact date/time this cookie will expire.
    */
  var expires: js.UndefOr[String | js.Date] = js.undefined
  /**
    * The cookie will be available only for this path and its sub-paths.
    * By default, this would be the URL that appears in your base tag.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * The cookie will be available only in secured connection.
    */
  var secure: js.UndefOr[Boolean] = js.undefined
}

object ICookiesOptions {
  @scala.inline
  def apply(
    domain: String = null,
    expires: String | js.Date = null,
    path: String = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): ICookiesOptions = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICookiesOptions]
  }
}

