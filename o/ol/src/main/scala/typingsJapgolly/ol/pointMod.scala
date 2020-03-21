package typingsJapgolly.ol

import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.geometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/Point", JSImport.Namespace)
@js.native
object pointMod extends js.Object {
  @js.native
  trait Point
    extends typingsJapgolly.ol.simpleGeometryMod.default
  
  @js.native
  class default protected () extends Point {
    def this(coordinates: Coordinate) = this()
    def this(coordinates: Coordinate, opt_layout: GeometryLayout) = this()
  }
  
}

