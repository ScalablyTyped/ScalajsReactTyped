package typingsJapgolly.chromeApps.chrome.vpnProvider

import org.scalablytyped.runtime.TopLevel
import typingsJapgolly.chromeApps.AnonDISCONNECTED
import typingsJapgolly.chromeApps.chrome.ToStringLiteral
import typingsJapgolly.chromeApps.chrome.events.Event
import typingsJapgolly.chromeApps.chromeAppsStrings.connected_
import typingsJapgolly.chromeApps.chromeAppsStrings.disconnected_
import typingsJapgolly.chromeApps.chromeAppsStrings.error
import typingsJapgolly.chromeApps.chromeAppsStrings.linkChanged
import typingsJapgolly.chromeApps.chromeAppsStrings.linkDown
import typingsJapgolly.chromeApps.chromeAppsStrings.linkUp
import typingsJapgolly.chromeApps.chromeAppsStrings.resume
import typingsJapgolly.chromeApps.chromeAppsStrings.suspend
import typingsJapgolly.std.Exclude
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Triggered when a message is received from the platform for a VPN configuration owned by the extension. */
@JSGlobal("chrome.vpnProvider.onPlatformMessage")
@js.native
object onPlatformMessage
  extends TopLevel[
      Event[
        js.Function3[
          /* id */ String, 
          /* message */ ToStringLiteral[
            AnonDISCONNECTED, 
            String, 
            Exclude[
              String, 
              linkUp | linkChanged | suspend | resume | linkDown | connected_ | error | disconnected_
            ]
          ], 
          /* error */ String, 
          Unit
        ]
      ]
    ]

