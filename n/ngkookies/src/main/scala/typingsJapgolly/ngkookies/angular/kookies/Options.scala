package typingsJapgolly.ngkookies.angular.kookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var expires: js.UndefOr[Double | js.Date] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    domain: String = null,
    expires: Double | js.Date = null,
    path: String = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

