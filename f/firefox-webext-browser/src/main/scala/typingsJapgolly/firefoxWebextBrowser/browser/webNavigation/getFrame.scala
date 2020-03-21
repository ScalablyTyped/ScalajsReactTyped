package typingsJapgolly.firefoxWebextBrowser.browser.webNavigation

import typingsJapgolly.firefoxWebextBrowser.AnonErrorOccurred
import typingsJapgolly.firefoxWebextBrowser.AnonFrameId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("browser.webNavigation.getFrame")
@js.native
object getFrame extends js.Object {
  /* webNavigation functions */
  /**
    * Retrieves information about the given frame. A frame refers to an <iframe> or a <frame> of a web page and is
    * identified by a tab ID and a frame ID.
    * @param details Information about the frame to retrieve information about.
    */
  def apply(details: AnonFrameId): js.Promise[AnonErrorOccurred] = js.native
}

