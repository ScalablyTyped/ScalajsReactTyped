package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchSourceFilter
  extends StObject
     with Object {
  
  /**
    * The filter geometry for suggests or search results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#filter)
    */
  var geometry: js.UndefOr[Geometry_] = js.undefined
  
  /**
    * The where clause specified for filtering suggests or search results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Search-SearchSource.html#filter)
    */
  var where: js.UndefOr[String] = js.undefined
}
object SearchSourceFilter {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SearchSourceFilter = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SearchSourceFilter]
  }
  
  extension [Self <: SearchSourceFilter](x: Self) {
    
    inline def setGeometry(value: Geometry_): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
    
    inline def setWhere(value: String): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    inline def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
