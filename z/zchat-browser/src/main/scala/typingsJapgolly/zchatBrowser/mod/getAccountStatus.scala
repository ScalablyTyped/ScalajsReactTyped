package typingsJapgolly.zchatBrowser.mod

import typingsJapgolly.zchatBrowser.zchatBrowserStrings.away
import typingsJapgolly.zchatBrowser.zchatBrowserStrings.offline
import typingsJapgolly.zchatBrowser.zchatBrowserStrings.online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zchat-browser", "getAccountStatus")
@js.native
object getAccountStatus extends js.Object {
  def apply(): online | offline | away = js.native
}

