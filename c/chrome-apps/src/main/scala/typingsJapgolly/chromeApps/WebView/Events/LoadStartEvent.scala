package typingsJapgolly.chromeApps.WebView.Events

import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when a load has begun.
  */
@js.native
trait LoadStartEvent extends Event_ {
  /** Whether the load is top-level or in a subframe. */
  var isTopLevel: Boolean = js.native
  /** Requested URL. */
  var url: String = js.native
}

