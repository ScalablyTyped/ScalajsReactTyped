package typingsJapgolly.firefoxWebextBrowser.browser.browserAction

import typingsJapgolly.firefoxWebextBrowser.AnonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.browserAction.setBadgeText")
@js.native
object setBadgeText extends js.Object {
  /**
    * Sets the badge text for the browser action. The badge is displayed on top of the icon.
    * @param details Specifies to which tab or window the value should be set, or from which one it should be
    *     retrieved. If no tab nor window is specified, the global value is set or retrieved.
    */
  def apply(details: AnonText): js.Promise[Unit] = js.native
}

