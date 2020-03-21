package typingsJapgolly.chromeApps.WebView.Events

import typingsJapgolly.chromeApps.chrome.integer
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fired when the embedded web content has been resized via autosize.
  * Only fires if autosize is enabled.
  */
@js.native
trait SizeChangedEvent extends Event_ {
  /** New height of embedded web content. */
  var newHeight: integer = js.native
  /** New width of embedded web content. */
  var newWidth: integer = js.native
  /** Old height of embedded web content. */
  var oldHeight: integer = js.native
  /** Old width of embedded web content. */
  var oldWidth: integer = js.native
}

