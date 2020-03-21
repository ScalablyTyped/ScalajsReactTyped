package typingsJapgolly.chromeApps.chrome.notifications

import typingsJapgolly.chromeApps.chromeAppsStrings.denied
import typingsJapgolly.chromeApps.chromeAppsStrings.granted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @enum
  * @property GRANTED - User has elected to show notifications from the app . This is the default at install time.
  * @property DENIED - User has elected not to show notifications from the app.
  */
@JSGlobal("chrome.notifications.PermissionLevel")
@js.native
object PermissionLevel extends js.Object {
  var DENIED: denied = js.native
  var GRANTED: granted = js.native
}

