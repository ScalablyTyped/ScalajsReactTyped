package typingsJapgolly.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object windows {
  type WindowIdEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* windowId */ scala.Double, 
      /* filters */ js.UndefOr[typingsJapgolly.chrome.chrome.windows.WindowEventFilter], 
      scala.Unit
    ]
  ]
  type WindowReferenceEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* window */ typingsJapgolly.chrome.chrome.windows.Window, 
      /* filters */ js.UndefOr[typingsJapgolly.chrome.chrome.windows.WindowEventFilter], 
      scala.Unit
    ]
  ]
}
