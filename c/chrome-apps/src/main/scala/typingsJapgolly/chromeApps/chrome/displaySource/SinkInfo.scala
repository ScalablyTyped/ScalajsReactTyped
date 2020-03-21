package typingsJapgolly.chromeApps.chrome.displaySource

import typingsJapgolly.chromeApps.AnonCONNECTED
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chrome.integer
import typingsJapgolly.chromeApps.chromeAppsStrings.Connected
import typingsJapgolly.chromeApps.chromeAppsStrings.Connecting
import typingsJapgolly.chromeApps.chromeAppsStrings.Disconnected
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinkInfo extends js.Object {
  /** Id of the sink. It is guaranteed to be unique during the browser session. */
  var id: integer
  /** Human readable name of the sink. */
  var name: String
  /**
    * State of the sink.
    * @see SinkState
    */
  var state: ToStringLiteral[AnonCONNECTED, String, Exclude[String, Connected | Connecting | Disconnected]]
}

object SinkInfo {
  @scala.inline
  def apply(
    id: integer,
    name: String,
    state: ToStringLiteral[AnonCONNECTED, String, Exclude[String, Connected | Connecting | Disconnected]]
  ): SinkInfo = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SinkInfo]
  }
}

