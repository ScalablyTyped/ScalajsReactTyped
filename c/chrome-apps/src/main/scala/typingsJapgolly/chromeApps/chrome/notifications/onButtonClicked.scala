package typingsJapgolly.chromeApps.chrome.notifications

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.chromeApps.chrome.events.Event
import typingsJapgolly.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The user pressed a button in the notification. */
@JSGlobal("chrome.notifications.onButtonClicked")
@js.native
object onButtonClicked
  extends TopLevel[
      Event[js.Function2[/* notificationId */ String, /* buttonIndex */ integer, Unit]]
    ]

