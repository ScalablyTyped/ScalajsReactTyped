package typingsJapgolly.zchatBrowser.mod

import typingsJapgolly.zchatBrowser.zchatBrowserStrings.closed
import typingsJapgolly.zchatBrowser.zchatBrowserStrings.connected
import typingsJapgolly.zchatBrowser.zchatBrowserStrings.connecting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zchat-browser", "getConnectionStatus")
@js.native
object getConnectionStatus extends js.Object {
  def apply(): connected | connecting | closed = js.native
}

