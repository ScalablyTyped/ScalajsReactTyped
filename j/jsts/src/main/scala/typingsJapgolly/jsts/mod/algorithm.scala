package typingsJapgolly.jsts.mod

import typingsJapgolly.jsts.jsts.geom.Coordinate
import typingsJapgolly.jsts.jsts.geom.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jsts", "algorithm")
@js.native
object algorithm extends js.Object {
  @js.native
  class BoundaryNodeRule ()
    extends typingsJapgolly.jsts.jsts.algorithm.BoundaryNodeRule
  
  @js.native
  class Orientation ()
    extends typingsJapgolly.jsts.jsts.algorithm.Orientation
  
  /* static members */
  @js.native
  object Orientation extends js.Object {
    var CLOCKWISE: Double = js.native
    var COLLINEAR: Double = js.native
    var COUNTERCLOCKWISE: Double = js.native
    var LEFT: Double = js.native
    var RIGHT: Double = js.native
    var STRAIGHT: Double = js.native
    def index(p1: Point, p2: Point, q: Point): Double = js.native
    def isCCW(ring: js.Array[Coordinate]): Boolean = js.native
  }
  
}

