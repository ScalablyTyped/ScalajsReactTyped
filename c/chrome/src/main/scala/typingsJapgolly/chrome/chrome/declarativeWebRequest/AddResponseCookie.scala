package typingsJapgolly.chrome.chrome.declarativeWebRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddResponseCookie extends js.Object {
  var cookie: ResponseCookie
}

object AddResponseCookie {
  @scala.inline
  def apply(cookie: ResponseCookie): AddResponseCookie = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddResponseCookie]
  }
}

