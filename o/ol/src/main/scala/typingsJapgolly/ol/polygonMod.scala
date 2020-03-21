package typingsJapgolly.ol

import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.geometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom/Polygon", JSImport.Namespace)
@js.native
object polygonMod extends js.Object {
  @js.native
  trait Polygon
    extends typingsJapgolly.ol.simpleGeometryMod.default {
    def appendLinearRing(linearRing: typingsJapgolly.ol.linearRingMod.default): Unit = js.native
    def getArea(): Double = js.native
    def getCoordinates(opt_right: Boolean): js.Array[js.Array[Coordinate]] = js.native
    def getEnds(): js.Array[Double] = js.native
    def getFlatInteriorPoint(): js.Array[Double] = js.native
    def getInteriorPoint(): typingsJapgolly.ol.pointMod.default = js.native
    def getLinearRing(index: Double): typingsJapgolly.ol.linearRingMod.default = js.native
    def getLinearRingCount(): Double = js.native
    def getLinearRings(): js.Array[typingsJapgolly.ol.linearRingMod.default] = js.native
    def getOrientedFlatCoordinates(): js.Array[Double] = js.native
  }
  
  @js.native
  class default protected () extends Polygon {
    def this(coordinates: js.Array[js.Array[Coordinate] | Double]) = this()
    def this(coordinates: js.Array[js.Array[Coordinate] | Double], opt_layout: GeometryLayout) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double],
      opt_layout: GeometryLayout,
      opt_ends: js.Array[Double]
    ) = this()
  }
  
  def circular(center: Coordinate, radius: Double): Polygon = js.native
  def circular(center: Coordinate, radius: Double, opt_n: Double): Polygon = js.native
  def circular(center: Coordinate, radius: Double, opt_n: Double, opt_sphereRadius: Double): Polygon = js.native
  def fromCircle(circle: typingsJapgolly.ol.circleMod.default): Polygon = js.native
  def fromCircle(circle: typingsJapgolly.ol.circleMod.default, opt_sides: Double): Polygon = js.native
  def fromCircle(circle: typingsJapgolly.ol.circleMod.default, opt_sides: Double, opt_angle: Double): Polygon = js.native
  def fromExtent(extent: Extent): Polygon = js.native
  def makeRegular(polygon: Polygon, center: Coordinate, radius: Double): Unit = js.native
  def makeRegular(polygon: Polygon, center: Coordinate, radius: Double, opt_angle: Double): Unit = js.native
}

