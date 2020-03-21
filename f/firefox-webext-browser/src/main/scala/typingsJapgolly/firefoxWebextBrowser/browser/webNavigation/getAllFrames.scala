package typingsJapgolly.firefoxWebextBrowser.browser.webNavigation

import typingsJapgolly.firefoxWebextBrowser.AnonParentFrameId
import typingsJapgolly.firefoxWebextBrowser.AnonTabIdNumber
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.webNavigation.getAllFrames")
@js.native
object getAllFrames extends js.Object {
  /**
    * Retrieves information about all frames of a given tab.
    * @param details Information about the tab to retrieve all frames from.
    */
  def apply(details: AnonTabIdNumber): js.Promise[js.Array[AnonParentFrameId]] = js.native
}

