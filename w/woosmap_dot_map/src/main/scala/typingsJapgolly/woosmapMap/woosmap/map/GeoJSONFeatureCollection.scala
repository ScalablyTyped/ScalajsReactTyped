package typingsJapgolly.woosmapMap.woosmap.map

import typingsJapgolly.woosmapMap.woosmapMapStrings.FeatureCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONFeatureCollection extends StObject {
  
  var features: js.Array[GeoJSONFeature]
  
  var `type`: FeatureCollection
}
object GeoJSONFeatureCollection {
  
  inline def apply(features: js.Array[GeoJSONFeature]): GeoJSONFeatureCollection = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FeatureCollection")
    __obj.asInstanceOf[GeoJSONFeatureCollection]
  }
  
  extension [Self <: GeoJSONFeatureCollection](x: Self) {
    
    inline def setFeatures(value: js.Array[GeoJSONFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesVarargs(value: GeoJSONFeature*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setType(value: FeatureCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
