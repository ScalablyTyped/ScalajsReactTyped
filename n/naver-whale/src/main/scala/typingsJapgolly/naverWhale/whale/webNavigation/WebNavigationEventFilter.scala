package typingsJapgolly.naverWhale.whale.webNavigation

import typingsJapgolly.chrome.chrome.events.UrlFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebNavigationEventFilter extends js.Object {
  /** Conditions that the URL being navigated to must satisfy. The 'schemes' and 'ports' fields of UrlFilter are ignored for this event. */
  var url: js.Array[UrlFilter]
}

object WebNavigationEventFilter {
  @scala.inline
  def apply(url: js.Array[UrlFilter]): WebNavigationEventFilter = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebNavigationEventFilter]
  }
}

