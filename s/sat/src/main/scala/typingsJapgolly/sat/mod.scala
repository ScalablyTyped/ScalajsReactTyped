package typingsJapgolly.sat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sat", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Box ()
    extends typingsJapgolly.sat.SAT.Box {
    def this(pos: typingsJapgolly.sat.SAT.Vector) = this()
    def this(pos: typingsJapgolly.sat.SAT.Vector, width: Double) = this()
    def this(pos: typingsJapgolly.sat.SAT.Vector, width: Double, height: Double) = this()
  }
  
  @js.native
  class Circle ()
    extends typingsJapgolly.sat.SAT.Circle {
    def this(pos: typingsJapgolly.sat.SAT.Vector) = this()
    def this(pos: typingsJapgolly.sat.SAT.Vector, r: Double) = this()
  }
  
  @js.native
  class Polygon ()
    extends typingsJapgolly.sat.SAT.Polygon {
    def this(pos: typingsJapgolly.sat.SAT.Vector) = this()
    def this(pos: typingsJapgolly.sat.SAT.Vector, points: js.Array[typingsJapgolly.sat.SAT.Vector]) = this()
  }
  
  @js.native
  class Response ()
    extends typingsJapgolly.sat.SAT.Response
  
  @js.native
  /**
  		 * @class Vector has two properties
  		 * @param {number} x The x-coordinate of the Vector.
  		 * @param {number} y The y-coordinate of the Vector.
  		 */
  class Vector ()
    extends typingsJapgolly.sat.SAT.Vector {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
  }
  
  def pointInCircle(p: typingsJapgolly.sat.SAT.Vector, c: typingsJapgolly.sat.SAT.Circle): Boolean = js.native
  def pointInPolygon(p: typingsJapgolly.sat.SAT.Vector, poly: typingsJapgolly.sat.SAT.Polygon): Boolean = js.native
  def testCircleCircle(a: typingsJapgolly.sat.SAT.Circle, b: typingsJapgolly.sat.SAT.Circle): Boolean = js.native
  def testCircleCircle(
    a: typingsJapgolly.sat.SAT.Circle,
    b: typingsJapgolly.sat.SAT.Circle,
    response: typingsJapgolly.sat.SAT.Response
  ): Boolean = js.native
  def testCirclePolygon(circle: typingsJapgolly.sat.SAT.Circle, polygon: typingsJapgolly.sat.SAT.Polygon): Boolean = js.native
  def testCirclePolygon(
    circle: typingsJapgolly.sat.SAT.Circle,
    polygon: typingsJapgolly.sat.SAT.Polygon,
    response: typingsJapgolly.sat.SAT.Response
  ): Boolean = js.native
  def testPolygonCircle(polygon: typingsJapgolly.sat.SAT.Polygon, circle: typingsJapgolly.sat.SAT.Circle): Boolean = js.native
  def testPolygonCircle(
    polygon: typingsJapgolly.sat.SAT.Polygon,
    circle: typingsJapgolly.sat.SAT.Circle,
    response: typingsJapgolly.sat.SAT.Response
  ): Boolean = js.native
  def testPolygonPolygon(a: typingsJapgolly.sat.SAT.Polygon, b: typingsJapgolly.sat.SAT.Polygon): Boolean = js.native
  def testPolygonPolygon(
    a: typingsJapgolly.sat.SAT.Polygon,
    b: typingsJapgolly.sat.SAT.Polygon,
    response: typingsJapgolly.sat.SAT.Response
  ): Boolean = js.native
}

