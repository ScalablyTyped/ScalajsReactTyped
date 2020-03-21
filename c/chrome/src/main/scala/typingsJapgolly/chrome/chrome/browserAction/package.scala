package typingsJapgolly.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object browserAction {
  type BrowserClickedEvent = typingsJapgolly.chrome.chrome.events.Event[js.Function1[/* tab */ typingsJapgolly.chrome.chrome.tabs.Tab, scala.Unit]]
  type ColorArray = js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
}
