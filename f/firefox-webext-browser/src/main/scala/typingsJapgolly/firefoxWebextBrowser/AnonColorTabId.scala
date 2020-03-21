package typingsJapgolly.firefoxWebextBrowser

import typingsJapgolly.firefoxWebextBrowser.browser.browserAction.ColorValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColorTabId extends js.Object {
  var color: ColorValue
  /**
    * When setting a value, it will be specific to the specified tab, and will automatically reset when the tab
    * navigates. When getting, specifies the tab to get the value from; if there is no tab-specific value, the
    * window one will be inherited.
    */
  var tabId: js.UndefOr[Double] = js.undefined
  /**
    * When setting a value, it will be specific to the specified window. When getting, specifies the window to get
    * the value from; if there is no window-specific value, the global one will be inherited.
    */
  var windowId: js.UndefOr[Double] = js.undefined
}

object AnonColorTabId {
  @scala.inline
  def apply(color: ColorValue = null, tabId: Int | Double = null, windowId: Int | Double = null): AnonColorTabId = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (tabId != null) __obj.updateDynamic("tabId")(tabId.asInstanceOf[js.Any])
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColorTabId]
  }
}

