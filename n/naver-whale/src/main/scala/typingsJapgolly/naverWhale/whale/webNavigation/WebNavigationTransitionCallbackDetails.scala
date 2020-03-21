package typingsJapgolly.naverWhale.whale.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebNavigationTransitionCallbackDetails
  extends typingsJapgolly.chrome.chrome.webNavigation.WebNavigationFramedCallbackDetails {
  /**
    * A list of transition qualifiers.
    * Each element one of: "client_redirect", "server_redirect", "forward_back", or "from_address_bar"
    */
  var transitionQualifiers: js.Array[String]
  /**
    * Cause of the navigation.
    * One of: "link", "typed", "auto_bookmark", "auto_subframe", "manual_subframe", "generated", "start_page", "form_submit", "reload", "keyword", or "keyword_generated"
    */
  var transitionType: String
}

object WebNavigationTransitionCallbackDetails {
  @scala.inline
  def apply(
    frameId: Double,
    processId: Double,
    tabId: Double,
    timeStamp: Double,
    transitionQualifiers: js.Array[String],
    transitionType: String,
    url: String
  ): WebNavigationTransitionCallbackDetails = {
    val __obj = js.Dynamic.literal(frameId = frameId.asInstanceOf[js.Any], processId = processId.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], transitionQualifiers = transitionQualifiers.asInstanceOf[js.Any], transitionType = transitionType.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebNavigationTransitionCallbackDetails]
  }
}

