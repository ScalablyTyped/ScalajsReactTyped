package typingsJapgolly.ol

import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.geometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/LinearRing", JSImport.Namespace)
@js.native
object linearRingMod extends js.Object {
  @js.native
  trait LinearRing
    extends typingsJapgolly.ol.simpleGeometryMod.default {
    def getArea(): Double = js.native
  }
  
  @js.native
  class default protected () extends LinearRing {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
}

