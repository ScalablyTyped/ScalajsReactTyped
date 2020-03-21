package typingsJapgolly.foundationSites.FoundationSites

import typingsJapgolly.foundationSites.JQuery
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://foundation.zurb.com/sites/docs/offcanvas.html#javascript-reference
@js.native
trait OffCanvas extends js.Object {
  def close(): Unit = js.native
  def close(cb: js.Function): Unit = js.native
  def destroy(): Unit = js.native
  def open(event: Event_, trigger: JQuery): Unit = js.native
  def reveal(isRevealed: Boolean): Unit = js.native
  def toggle(event: Event_, trigger: JQuery): Unit = js.native
}

