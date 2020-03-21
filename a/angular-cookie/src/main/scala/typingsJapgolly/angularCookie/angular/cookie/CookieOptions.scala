package typingsJapgolly.angularCookie.angular.cookie

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieOptions extends js.Object {
  /**
    * The method that will be used to decode extracted cookie values (should be passed when using Get).
    */
  var decode: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  /**
    * The domain tells the browser to which domain the cookie should be sent. If you don't specify it, it becomes the domain of the page that sets the cookie.
    */
  var domain: js.UndefOr[String] = js.undefined
  /**
    * The method that will be used to encode the cookie value (should be passed when using Set).
    */
  var encode: js.UndefOr[js.Function1[/* value */ js.Any, _]] = js.undefined
  /**
    * Allows you to set the expiration time in hours, minutes, seconds, or `milliseconds. If this is not specified, any expiration time specified will default to days.
    */
  var expirationUnit: js.UndefOr[String] = js.undefined
  /**
    * Each cookie has an expiry date after which it is trashed. If you don't specify the expiry date the cookie is trashed when you close the browser.
    */
  var expires: js.UndefOr[Double] = js.undefined
  /**
    * The path gives you the chance to specify a directory where the cookie is active.
    */
  var path: js.UndefOr[String] = js.undefined
  /**
    * The Secure attribute is meant to keep cookie communication limited to encrypted transmission, directing browsers to use cookies only via secure/encrypted connections.
    */
  var secure: js.UndefOr[Boolean] = js.undefined
}

object CookieOptions {
  @scala.inline
  def apply(
    decode: /* value */ js.Any => CallbackTo[js.Any] = null,
    domain: String = null,
    encode: /* value */ js.Any => CallbackTo[js.Any] = null,
    expirationUnit: String = null,
    expires: Int | Double = null,
    path: String = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): CookieOptions = {
    val __obj = js.Dynamic.literal()
    if (decode != null) __obj.updateDynamic("decode")(js.Any.fromFunction1((t0: /* value */ js.Any) => decode(t0).runNow()))
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (encode != null) __obj.updateDynamic("encode")(js.Any.fromFunction1((t0: /* value */ js.Any) => encode(t0).runNow()))
    if (expirationUnit != null) __obj.updateDynamic("expirationUnit")(expirationUnit.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[CookieOptions]
  }
}

