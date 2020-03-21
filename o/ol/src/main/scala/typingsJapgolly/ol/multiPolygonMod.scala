package typingsJapgolly.ol

import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.geometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/MultiPolygon", JSImport.Namespace)
@js.native
object multiPolygonMod extends js.Object {
  @js.native
  trait MultiPolygon
    extends typingsJapgolly.ol.simpleGeometryMod.default {
    def appendPolygon(polygon: typingsJapgolly.ol.polygonMod.default): Unit = js.native
    def getArea(): Double = js.native
    def getCoordinates(opt_right: Boolean): js.Array[js.Array[js.Array[Coordinate]]] = js.native
    def getEndss(): js.Array[js.Array[Double]] = js.native
    def getFlatInteriorPoints(): js.Array[Double] = js.native
    def getInteriorPoints(): typingsJapgolly.ol.multiPointMod.default = js.native
    def getOrientedFlatCoordinates(): js.Array[Double] = js.native
    def getPolygon(index: Double): typingsJapgolly.ol.polygonMod.default = js.native
    def getPolygons(): js.Array[typingsJapgolly.ol.polygonMod.default] = js.native
  }
  
  @js.native
  class default protected () extends MultiPolygon {
    def this(coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typingsJapgolly.ol.polygonMod.default]) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typingsJapgolly.ol.polygonMod.default],
      opt_layout: GeometryLayout
    ) = this()
    def this(
      coordinates: js.Array[js.Array[js.Array[Coordinate]] | Double | typingsJapgolly.ol.polygonMod.default],
      opt_layout: GeometryLayout,
      opt_endss: js.Array[js.Array[Double]]
    ) = this()
  }
  
}

