package typingsJapgolly.facebookJsSdk.facebook

import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.async
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.iframe
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.page
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.popup
import typingsJapgolly.facebookJsSdk.facebookJsSdkStrings.share
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareDialogParams extends DialogParams {
  var hashtag: js.UndefOr[String] = js.undefined
  var href: String
  var method: share
  var mobile_iframe: js.UndefOr[Boolean] = js.undefined
  var quote: js.UndefOr[String] = js.undefined
}

object ShareDialogParams {
  @scala.inline
  def apply(
    href: String,
    method: share,
    app_id: String = null,
    display: page | iframe | async | popup = null,
    hashtag: String = null,
    mobile_iframe: js.UndefOr[Boolean] = js.undefined,
    quote: String = null,
    redirect_uri: String = null
  ): ShareDialogParams = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    if (app_id != null) __obj.updateDynamic("app_id")(app_id.asInstanceOf[js.Any])
    if (display != null) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (hashtag != null) __obj.updateDynamic("hashtag")(hashtag.asInstanceOf[js.Any])
    if (!js.isUndefined(mobile_iframe)) __obj.updateDynamic("mobile_iframe")(mobile_iframe.asInstanceOf[js.Any])
    if (quote != null) __obj.updateDynamic("quote")(quote.asInstanceOf[js.Any])
    if (redirect_uri != null) __obj.updateDynamic("redirect_uri")(redirect_uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareDialogParams]
  }
}

