package typingsJapgolly.webix.mod

import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragOrder extends js.Object {
  @JSName("$dragDestroy")
  var $dragDestroy: Unit = js.native
  @JSName("$dragMark")
  var $dragMark: Boolean = js.native
  @JSName("$dragPos")
  var $dragPos_Original: WebixCallback = js.native
  @JSName("$drag")
  def $drag(source: HTMLElement, ev: Event_): String = js.native
  @JSName("$dragIn")
  def $dragIn(source: HTMLElement, target: HTMLElement, ev: Event_): HTMLElement = js.native
  @JSName("$dragOut")
  def $dragOut(source: HTMLElement, target: HTMLElement, drop: HTMLElement): Unit = js.native
  @JSName("$dragPos")
  def $dragPos(args: js.Any*): js.Any = js.native
  @JSName("$drop")
  def $drop(source: HTMLElement, target: HTMLElement, ev: Event_): Unit = js.native
}

@JSImport("webix", "DragOrder")
@js.native
object DragOrder extends TopLevel[DragOrder]

