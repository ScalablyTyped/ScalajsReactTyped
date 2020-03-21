package typingsJapgolly.chromeApps.chrome.webViewRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddResponseHeaderParams extends js.Object {
  /** HTTP response header name */
  var name: String
  /** HTTP response header value */
  var value: String
}

object AddResponseHeaderParams {
  @scala.inline
  def apply(name: String, value: String): AddResponseHeaderParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddResponseHeaderParams]
  }
}

