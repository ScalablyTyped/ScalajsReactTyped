package typingsJapgolly.firefoxWebextBrowser.browser.theme

import typingsJapgolly.firefoxWebextBrowser.browser.manifest.ThemeType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.theme.getCurrent")
@js.native
object getCurrent extends js.Object {
  /* theme functions */
  /**
    * Returns the current theme for the specified window or the last focused window.
    * @param [windowId] The window for which we want the theme.
    */
  def apply(): js.Promise[ThemeType] = js.native
  def apply(windowId: Double): js.Promise[ThemeType] = js.native
}

