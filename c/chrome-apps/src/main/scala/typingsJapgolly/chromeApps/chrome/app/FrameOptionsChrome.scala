package typingsJapgolly.chromeApps.chrome.app

import typingsJapgolly.chromeApps.chromeAppsStrings.chrome
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameOptionsChrome extends js.Object {
  /**
    * Allows the frame color of the window when active to be set. Frame coloring is only available if the frame type is chrome.
    * Frame coloring is only available if the frame type is chrome.
    * @since Frame coloring is new in Chrome 36.
    */
  var activeColor: js.UndefOr[String] = js.undefined
  /**
    * Allows the frame color to be set. Frame coloring is only available if the frame type is chrome.
    * @since Frame coloring is new in Chrome 36.
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Allows the frame color of the window when inactive to be set differently to the active color. Frame coloring is only available if the frame type is chrome.
    * inactiveColor must be used in conjunction with color.
    * @since Frame coloring is new in Chrome 36.
    */
  var inactiveColor: js.UndefOr[String] = js.undefined
  /**
    * Frame type: none or chrome (defaults to chrome).
    *
    * For none, the -webkit-app-region CSS property can be used to apply draggability to the app's window.
    * -webkit-app-region: drag can be used to mark regions draggable. no-drag can be used to disable this style on nested elements.
    */
  var `type`: chrome
}

object FrameOptionsChrome {
  @scala.inline
  def apply(`type`: chrome, activeColor: String = null, color: String = null, inactiveColor: String = null): FrameOptionsChrome = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (activeColor != null) __obj.updateDynamic("activeColor")(activeColor.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (inactiveColor != null) __obj.updateDynamic("inactiveColor")(inactiveColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameOptionsChrome]
  }
}

