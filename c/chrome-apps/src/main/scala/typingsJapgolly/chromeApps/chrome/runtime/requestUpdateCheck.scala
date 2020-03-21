package typingsJapgolly.chromeApps.chrome.runtime

import typingsJapgolly.chromeApps.AnonNOUPDATE
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chromeAppsStrings.no_update
import typingsJapgolly.chromeApps.chromeAppsStrings.throttled
import typingsJapgolly.chromeApps.chromeAppsStrings.update_available
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.runtime.requestUpdateCheck")
@js.native
object requestUpdateCheck extends js.Object {
  /**
    * Requests an update check for this app.
    * @since Chrome 25.
    * @param callback
    * Parameter status: Result of the update check. See enum RequestUpdateCheckStatus.
    * Optional parameter details: If an update is available, this contains more information about the available update.
    */
  def apply(
    callback: js.Function2[
      /* status */ ToStringLiteral[AnonNOUPDATE, String, Exclude[String, throttled | no_update | update_available]], 
      /* details */ js.UndefOr[UpdateCheckDetails], 
      Unit
    ]
  ): Unit = js.native
}

