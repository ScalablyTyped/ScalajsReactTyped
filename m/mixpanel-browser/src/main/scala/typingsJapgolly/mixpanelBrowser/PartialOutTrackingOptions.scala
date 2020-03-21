package typingsJapgolly.mixpanelBrowser

import typingsJapgolly.mixpanelBrowser.mod.Persistence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<mixpanel-browser.mixpanel-browser.OutTrackingOptions> */
trait PartialOutTrackingOptions extends js.Object {
  var cookie_expiration: js.UndefOr[Double] = js.undefined
  var cookie_prefix: js.UndefOr[String] = js.undefined
  var cross_subdomain_cookie: js.UndefOr[Boolean] = js.undefined
  var delete_user: js.UndefOr[Boolean] = js.undefined
  var persistence_type: js.UndefOr[Persistence] = js.undefined
  var secure_cookie: js.UndefOr[Boolean] = js.undefined
}

object PartialOutTrackingOptions {
  @scala.inline
  def apply(
    cookie_expiration: Int | Double = null,
    cookie_prefix: String = null,
    cross_subdomain_cookie: js.UndefOr[Boolean] = js.undefined,
    delete_user: js.UndefOr[Boolean] = js.undefined,
    persistence_type: Persistence = null,
    secure_cookie: js.UndefOr[Boolean] = js.undefined
  ): PartialOutTrackingOptions = {
    val __obj = js.Dynamic.literal()
    if (cookie_expiration != null) __obj.updateDynamic("cookie_expiration")(cookie_expiration.asInstanceOf[js.Any])
    if (cookie_prefix != null) __obj.updateDynamic("cookie_prefix")(cookie_prefix.asInstanceOf[js.Any])
    if (!js.isUndefined(cross_subdomain_cookie)) __obj.updateDynamic("cross_subdomain_cookie")(cross_subdomain_cookie.asInstanceOf[js.Any])
    if (!js.isUndefined(delete_user)) __obj.updateDynamic("delete_user")(delete_user.asInstanceOf[js.Any])
    if (persistence_type != null) __obj.updateDynamic("persistence_type")(persistence_type.asInstanceOf[js.Any])
    if (!js.isUndefined(secure_cookie)) __obj.updateDynamic("secure_cookie")(secure_cookie.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOutTrackingOptions]
  }
}

