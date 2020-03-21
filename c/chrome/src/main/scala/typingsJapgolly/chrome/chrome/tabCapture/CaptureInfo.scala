package typingsJapgolly.chrome.chrome.tabCapture

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptureInfo extends js.Object {
  /** Whether an element in the tab being captured is in fullscreen mode. */
  var fullscreen: Boolean
  /**
    * The new capture status of the tab.
    * One of: "pending", "active", "stopped", or "error"
    */
  var status: String
  /** The id of the tab whose status changed. */
  var tabId: Double
}

object CaptureInfo {
  @scala.inline
  def apply(fullscreen: Boolean, status: String, tabId: Double): CaptureInfo = {
    val __obj = js.Dynamic.literal(fullscreen = fullscreen.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tabId = tabId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CaptureInfo]
  }
}

