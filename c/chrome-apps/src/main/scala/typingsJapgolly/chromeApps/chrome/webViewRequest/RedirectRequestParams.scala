package typingsJapgolly.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RedirectRequestParams extends js.Object {
  /** Destination to where the request is redirected. */
  var redirectUrl: String
}

object RedirectRequestParams {
  @scala.inline
  def apply(redirectUrl: String): RedirectRequestParams = {
    val __obj = js.Dynamic.literal(redirectUrl = redirectUrl.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RedirectRequestParams]
  }
}

