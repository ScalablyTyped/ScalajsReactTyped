package typingsJapgolly.chromeApps.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object contextMenus {
  type MenuClickedEvent = typingsJapgolly.chromeApps.chrome.events.Event[
    js.Function1[/* info */ typingsJapgolly.chromeApps.chrome.contextMenus.OnClickData, scala.Unit]
  ]
}
