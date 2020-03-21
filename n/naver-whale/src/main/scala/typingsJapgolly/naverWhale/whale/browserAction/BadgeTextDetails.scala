package typingsJapgolly.naverWhale.whale.browserAction

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BadgeTextDetails extends js.Object {
  /** Optional. Limits the change to when a particular tab is selected. Automatically resets when the tab is closed.  */
  var tabId: js.UndefOr[Double] = js.undefined
  /** Any number of characters can be passed, but only about four can fit in the space. */
  var text: String
}

object BadgeTextDetails {
  @scala.inline
  def apply(text: String, tabId: Int | Double = null): BadgeTextDetails = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BadgeTextDetails]
  }
}

