package typingsJapgolly.chromeApps.WebView.Events

import typingsJapgolly.chromeApps.chrome.double
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Fired when the page's zoom changes. */
@js.native
trait ZoomChangeEvent extends Event_ {
  /** The new zoom factor that the page was zoomed to. */
  var newzoomFactor: double = js.native
  /** The page's previous zoom factor. */
  var oldzoomFactor: double = js.native
}

