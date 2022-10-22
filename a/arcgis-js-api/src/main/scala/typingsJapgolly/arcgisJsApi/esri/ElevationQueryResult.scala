package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationQueryResult
  extends StObject
     with Object {
  
  /**
    * The geometry with sampled z-values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#ElevationQueryResult)
    */
  var geometry: Point | Multipoint | Polyline
  
  /**
    * The value used when there is no data available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#ElevationQueryResult)
    */
  var noDataValue: Double
  
  /**
    * Contains additional information about how the geometry was sampled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#ElevationQueryResult)
    */
  var sampleInfo: js.UndefOr[js.Array[ElevationQueryResultSampleInfo]] = js.undefined
}
object ElevationQueryResult {
  
  inline def apply(
    constructor: js.Function,
    geometry: Point | Multipoint | Polyline,
    hasOwnProperty: PropertyKey => Boolean,
    noDataValue: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ElevationQueryResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), noDataValue = noDataValue.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ElevationQueryResult]
  }
  
  extension [Self <: ElevationQueryResult](x: Self) {
    
    inline def setGeometry(value: Point | Multipoint | Polyline): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setNoDataValue(value: Double): Self = StObject.set(x, "noDataValue", value.asInstanceOf[js.Any])
    
    inline def setSampleInfo(value: js.Array[ElevationQueryResultSampleInfo]): Self = StObject.set(x, "sampleInfo", value.asInstanceOf[js.Any])
    
    inline def setSampleInfoUndefined: Self = StObject.set(x, "sampleInfo", js.undefined)
    
    inline def setSampleInfoVarargs(value: ElevationQueryResultSampleInfo*): Self = StObject.set(x, "sampleInfo", js.Array(value*))
  }
}
