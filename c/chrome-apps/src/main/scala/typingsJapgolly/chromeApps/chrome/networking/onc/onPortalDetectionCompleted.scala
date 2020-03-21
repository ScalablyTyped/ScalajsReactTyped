package typingsJapgolly.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.chromeApps.chrome.events.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a portal detection for a network completes.
  * Sends the GUID of the network and the corresponding captive portal status.
  */
@JSGlobal("chrome.networking.onc.onPortalDetectionCompleted")
@js.native
object onPortalDetectionCompleted
  extends TopLevel[
      Event[js.Function2[/* networkGuid */ String, /* status */ CaptivePortalStatus, Unit]]
    ]

