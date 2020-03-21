package typingsJapgolly.svgjsDraggable.svgjs

import org.scalajs.dom.raw.MouseEvent
import typingsJapgolly.svgjsDraggable.svgjs.draggable.DragDelta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  def beforedrag(event: MouseEvent): js.Any = js.native
  def dragend(delta: DragDelta, event: MouseEvent): js.Any = js.native
  def draggable(): this.type = js.native
  def draggable(obj: js.Object): this.type = js.native
  def dragmove(delta: DragDelta, event: MouseEvent): js.Any = js.native
  def dragstart(delta: DragDelta, event: MouseEvent): js.Any = js.native
  def fixed(): this.type = js.native
}

