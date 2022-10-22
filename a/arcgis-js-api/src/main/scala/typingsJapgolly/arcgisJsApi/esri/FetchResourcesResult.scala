package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchResourcesResult
  extends StObject
     with Object {
  
  /**
    * The next entry index if the current result set doesn't contain all results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResourcesResult)
    */
  var nextStart: Double
  
  /**
    * The fetched resources.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResourcesResult)
    */
  var resources: js.Array[FetchResource]
  
  /**
    * The total number of results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#FetchResourcesResult)
    */
  var total: Double
}
object FetchResourcesResult {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    nextStart: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    resources: js.Array[FetchResource],
    total: Double
  ): FetchResourcesResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), nextStart = nextStart.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), resources = resources.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchResourcesResult]
  }
  
  extension [Self <: FetchResourcesResult](x: Self) {
    
    inline def setNextStart(value: Double): Self = StObject.set(x, "nextStart", value.asInstanceOf[js.Any])
    
    inline def setResources(value: js.Array[FetchResource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesVarargs(value: FetchResource*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
