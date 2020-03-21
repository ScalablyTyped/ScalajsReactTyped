package typingsJapgolly.chrome.chrome.sessions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Device extends js.Object {
  /** The name of the foreign device. */
  var deviceName: String
  /** A list of open window sessions for the foreign device, sorted from most recently to least recently modified session. */
  var sessions: js.Array[Session]
}

object Device {
  @scala.inline
  def apply(deviceName: String, sessions: js.Array[Session]): Device = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any], sessions = sessions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Device]
  }
}

