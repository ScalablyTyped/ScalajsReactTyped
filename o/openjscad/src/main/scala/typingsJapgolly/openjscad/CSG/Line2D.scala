package typingsJapgolly.openjscad.CSG

import typingsJapgolly.openjscad.CxG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("CSG.Line2D")
@js.native
class Line2D protected () extends CxG {
  def this(normal: Vector2D, w: Double) = this()
  var normal: Vector2D = js.native
  var w: Double = js.native
  def absDistanceToPoint(point: Vector2D): Double = js.native
  def direction(): Vector2D = js.native
  def equals(l: Line2D): Boolean = js.native
  def intersectWithLine(line2d: Line2D): Vector2D = js.native
  def origin(): Vector2D = js.native
  def reverse(): Line2D = js.native
  def xAtY(y: Double): Double = js.native
}

/* static members */
@JSGlobal("CSG.Line2D")
@js.native
object Line2D extends js.Object {
  def fromPoints(p1: Vector2D, p2: Vector2D): Line2D = js.native
}

