package typingsJapgolly.ol

import typingsJapgolly.geojson.mod.Feature
import typingsJapgolly.geojson.mod.FeatureCollection
import typingsJapgolly.geojson.mod.GeoJsonProperties
import typingsJapgolly.geojson.mod.Geometry
import typingsJapgolly.geojson.mod.GeometryCollection
import typingsJapgolly.geojson.mod.LineString
import typingsJapgolly.geojson.mod.MultiLineString
import typingsJapgolly.geojson.mod.MultiPoint
import typingsJapgolly.geojson.mod.MultiPolygon
import typingsJapgolly.geojson.mod.Point
import typingsJapgolly.geojson.mod.Polygon
import typingsJapgolly.ol.formatFeatureMod.ReadOptions
import typingsJapgolly.ol.projMod.ProjectionLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatGeoJSONMod {
  
  @JSImport("ol/format/GeoJSON", JSImport.Default)
  @js.native
  open class default () extends GeoJSON {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait GeoJSON
    extends typingsJapgolly.ol.formatJsonfeatureMod.default {
    
    /* protected */ def readGeometryFromObject(`object`: GeoJSONGeometry): typingsJapgolly.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromObject(`object`: GeoJSONGeometry, opt_options: ReadOptions): typingsJapgolly.ol.geomGeometryMod.default = js.native
  }
  
  type GeoJSONFeature = Feature[Geometry, GeoJsonProperties]
  
  type GeoJSONFeatureCollection = FeatureCollection[Geometry, GeoJsonProperties]
  
  type GeoJSONGeometry = Geometry
  
  type GeoJSONGeometryCollection = GeometryCollection[Geometry]
  
  type GeoJSONLineString = LineString
  
  type GeoJSONMultiLineString = MultiLineString
  
  type GeoJSONMultiPoint = MultiPoint
  
  type GeoJSONMultiPolygon = MultiPolygon
  
  type GeoJSONObject = typingsJapgolly.geojson.mod.GeoJSON
  
  type GeoJSONPoint = Point
  
  type GeoJSONPolygon = Polygon
  
  trait Options extends StObject {
    
    var dataProjection: js.UndefOr[ProjectionLike] = js.undefined
    
    var extractGeometryName: js.UndefOr[Boolean] = js.undefined
    
    var featureProjection: js.UndefOr[ProjectionLike] = js.undefined
    
    var geometryName: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDataProjection(value: ProjectionLike): Self = StObject.set(x, "dataProjection", value.asInstanceOf[js.Any])
      
      inline def setDataProjectionUndefined: Self = StObject.set(x, "dataProjection", js.undefined)
      
      inline def setExtractGeometryName(value: Boolean): Self = StObject.set(x, "extractGeometryName", value.asInstanceOf[js.Any])
      
      inline def setExtractGeometryNameUndefined: Self = StObject.set(x, "extractGeometryName", js.undefined)
      
      inline def setFeatureProjection(value: ProjectionLike): Self = StObject.set(x, "featureProjection", value.asInstanceOf[js.Any])
      
      inline def setFeatureProjectionUndefined: Self = StObject.set(x, "featureProjection", js.undefined)
      
      inline def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
      
      inline def setGeometryNameUndefined: Self = StObject.set(x, "geometryName", js.undefined)
    }
  }
}
