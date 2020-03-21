package typingsJapgolly.smoothScrollbar

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.smoothScrollbar.scrollbarMod.Scrollbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("smooth-scrollbar/geometry/is-visible", JSImport.Namespace)
@js.native
object isVisibleMod extends js.Object {
  def isVisible(scrollbar: Scrollbar, elem: HTMLElement): Boolean = js.native
}

