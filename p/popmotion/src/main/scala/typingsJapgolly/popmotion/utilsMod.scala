package typingsJapgolly.popmotion

import typingsJapgolly.popmotion.pointerTypesMod.PointerPoint
import typingsJapgolly.std.MouseEvent
import typingsJapgolly.std.Touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("popmotion/lib/input/pointer/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
  def defaultPointerPos(): PointerPoint = js.native
  def eventToPoint(e: MouseEvent): PointerPoint = js.native
  def eventToPoint(e: MouseEvent, point: PointerPoint): PointerPoint = js.native
  def eventToPoint(e: Touch): PointerPoint = js.native
  def eventToPoint(e: Touch, point: PointerPoint): PointerPoint = js.native
}

