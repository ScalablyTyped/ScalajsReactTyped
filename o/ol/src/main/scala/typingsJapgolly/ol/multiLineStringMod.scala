package typingsJapgolly.ol

import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.geometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/MultiLineString", JSImport.Namespace)
@js.native
object multiLineStringMod extends js.Object {
  @js.native
  trait MultiLineString
    extends typingsJapgolly.ol.simpleGeometryMod.default {
    def appendLineString(lineString: typingsJapgolly.ol.lineStringMod.default): Unit = js.native
    def getCoordinateAtM(m: Double): Coordinate = js.native
    def getCoordinateAtM(m: Double, opt_extrapolate: Boolean): Coordinate = js.native
    def getCoordinateAtM(m: Double, opt_extrapolate: Boolean, opt_interpolate: Boolean): Coordinate = js.native
    def getEnds(): js.Array[Double] = js.native
    def getFlatMidpoints(): js.Array[Double] = js.native
    def getLineString(index: Double): typingsJapgolly.ol.lineStringMod.default = js.native
    def getLineStrings(): js.Array[typingsJapgolly.ol.lineStringMod.default] = js.native
  }
  
  @js.native
  class default protected () extends MultiLineString {
    def this(coordinates: js.Array[js.Array[Coordinate] | Double | typingsJapgolly.ol.lineStringMod.default]) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typingsJapgolly.ol.lineStringMod.default],
      opt_layout: GeometryLayout
    ) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typingsJapgolly.ol.lineStringMod.default],
      opt_layout: GeometryLayout,
      opt_ends: js.Array[Double]
    ) = this()
  }
  
}

