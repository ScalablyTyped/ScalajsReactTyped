package typingsJapgolly.chromeApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object runtime {
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsJapgolly.chromeApps.chrome.runtime.AutomationDesktop
    - typingsJapgolly.chromeApps.chrome.runtime.AutomationNonInteractive
  */
  type AutomationOptions = typingsJapgolly.chromeApps.chrome.runtime._AutomationOptions | scala.Boolean
  type ExtensionConnectEvent = typingsJapgolly.chromeApps.chrome.events.Event[
    js.Function1[/* port */ typingsJapgolly.chromeApps.chrome.runtime.Port, scala.Unit]
  ]
  type ExtensionMessageEvent = typingsJapgolly.chromeApps.chrome.events.Event[
    js.Function3[
      /* message */ js.Any, 
      /* sender */ typingsJapgolly.chromeApps.chrome.runtime.MessageSender, 
      /* sendResponse */ js.Function1[/* response */ js.Any, scala.Unit], 
      scala.Unit
    ]
  ]
  type ManifestIcons = /**
    * @example
    * {
    *   '16': 'icon16.png',
    *   '48': 'icon48.png',
    *   '128': 'icon128.png'
    * }
    */
  org.scalablytyped.runtime.NumberDictionary[java.lang.String]
  type RuntimeEvent = typingsJapgolly.chromeApps.chrome.events.Event[js.Function0[scala.Unit]]
}
