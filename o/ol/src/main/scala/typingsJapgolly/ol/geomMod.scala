package typingsJapgolly.ol

import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.geomCircleMod.default
import typingsJapgolly.ol.geomGeometryLayoutMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomMod {
  
  @JSImport("ol/geom", "Circle")
  @js.native
  open class Circle protected () extends default {
    def this(center: Coordinate) = this()
    def this(center: Coordinate, opt_radius: Double) = this()
    def this(center: Coordinate, opt_radius: Double, opt_layout: GeometryLayout) = this()
    def this(center: Coordinate, opt_radius: Unit, opt_layout: GeometryLayout) = this()
  }
  
  /* note: abstract class */ @JSImport("ol/geom", "Geometry")
  @js.native
  open class Geometry ()
    extends typingsJapgolly.ol.geomGeometryMod.default
  
  @JSImport("ol/geom", "GeometryCollection")
  @js.native
  open class GeometryCollection ()
    extends typingsJapgolly.ol.geomGeometryCollectionMod.default {
    def this(opt_geometries: js.Array[typingsJapgolly.ol.geomGeometryMod.default]) = this()
  }
  
  @JSImport("ol/geom", "LineString")
  @js.native
  open class LineString protected ()
    extends typingsJapgolly.ol.geomLineStringMod.default {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
  @JSImport("ol/geom", "LinearRing")
  @js.native
  open class LinearRing protected ()
    extends typingsJapgolly.ol.geomLinearRingMod.default {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
  @JSImport("ol/geom", "MultiLineString")
  @js.native
  open class MultiLineString protected ()
    extends typingsJapgolly.ol.geomMultiLineStringMod.default {
    def this(coordinates: js.Array[js.Array[Coordinate] | Double | typingsJapgolly.ol.geomLineStringMod.default]) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typingsJapgolly.ol.geomLineStringMod.default],
      opt_layout: GeometryLayout
    ) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typingsJapgolly.ol.geomLineStringMod.default],
      opt_layout: Unit,
      opt_ends: js.Array[Double]
    ) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double | typingsJapgolly.ol.geomLineStringMod.default],
      opt_layout: GeometryLayout,
      opt_ends: js.Array[Double]
    ) = this()
  }
  
  @JSImport("ol/geom", "MultiPoint")
  @js.native
  open class MultiPoint protected ()
    extends typingsJapgolly.ol.geomMultiPointMod.default {
    def this(coordinates: js.Array[Coordinate | Double]) = this()
    def this(coordinates: js.Array[Coordinate | Double], opt_layout: GeometryLayout) = this()
  }
  
  @JSImport("ol/geom", "MultiPolygon")
  @js.native
  open class MultiPolygon protected ()
    extends typingsJapgolly.ol.geomMultiPolygonMod.default {
    def this(coordinates: js.Array[
            js.Array[js.Array[Coordinate]] | Double | typingsJapgolly.ol.geomPolygonMod.default
          ]) = this()
    def this(
      coordinates: js.Array[
            js.Array[js.Array[Coordinate]] | Double | typingsJapgolly.ol.geomPolygonMod.default
          ],
      opt_layout: GeometryLayout
    ) = this()
    def this(
      coordinates: js.Array[
            js.Array[js.Array[Coordinate]] | Double | typingsJapgolly.ol.geomPolygonMod.default
          ],
      opt_layout: Unit,
      opt_endss: js.Array[js.Array[Double]]
    ) = this()
    def this(
      coordinates: js.Array[
            js.Array[js.Array[Coordinate]] | Double | typingsJapgolly.ol.geomPolygonMod.default
          ],
      opt_layout: GeometryLayout,
      opt_endss: js.Array[js.Array[Double]]
    ) = this()
  }
  
  @JSImport("ol/geom", "Point")
  @js.native
  open class Point protected ()
    extends typingsJapgolly.ol.geomPointMod.default {
    def this(coordinates: Coordinate) = this()
    def this(coordinates: Coordinate, opt_layout: GeometryLayout) = this()
  }
  
  @JSImport("ol/geom", "Polygon")
  @js.native
  open class Polygon protected ()
    extends typingsJapgolly.ol.geomPolygonMod.default {
    def this(coordinates: js.Array[js.Array[Coordinate] | Double]) = this()
    def this(coordinates: js.Array[js.Array[Coordinate] | Double], opt_layout: GeometryLayout) = this()
    def this(coordinates: js.Array[js.Array[Coordinate] | Double], opt_layout: Unit, opt_ends: js.Array[Double]) = this()
    def this(
      coordinates: js.Array[js.Array[Coordinate] | Double],
      opt_layout: GeometryLayout,
      opt_ends: js.Array[Double]
    ) = this()
  }
  
  /* note: abstract class */ @JSImport("ol/geom", "SimpleGeometry")
  @js.native
  open class SimpleGeometry ()
    extends typingsJapgolly.ol.geomSimpleGeometryMod.default
}
