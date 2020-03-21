package typingsJapgolly.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object vpnProvider {
  type VpnConfigCreationEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function3[
      /* id */ java.lang.String, 
      /* name */ java.lang.String, 
      /* data */ js.Object, 
      scala.Unit
    ]
  ]
  type VpnConfigRemovalEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function1[/* id */ java.lang.String, scala.Unit]]
  type VpnPacketReceptionEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function1[/* data */ scala.scalajs.js.typedarray.ArrayBuffer, scala.Unit]]
  type VpnPlatformMessageEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function3[
      /* id */ java.lang.String, 
      /* message */ java.lang.String, 
      /* error */ java.lang.String, 
      scala.Unit
    ]
  ]
  type VpnUiEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[/* event */ java.lang.String, /* id */ js.UndefOr[java.lang.String], scala.Unit]
  ]
}
