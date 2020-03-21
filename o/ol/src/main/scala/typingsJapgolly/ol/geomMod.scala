package typingsJapgolly.ol

import typingsJapgolly.ol.circleMod.default
import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.geometryLayoutMod.GeometryLayout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/geom", JSImport.Namespace)
@js.native
object geomMod extends js.Object {
  @js.native
  class Circle protected () extends default {
    def this(center: Coordinate) = this()
    def this(center: Coordinate, opt_radius: Double) = this()
    def this(center: Coordinate, opt_radius: Double, opt_layout: GeometryLayout) = this()
  }
  
  @js.native
  abstract class Geometry ()
    extends typingsJapgolly.ol.geometryMod.default
  
  @js.native
  class GeometryCollection ()
    extends typingsJapgolly.ol.geometryCollectionMod.default {
    def this(opt_geometries: js.Array[typingsJapgolly.ol.geometryMod.default]) = this()
  }
  
  @js.native
  class LineString protected ()
    extends typingsJapgolly.ol.lineStringMod.default {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
  @js.native
  class LinearRing protected ()
    extends typingsJapgolly.ol.linearRingMod.default {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
  @js.native
  class MultiLineString protected ()
    extends typingsJapgolly.ol.multiLineStringMod.default {
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
  
  @js.native
  class MultiPoint protected ()
    extends typingsJapgolly.ol.multiPointMod.default {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
  @js.native
  class MultiPolygon protected ()
    extends typingsJapgolly.ol.multiPolygonMod.default {
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
  
  @js.native
  class Point protected ()
    extends typingsJapgolly.ol.pointMod.default {
    def this(coordinates: Coordinate) = this()
    def this(coordinates: Coordinate, opt_layout: GeometryLayout) = this()
  }
  
  @js.native
  class Polygon protected ()
    extends typingsJapgolly.ol.polygonMod.default {
    def this(coordinates: js.Array[js.Array[Coordinate] | Double]) = this()
    def this(coordinates: js.Array[js.Array[Coordinate] | Double], opt_layout: GeometryLayout) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double],
      opt_layout: GeometryLayout,
      opt_ends: js.Array[Double]
    ) = this()
  }
  
}

