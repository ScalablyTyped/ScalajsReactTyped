package typingsJapgolly.chromeApps.chrome.runtime

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.chromeApps.AnonAPPUPDATE
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chrome.events.Event
import typingsJapgolly.chromeApps.chromeAppsStrings.app_update
import typingsJapgolly.chromeApps.chromeAppsStrings.os_update
import typingsJapgolly.chromeApps.chromeAppsStrings.periodic
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @required(Chrome OS Kiosk app) Currently, this event is only fired for Chrome OS kiosk apps.
  * Fired when an app or the device that it runs on needs to be restarted.
  * The app should close all its windows at its earliest convenient time to let the restart to happen.
  * If the app does nothing, a restart will be enforced after a 24-hour grace period has passed.
  * @since Chrome 29.
  */
@JSGlobal("chrome.runtime.onRestartRequired")
@js.native
object onRestartRequired
  extends TopLevel[
      Event[
        js.Function1[
          /* reason */ ToStringLiteral[AnonAPPUPDATE, String, Exclude[String, app_update | os_update | periodic]], 
          Unit
        ]
      ]
    ]

