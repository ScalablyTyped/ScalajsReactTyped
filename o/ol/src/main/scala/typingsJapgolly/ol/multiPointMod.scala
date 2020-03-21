package typingsJapgolly.ol

import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.geometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/MultiPoint", JSImport.Namespace)
@js.native
object multiPointMod extends js.Object {
  @js.native
  trait MultiPoint
    extends typingsJapgolly.ol.simpleGeometryMod.default {
    def appendPoint(point: typingsJapgolly.ol.pointMod.default): Unit = js.native
    def getPoint(index: Double): typingsJapgolly.ol.pointMod.default = js.native
    def getPoints(): js.Array[typingsJapgolly.ol.pointMod.default] = js.native
  }
  
  @js.native
  class default protected () extends MultiPoint {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
}

