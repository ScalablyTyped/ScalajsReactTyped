package typingsJapgolly.naverWhale.whale.webNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebNavigationCallbackDetails extends js.Object {
  /** The ID of the tab in which the navigation is about to occur. */
  var tabId: Double
  /** The time when the browser was about to start the navigation, in milliseconds since the epoch. */
  var timeStamp: Double
}

object WebNavigationCallbackDetails {
  @scala.inline
  def apply(tabId: Double, timeStamp: Double): WebNavigationCallbackDetails = {
    val __obj = js.Dynamic.literal(tabId = tabId.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebNavigationCallbackDetails]
  }
}

