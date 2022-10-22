package typingsJapgolly.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureData extends StObject {
  
  var geometry: js.UndefOr[GeometryClasses | LatLng | LatLngLiteral] = js.undefined
  
  var id: js.UndefOr[Any] = js.undefined
  
  var properties: js.UndefOr[js.Object] = js.undefined
}
object FeatureData {
  
  inline def apply(): FeatureData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeatureData]
  }
  
  extension [Self <: FeatureData](x: Self) {
    
    inline def setGeometry(value: GeometryClasses | LatLng | LatLngLiteral): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setId(value: Any): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setProperties(value: js.Object): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
