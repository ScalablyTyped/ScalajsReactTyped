package typingsJapgolly.chromeApps.chrome.syncFileSystem

import typingsJapgolly.chromeApps.AnonAUTHENTICATIONREQUIRED
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chromeAppsStrings.authentication_required
import typingsJapgolly.chromeApps.chromeAppsStrings.disabled_
import typingsJapgolly.chromeApps.chromeAppsStrings.initializing
import typingsJapgolly.chromeApps.chromeAppsStrings.running
import typingsJapgolly.chromeApps.chromeAppsStrings.temporary_unavailable
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.syncFileSystem.getServiceStatus")
@js.native
object getServiceStatus extends js.Object {
  /**
    * Returns the current sync backend status.
    * @since Chrome 31.
    * @param callback
    * @see ServiceStatus
    */
  def apply(
    callback: js.Function1[
      /* status */ ToStringLiteral[
        AnonAUTHENTICATIONREQUIRED, 
        String, 
        Exclude[
          String, 
          temporary_unavailable | authentication_required | disabled_ | initializing | running
        ]
      ], 
      Unit
    ]
  ): Unit = js.native
}

