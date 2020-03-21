package typingsJapgolly.naverWhale.whale

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object contextMenus {
  type MenuClickedEvent = typingsJapgolly.chrome.chrome.events.Event[
    js.Function2[
      /* info */ typingsJapgolly.chrome.chrome.contextMenus.OnClickData, 
      /* tab */ js.UndefOr[typingsJapgolly.chrome.chrome.tabs.Tab], 
      scala.Unit
    ]
  ]
}
