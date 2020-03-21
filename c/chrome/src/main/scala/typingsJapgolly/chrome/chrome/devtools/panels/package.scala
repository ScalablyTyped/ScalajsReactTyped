package typingsJapgolly.chrome.chrome.devtools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object panels {
  type ButtonClickedEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  type ExtensionSidebarPaneHiddenEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  type ExtensionSidebarPaneShownEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function1[/* window */ typingsJapgolly.chrome.chrome.windows.Window, scala.Unit]
  ]
  type PanelHiddenEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function0[scala.Unit]]
  type PanelSearchEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* action */ java.lang.String, 
      /* queryString */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ]
  type PanelShownEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function1[/* window */ typingsJapgolly.chrome.Window, scala.Unit]]
  type SelectionChangedEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function0[scala.Unit]]
}
