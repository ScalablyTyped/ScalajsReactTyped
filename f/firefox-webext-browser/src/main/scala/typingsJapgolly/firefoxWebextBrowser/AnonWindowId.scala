package typingsJapgolly.firefoxWebextBrowser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWindowId extends js.Object {
  /** Sets the sidebar title for the tab specified by tabId. Automatically resets when the tab is closed. */
  var tabId: js.UndefOr[Double] = js.undefined
  /** The string the sidebar action should display when moused over. */
  var title: String | Null
  /** Sets the sidebar title for the window specified by windowId. */
  var windowId: js.UndefOr[Double] = js.undefined
}

object AnonWindowId {
  @scala.inline
  def apply(tabId: Int | Double = null, title: String = null, windowId: Int | Double = null): AnonWindowId = {
    val __obj = js.Dynamic.literal()
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWindowId]
  }
}

