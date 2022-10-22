package typingsJapgolly.amapJsApi.anon

import typingsJapgolly.amapJsApi.amapJsApiStrings.GeometryCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geometries
  extends StObject
     with typingsJapgolly.amapJsApi.AMap.GeoJSON.Geometry {
  
  var geometries: js.Array[typingsJapgolly.amapJsApi.AMap.GeoJSON.Geometry]
  
  var `type`: GeometryCollection
}
object Geometries {
  
  inline def apply(geometries: js.Array[typingsJapgolly.amapJsApi.AMap.GeoJSON.Geometry]): Geometries = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("GeometryCollection")
    __obj.asInstanceOf[Geometries]
  }
  
  extension [Self <: Geometries](x: Self) {
    
    inline def setGeometries(value: js.Array[typingsJapgolly.amapJsApi.AMap.GeoJSON.Geometry]): Self = StObject.set(x, "geometries", value.asInstanceOf[js.Any])
    
    inline def setGeometriesVarargs(value: typingsJapgolly.amapJsApi.AMap.GeoJSON.Geometry*): Self = StObject.set(x, "geometries", js.Array(value*))
    
    inline def setType(value: GeometryCollection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
