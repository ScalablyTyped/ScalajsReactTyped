package typingsJapgolly.smoothScrollbar

import typingsJapgolly.smoothScrollbar.scrollbarMod.ScrollStatus
import typingsJapgolly.smoothScrollbar.scrollbarMod.Scrollbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/scrolling/set-position", JSImport.Namespace)
@js.native
object setPositionMod extends js.Object {
  def setPosition(scrollbar: Scrollbar, x: Double, y: Double): ScrollStatus | Null = js.native
}

