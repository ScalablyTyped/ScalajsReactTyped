package typingsJapgolly.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeometryData extends StObject {
  
  var coordinates: Any
  
  var geometries: js.UndefOr[js.Array[GeometryData]] = js.undefined
  
  var `type`: GeometryType
}
object GeometryData {
  
  inline def apply(coordinates: Any, `type`: GeometryType): GeometryData = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeometryData]
  }
  
  extension [Self <: GeometryData](x: Self) {
    
    inline def setCoordinates(value: Any): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setGeometries(value: js.Array[GeometryData]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    inline def setGeometriesUndefined: Self = StObject.set(x, "geometries", js.undefined)
    
    inline def setGeometriesVarargs(value: GeometryData*): Self = StObject.set(x, "geometries", js.Array(value*))
    
    inline def setType(value: GeometryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
