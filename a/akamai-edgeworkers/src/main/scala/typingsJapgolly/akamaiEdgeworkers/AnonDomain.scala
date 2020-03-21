package typingsJapgolly.akamaiEdgeworkers

import typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersBooleans.`true`
import typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.Lax
import typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.None
import typingsJapgolly.akamaiEdgeworkers.akamaiEdgeworkersStrings.Strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDomain extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var expires: js.UndefOr[AnonToUTCString] = js.undefined
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var sameSite: js.UndefOr[Strict | Lax | None | `true`] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object AnonDomain {
  @scala.inline
  def apply(
    domain: String = null,
    expires: AnonToUTCString = null,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    maxAge: Int | Double = null,
    name: String = null,
    path: String = null,
    sameSite: Strict | Lax | None | `true` = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    value: String = null
  ): AnonDomain = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly.asInstanceOf[js.Any])
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDomain]
  }
}

