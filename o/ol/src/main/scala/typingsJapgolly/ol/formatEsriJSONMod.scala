package typingsJapgolly.ol

import typingsJapgolly.arcgisRestApi.mod.Feature
import typingsJapgolly.arcgisRestApi.mod.FeatureSet
import typingsJapgolly.arcgisRestApi.mod.Geometry
import typingsJapgolly.arcgisRestApi.mod.HasZM
import typingsJapgolly.arcgisRestApi.mod.Multipoint
import typingsJapgolly.arcgisRestApi.mod.Point
import typingsJapgolly.arcgisRestApi.mod.Polygon
import typingsJapgolly.arcgisRestApi.mod.Polyline
import typingsJapgolly.arcgisRestApi.mod.Position
import typingsJapgolly.arcgisRestApi.mod.SpatialReferenceWkid
import typingsJapgolly.ol.formatFeatureMod.ReadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatEsriJSONMod {
  
  @JSImport("ol/format/EsriJSON", JSImport.Default)
  @js.native
  open class default () extends EsriJSON {
    def this(opt_options: Options) = this()
  }
  
  @js.native
  trait EsriJSON
    extends typingsJapgolly.ol.formatJsonfeatureMod.default {
    
    /* protected */ def readFeatureFromObject(`object`: Any, opt_options: Unit, opt_idField: String): typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default] = js.native
    /* protected */ def readFeatureFromObject(`object`: Any, opt_options: ReadOptions, opt_idField: String): typingsJapgolly.ol.featureMod.default[typingsJapgolly.ol.geomGeometryMod.default] = js.native
    
    /* protected */ def readGeometryFromObject(`object`: EsriJSONGeometry): typingsJapgolly.ol.geomGeometryMod.default = js.native
    /* protected */ def readGeometryFromObject(`object`: EsriJSONGeometry, opt_options: ReadOptions): typingsJapgolly.ol.geomGeometryMod.default = js.native
  }
  
  type EsriJSONFeature = Feature
  
  type EsriJSONFeatureSet = FeatureSet
  
  type EsriJSONGeometry = Geometry
  
  type EsriJSONHasZM = HasZM
  
  trait EsriJSONMultiPolygon extends StObject {
    
    var hasM: js.UndefOr[Boolean] = js.undefined
    
    var hasZ: js.UndefOr[Boolean] = js.undefined
    
    var rings: js.Array[js.Array[js.Array[js.Array[Double]]]]
    
    var spatialReference: js.UndefOr[EsriJSONSpatialReferenceWkid] = js.undefined
  }
  object EsriJSONMultiPolygon {
    
    inline def apply(rings: js.Array[js.Array[js.Array[js.Array[Double]]]]): EsriJSONMultiPolygon = {
      val __obj = js.Dynamic.literal(rings = rings.asInstanceOf[js.Any])
      __obj.asInstanceOf[EsriJSONMultiPolygon]
    }
    
    extension [Self <: EsriJSONMultiPolygon](x: Self) {
      
      inline def setHasM(value: Boolean): Self = StObject.set(x, "hasM", value.asInstanceOf[js.Any])
      
      inline def setHasMUndefined: Self = StObject.set(x, "hasM", js.undefined)
      
      inline def setHasZ(value: Boolean): Self = StObject.set(x, "hasZ", value.asInstanceOf[js.Any])
      
      inline def setHasZUndefined: Self = StObject.set(x, "hasZ", js.undefined)
      
      inline def setRings(value: js.Array[js.Array[js.Array[js.Array[Double]]]]): Self = StObject.set(x, "rings", value.asInstanceOf[js.Any])
      
      inline def setRingsVarargs(value: js.Array[js.Array[js.Array[Double]]]*): Self = StObject.set(x, "rings", js.Array(value*))
      
      inline def setSpatialReference(value: EsriJSONSpatialReferenceWkid): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
      
      inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    }
  }
  
  type EsriJSONMultipoint = Multipoint
  
  type EsriJSONPoint = Point
  
  type EsriJSONPolygon = Polygon
  
  type EsriJSONPolyline = Polyline
  
  type EsriJSONPosition = Position
  
  type EsriJSONSpatialReferenceWkid = SpatialReferenceWkid
  
  trait Options extends StObject {
    
    var geometryName: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setGeometryName(value: String): Self = StObject.set(x, "geometryName", value.asInstanceOf[js.Any])
      
      inline def setGeometryNameUndefined: Self = StObject.set(x, "geometryName", js.undefined)
    }
  }
}
