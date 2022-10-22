package typingsJapgolly.mapboxVectorTile

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.geojson.mod.Feature
import typingsJapgolly.geojson.mod.GeoJsonProperties
import typingsJapgolly.geojson.mod.Geometry
import typingsJapgolly.mapboxVectorTile.mapboxVectorTileInts.`1`
import typingsJapgolly.mapboxVectorTile.mapboxVectorTileInts.`2`
import typingsJapgolly.mapboxVectorTile.mapboxVectorTileInts.`3`
import typingsJapgolly.mapboxVectorTile.mapboxVectorTileStrings.LineString
import typingsJapgolly.mapboxVectorTile.mapboxVectorTileStrings.Point
import typingsJapgolly.mapboxVectorTile.mapboxVectorTileStrings.Polygon
import typingsJapgolly.mapboxVectorTile.mapboxVectorTileStrings.Unknown
import typingsJapgolly.pbf.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mapbox/vector-tile", "VectorTile")
  @js.native
  open class VectorTile protected () extends StObject {
    def this(pbf: ^) = this()
    
    var layers: StringDictionary[VectorTileLayer] = js.native
  }
  
  @JSImport("@mapbox/vector-tile", "VectorTileFeature")
  @js.native
  open class VectorTileFeature () extends StObject {
    
    var bbox: js.UndefOr[js.Function0[js.Tuple4[Double, Double, Double, Double]]] = js.native
    
    var extent: Double = js.native
    
    var id: Double = js.native
    
    def loadGeometry(): js.Array[js.Array[typingsJapgolly.mapboxPointGeometry.mod.^]] = js.native
    
    var properties: StringDictionary[String | Double | Boolean] = js.native
    
    def toGeoJSON(x: Double, y: Double, z: Double): Feature[Geometry, GeoJsonProperties] = js.native
    
    var `type`: `1` | `2` | `3` = js.native
  }
  /* static members */
  object VectorTileFeature {
    
    @JSImport("@mapbox/vector-tile", "VectorTileFeature")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@mapbox/vector-tile", "VectorTileFeature.types")
    @js.native
    def types: js.Tuple4[Unknown, Point, LineString, Polygon] = js.native
    inline def types_=(x: js.Tuple4[Unknown, Point, LineString, Polygon]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("types")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@mapbox/vector-tile", "VectorTileLayer")
  @js.native
  open class VectorTileLayer protected () extends StObject {
    def this(pbf: ^) = this()
    
    var extent: Double = js.native
    
    def feature(featureIndex: Double): VectorTileFeature = js.native
    
    var length: Double = js.native
    
    var name: String = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
}
