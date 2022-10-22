package typingsJapgolly.ol

import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.geomGeometryLayoutMod.GeometryLayout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geomMultiPolygonMod {
  
  @JSImport("ol/geom/MultiPolygon", JSImport.Default)
  @js.native
  open class default protected () extends MultiPolygon {
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
  
  @js.native
  trait MultiPolygon
    extends typingsJapgolly.ol.geomSimpleGeometryMod.default {
    
    /**
      * Append the passed polygon to this multipolygon.
      */
    def appendPolygon(polygon: typingsJapgolly.ol.geomPolygonMod.default): Unit = js.native
    
    /**
      * Return the area of the multipolygon on projected plane.
      */
    def getArea(): Double = js.native
    
    def getCoordinates(opt_right: Boolean): js.Array[js.Array[js.Array[Coordinate]]] = js.native
    
    def getEndss(): js.Array[js.Array[Double]] = js.native
    
    def getFlatInteriorPoints(): js.Array[Double] = js.native
    
    /**
      * Return the interior points as {@link module:ol/geom/MultiPoint multipoint}.
      */
    def getInteriorPoints(): typingsJapgolly.ol.geomMultiPointMod.default = js.native
    
    def getOrientedFlatCoordinates(): js.Array[Double] = js.native
    
    /**
      * Return the polygon at the specified index.
      */
    def getPolygon(index: Double): typingsJapgolly.ol.geomPolygonMod.default = js.native
    
    /**
      * Return the polygons of this multipolygon.
      */
    def getPolygons(): js.Array[typingsJapgolly.ol.geomPolygonMod.default] = js.native
  }
}
