package typingsJapgolly.chrome.chrome.declarativeWebRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveRequestCookie extends js.Object {
  var filter: RequestCookie
}

object RemoveRequestCookie {
  @scala.inline
  def apply(filter: RequestCookie): RemoveRequestCookie = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveRequestCookie]
  }
}

