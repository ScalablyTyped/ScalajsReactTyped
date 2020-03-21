package typingsJapgolly.webcola.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webcola", "Rectangle")
@js.native
class Rectangle protected ()
  extends typingsJapgolly.webcola.rectangleMod.Rectangle {
  def this(x: Double, X: Double, y: Double, Y: Double) = this()
}

/* static members */
@JSImport("webcola", "Rectangle")
@js.native
object Rectangle extends js.Object {
  def empty(): typingsJapgolly.webcola.rectangleMod.Rectangle = js.native
  def lineIntersection(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): typingsJapgolly.webcola.geomMod.Point = js.native
}

