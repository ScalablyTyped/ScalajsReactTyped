package typingsJapgolly.blueprintjsTable.mod

import typingsJapgolly.blueprintjsTable.rectMod.AnyRect
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table", "Rect")
@js.native
class Rect protected ()
  extends typingsJapgolly.blueprintjsTable.commonMod.Rect {
  def this(left: Double, top: Double, width: Double, height: Double) = this()
}

/* static members */
@JSImport("@blueprintjs/table", "Rect")
@js.native
object Rect extends js.Object {
  var ORIGIN: typingsJapgolly.blueprintjsTable.rectMod.Rect = js.native
  /**
    * Returns the CSS properties representing the absolute positioning of
    * this Rect.
    */
  def style(rect: AnyRect): CSSProperties = js.native
  /**
    * Returns a new Rect that subtracts the origin of the second argument
    * from the first.
    */
  def subtractOrigin(anyRect0: AnyRect, anyRect1: AnyRect): typingsJapgolly.blueprintjsTable.rectMod.Rect = js.native
  /**
    * Returns the smallest Rect that entirely contains the supplied rects
    */
  def union(anyRect0: AnyRect, anyRect1: AnyRect): typingsJapgolly.blueprintjsTable.rectMod.Rect = js.native
  /**
    * Given a ClientRect or Rect object, returns a Rect object.
    */
  def wrap(rect: AnyRect): typingsJapgolly.blueprintjsTable.rectMod.Rect = js.native
}

