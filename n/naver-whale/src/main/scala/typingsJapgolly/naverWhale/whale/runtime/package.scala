package typingsJapgolly.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object runtime {
  type ExtensionConnectEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function1[/* port */ typingsJapgolly.chrome.chrome.runtime.Port, scala.Unit]]
  type ExtensionMessageEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function3[
      /* message */ js.Any, 
      /* sender */ typingsJapgolly.chrome.chrome.runtime.MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.UndefOr[js.Any], scala.Unit], 
      scala.Unit
    ]
  ]
  type ManifestIcons = org.scalablytyped.runtime.NumberDictionary[java.lang.String]
  type PortDisconnectEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function1[/* port */ typingsJapgolly.chrome.chrome.runtime.Port, scala.Unit]]
  type PortMessageEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* message */ js.Any, 
      /* port */ typingsJapgolly.chrome.chrome.runtime.Port, 
      scala.Unit
    ]
  ]
  type RuntimeEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  type RuntimeInstalledEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[/* details */ typingsJapgolly.chrome.chrome.runtime.InstalledDetails, scala.Unit]
  ]
  type RuntimeRestartRequiredEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function1[/* reason */ java.lang.String, scala.Unit]]
  type RuntimeUpdateAvailableEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[
      /* details */ typingsJapgolly.chrome.chrome.runtime.UpdateAvailableDetails, 
      scala.Unit
    ]
  ]
}
