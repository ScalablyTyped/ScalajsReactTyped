package typingsJapgolly.hellojs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HelloJSLoginOptions extends js.Object {
  var default_service: js.UndefOr[String] = js.undefined
  var display: js.UndefOr[HelloJSDisplayType] = js.undefined
  var force: js.UndefOr[Boolean | Null] = js.undefined
  var oauth_proxy: js.UndefOr[String] = js.undefined
  var popup: js.UndefOr[HelloJSPopupOptions] = js.undefined
  var redirect_uri: js.UndefOr[String] = js.undefined
  var response_type: js.UndefOr[HelloJSTokenResponseType] = js.undefined
  var scope: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object HelloJSLoginOptions {
  @scala.inline
  def apply(
    default_service: String = null,
    display: HelloJSDisplayType = null,
    force: js.UndefOr[Boolean] = js.undefined,
    oauth_proxy: String = null,
    popup: HelloJSPopupOptions = null,
    redirect_uri: String = null,
    response_type: HelloJSTokenResponseType = null,
    scope: String = null,
    state: String = null,
    timeout: Int | Double = null
  ): HelloJSLoginOptions = {
    val __obj = js.Dynamic.literal()
    if (default_service != null) __obj.updateDynamic("default_service")(default_service.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (oauth_proxy != null) __obj.updateDynamic("oauth_proxy")(oauth_proxy.asInstanceOf[js.Any])
    if (popup != null) __obj.updateDynamic("popup")(popup.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri.asInstanceOf[js.Any])
    if (response_type != null) __obj.updateDynamic("response_type")(response_type.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[HelloJSLoginOptions]
  }
}

